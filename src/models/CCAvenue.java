package models;

public class CCAvenue implements GatewayBehavior {
	@Override
	public PaymentStatus pay(PayMode payMode) {
		return PaymentStatus.SUCCESS;
	}
}
