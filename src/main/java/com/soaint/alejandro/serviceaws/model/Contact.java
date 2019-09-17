package com.soaint.alejandro.serviceaws.model;

public class Contact {	

		private String first;

		private String last;

		private String address;


		public String getFirst() {
			return first;
		}

		public void setFirst(String first) {
			this.first = first;
		}

		public String getLast() {
			return last;
		}

		public void setLast(String last) {
			this.last = last;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Contact(String first, String last, String address) {
			super();
			this.first = first;
			this.last = last;
			this.address = address;
		}

		public Contact() {
			super();
		}
		
		

		
	}
