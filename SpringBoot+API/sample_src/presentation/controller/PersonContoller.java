package vn.fujinet.sample.presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.fujinet.sample.application.service.PersonService;
import vn.fujinet.sample.presentation.dto.PersonDto;

@RestController
@RequestMapping("/person")
public class PersonContoller {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "children", method = RequestMethod.GET)
	public ResponseEntity<List<PersonDto>> getChildren() {
		return new ResponseEntity<List<PersonDto>>(personService.getChildren(), HttpStatus.OK);
	}

	@RequestMapping(value = "adult", method = RequestMethod.GET)
	public ResponseEntity<List<PersonDto>> getAdult() {
		return new ResponseEntity<List<PersonDto>>(personService.getAdult(), HttpStatus.OK);
	}
}
