package br.com.refrigeracao.controller.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResponseHandler {

	public ResponseEntity<String> errorUnexpected(String message) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
	}
	
	public ResponseEntity<Object> created(Object obj) {
		return ResponseEntity.status(HttpStatus.CREATED).body(obj);
	}
	
	public ResponseEntity<String> deleted() {
		return ResponseEntity.ok().body("Object has been deleted");
	}
	
	public ResponseEntity<String> updated() {
		return ResponseEntity.ok().body("Object has been updated");
	}
}
