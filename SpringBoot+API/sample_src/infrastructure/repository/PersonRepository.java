package vn.fujinet.sample.infrastructure.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.fujinet.sample.domain.model.Person;
import vn.fujinet.sample.domain.model.PersonList;
import vn.fujinet.sample.domain.model.converter.PersonConverter;
import vn.fujinet.sample.infrastructure.dao.PersonDao;

@Repository
public class PersonRepository {
	@Autowired
	private PersonDao personDto;
		
	public PersonList selectAllPerson() {
		List<Person> allPerson = personDto.selectAll().stream()
				.map(PersonConverter::convert)
				.collect(Collectors.toList());
		PersonList persons = new PersonList();
		persons.addAll(allPerson);

		return persons;
	}
}