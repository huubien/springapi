package vn.fujinet.sample.domain.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList {

	private List<Person> persons;

	private Comparator<Person> personComparator = Comparator.comparingInt(Person::calculateAge);

	public PersonList() {
		persons = new ArrayList<Person>();
	}

	public void addAll(List<Person> persons) {
		this.persons.addAll(persons);
	}

	public List<Person> getChildren() {
		return persons.stream()
				.filter(e -> e.calculateAge() < 18)
				.sorted(personComparator)
				.collect(Collectors.toList());
	}

	public List<Person> getAdult() {
		return persons.stream()
				.filter(e -> e.calculateAge() >= 18)
				.sorted(personComparator)
				.collect(Collectors.toList());
	}
}
