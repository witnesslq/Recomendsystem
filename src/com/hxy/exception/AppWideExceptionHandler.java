package com.hxy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public String notFoundexceptionHandler() {
		return "notFound";
	}
}
