package guru.springframework.msscbeerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e){
        List<String> erroList = new ArrayList<String>();
        e.getConstraintViolations().forEach(error -> erroList.add(error.toString()));
        return new ResponseEntity<>(erroList, HttpStatus.BAD_REQUEST);
    }
}
