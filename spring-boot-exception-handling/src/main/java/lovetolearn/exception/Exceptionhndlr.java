package lovetolearn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Exceptionhndlr  extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	public final ResponseEntity<Object> handleGlobalException(Exception ex){
		
		return new ResponseEntity<Object>("i want to handle exception globally",HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(CustomExceptionForGetById.class)
	public final ResponseEntity<Object> handleCustomException(CustomExceptionForGetById ex){
		ErrorDetails er = new ErrorDetails(ex.getMessage(),ex.getDescription());
		return new ResponseEntity<Object>(er,HttpStatus.BAD_REQUEST);
		
		
		
	}
}

