package vn.fujinet.sample.domain.model.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.BeanUtils;

import vn.fujinet.sample.domain.model.Person;
import vn.fujinet.sample.infrastructure.entity.PersonEntity;
import vn.fujinet.sample.presentation.dto.PersonDto;

public class PersonConverter {
	public static Person convert(PersonEntity personEntity) {
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate dateOfBirth = LocalDate.parse(personEntity.dob, formatter);
		
		return new Person(personEntity.firstName, personEntity.lastName, dateOfBirth,
				personEntity.address);
	}

	public static PersonDto convert (Person person) {
		PersonDto personDto = new PersonDto();
		BeanUtils.copyProperties(person, personDto);

		personDto.setName(person.getFullName());
		personDto.setAge(person.calculateAge());

		return personDto;
	}
}
