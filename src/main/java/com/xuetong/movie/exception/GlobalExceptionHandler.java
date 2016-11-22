package com.xuetong.movie.exception;



import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.xuetong.movie.domain.ErrorInfo;;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = SQLException.class)
    public @ResponseBody 
    ErrorInfo ExceptionHandler(HttpServletRequest request, Exception ex) {
        //TODO: put trace into the logger.debug
        logger.error(ex.toString());
        logger.error(ex.getMessage());
        return new ErrorInfo(request.getRequestURL().toString(), ex);
    }
}
