package models;

public class PayMode {
	String username;
	String password;
	String vpa;
	PaymodeType paymodeType;

	private PayMode(PaymodeType paymodeType, String username, String password, String vpa) {
		this.username = username;
		this.password = password;
		this.vpa = vpa;
		this.paymodeType = paymodeType;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		String username;
		String password;
		String vpa;
		PaymodeType paymodeType;

		public Builder setPaymodeType(PaymodeType paymodeType) {
			this.paymodeType = paymodeType;
			return this;
		}

		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder setVpa(String vpa) {
			this.vpa = vpa;
			return this;
		}

		public PayMode build() {
			// validation logic
			return new PayMode(paymodeType, username, password, vpa);
		}
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getVpa() {
		return vpa;
	}

	public PaymodeType getPaymodeType() {
		return paymodeType;
	}
}
