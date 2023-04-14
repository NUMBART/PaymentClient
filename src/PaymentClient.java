import models.*;

public class PaymentClient {
	public static void main(String[] args) {
		Config config = Config.getConfig();
		config.setGateway(PaymodeType.UPI, new Razorpay());
		config.setGateway(PaymodeType.NETBANKING, new CCAvenue());

		Flipkart flipkart = new Flipkart();
		PaymentStatus paymentStatus = flipkart.proceedToPayment();
		System.out.println("Payment Status: "+ paymentStatus);
	}
}
