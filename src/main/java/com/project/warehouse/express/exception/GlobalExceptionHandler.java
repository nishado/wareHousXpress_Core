package com.project.warehouse.express.exception;

import com.project.warehouse.express.util.mappers.DuplicateEmpCodeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateEmpCodeException.class)
    public ResponseEntity<ErrorResponse> handleDuplicateEmpCodeException(DuplicateEmpCodeException ex) {
        return ResponseEntity
            .status(HttpStatus.CONFLICT)
            .body(new ErrorResponse("Duplicate Employee Code", ex.getMessage()));
    }

    public static class ErrorResponse {
        private String error;
        private String message;

        public ErrorResponse(String error, String message) {
            this.error = error;
            this.message = message;
        }

        public String getError() { return error; }
        public String getMessage() { return message; }
        public void setError(String error) { this.error = error; }
        public void setMessage(String message) { this.message = message; }
    }
}
