package com.example.userservice.Exception;

import com.example.userservice.Payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException e){
      String message = e.getMessage();
      ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        ApiResponse response=null;
        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
