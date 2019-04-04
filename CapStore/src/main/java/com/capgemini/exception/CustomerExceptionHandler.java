package com.capgemini.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler extends ResponseEntityExceptionHandler{
	
	/*
	 * This Method will handle the Exception of type 
	 * ProductNotFoundException.
	 */
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<Object> handleCustomerNotFoundException(CustomerNotFoundException e)
	{
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	/*
	 * This Method will handle the Exception of type 
	 * DuplicateProductIdException.
	 */
	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<Object> handleInvalidInputException(InvalidInputException e)
	{
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		return new ResponseEntity<>(e.getBindingResult().getAllErrors().get(0).getDefaultMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}   
}
	
