package org.qcy.entity;

public class User {
		String name;
		String psw;
		
		public User() {
			super();
		}
		public User(String name, String psw) {
			super();
			this.name = name;
			this.psw = psw;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPsw() {
			return psw;
		}
		public void setPsw(String psw) {
			this.psw = psw;
		}
		
}
