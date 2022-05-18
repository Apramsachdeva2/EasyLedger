package com.ela.models;

public class User {

		private int userId;
		private String firmName;
		private String userName;
		private String password;
		
		private long phone;
		private String email;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int userId, String firmName, String userName, String password, long phone, String email) {
			super();
			this.userId = userId;
			this.firmName = firmName;
			this.userName = userName;
			this.password = password;
			this.phone = phone;
			this.email = email;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", firmName=" + firmName + ", userName=" + userName + ", password=" + password
					+ ", phone=" + phone + ", email=" + email + "]";
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getFirmName() {
			return firmName;
		}
		public void setFirmName(String firmName) {
			this.firmName = firmName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		
		
	}

