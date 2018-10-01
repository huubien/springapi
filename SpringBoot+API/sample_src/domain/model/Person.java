package vn.fujinet.sample.domain.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.util.StringUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import vn.fujinet.sample.constant.SpecialCharacter;

@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String address;

	public String getAddress() {
		return address;
	}

	public int calculateAge() {
		return Period.between(dob, LocalDate.now()).getYears();
	}

	public String getFullName() {
		if (StringUtils.isEmpty(firstName) && StringUtils.isEmpty(lastName)) {
			return SpecialCharacter.EMPTY;
		}

		if (StringUtils.isEmpty(lastName)) {
			return firstName;
		}

		if (StringUtils.isEmpty(firstName)) {
			return lastName;
		}

		return firstName.concat(SpecialCharacter.SPACE).concat(lastName);
	}
}
