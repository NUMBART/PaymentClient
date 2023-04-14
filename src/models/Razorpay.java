package models;

public class Razorpay implements GatewayBehavior {
	@Override
	public PaymentStatus pay(PayMode payMode) {
		// do processing based on paymode input
		return PaymentStatus.SUCCESS;
	}
}
