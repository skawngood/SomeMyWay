package com.smm.domain;

public class ZipcodeVO {
		private String zipcode;
		
		private String address1;

		public String getZipcode() {
			return zipcode;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		public String getAddress1() {
			return address1;
		}


		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		
		@Override
		public String toString() {
			return "ZipcodeVO [zipcode=" + zipcode + ", address1=" + address1 + "]";
		}
		
		
}


