package com.design.patterns.objectmother;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Address {

	private String street;

	private String houseNumber;

	private String zipCode;

	private String city;

	private String country;
}
