package com.design.patterns.objectmother;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class Invoice {

	private long id;

	private Address address;

	private List<InvoiceItem> items;

}
