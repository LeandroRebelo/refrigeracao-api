package br.com.refrigeracao.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.refrigeracao.controller.handlers.ResponseHandler;
import br.com.refrigeracao.entity.City;
import br.com.refrigeracao.service.itrf.CityService;

@RestController
@RequestMapping(value = "/city")
public class CityController {

	@Autowired
	private CityService<City> cityService;

	@Autowired
	private ResponseHandler responseHandler;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getCities() {
		try {
			return ResponseEntity.ok(cityService.getAll());
		} catch (Exception e) {
			return responseHandler.errorUnexpected(e.getMessage());
		}
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody City city) {
		try {
			return responseHandler.created(cityService.save(city));
		} catch (Exception e) {
			return responseHandler.errorUnexpected(e.getMessage());
		}
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public ResponseEntity<?> update(@PathVariable("id") UUID id, @RequestBody City city) {
		try {
			city.setId(id);
			cityService.save(city);
			return responseHandler.updated();
		} catch (Exception e) {
			return responseHandler.errorUnexpected(e.getMessage());
		}
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	private ResponseEntity<?> delete(@PathVariable("id") UUID id) {
		try {
			cityService.delete(id);
			return responseHandler.deleted();
		} catch (Exception e) {
			return responseHandler.errorUnexpected(e.getMessage());
		}
	}
}
