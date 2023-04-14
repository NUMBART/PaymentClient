package models;

public class Flipkart {
	PayMode payMode;
	public PaymentStatus proceedToPayment() {
		System.out.println("Select a payment mode");
		// Scanner sc = new Scanner(System.in);
		// String paymodeString = sc.nextLine();
		PaymodeType paymodeType = PaymodeType.UPI;
		payMode = this.selectPayMode(paymodeType);
		// get PG from Config
		Config config = Config.getConfig();
		GatewayBehavior gatewayBehavior = config.getGateway(paymodeType);
		PaymentGateway paymentGateway = new PaymentGateway(gatewayBehavior, payMode);
		return paymentGateway.pay(payMode);
	}

	PayMode selectPayMode(PaymodeType paymodeType) {
		PayMode.Builder payModeBuilder = PayMode.builder()
				.setPaymodeType(paymodeType);
		// Needs to be changed - use Factory + Builder
		String hardCodedVPA = "abc@ybl";
		PayMode payMode =  payModeBuilder
				.setVpa(hardCodedVPA)
				.build();
		return payMode;
	}
}
