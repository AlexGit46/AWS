
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Emails {

    public String address;
    
    public AddressType addressType;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public Emails(String address, AddressType addressType) {
		super();
		this.address = address;
		this.addressType = addressType;
	}

	public Emails() {
		super();
	}

	

}
