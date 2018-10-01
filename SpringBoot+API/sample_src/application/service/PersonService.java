package vn.fujinet.sample.application.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fujinet.sample.domain.model.Person;
import vn.fujinet.sample.domain.model.converter.PersonConverter;
import vn.fujinet.sample.infrastructure.repository.PersonRepository;
import vn.fujinet.sample.presentation.dto.PersonDto;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;

	public List<PersonDto> getChildren() {
		List<Person> persons = personRepository.selectAllPerson().getChildren();

		return persons.stream()
				.map(PersonConverter::convert)
				.collect(Collectors.toList());
	}

	public List<PersonDto> getAdult() {
		List<Person> persons = personRepository.selectAllPerson().getAdult();

		return persons.stream()
				.map(PersonConverter::convert)
				.collect(Collectors.toList());
	}
}