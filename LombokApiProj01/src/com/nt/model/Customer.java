package com.nt.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {

	private int cno;
	private String cname;
	private String caddress;
	private int billAmnt;
	private long billNum;
}
