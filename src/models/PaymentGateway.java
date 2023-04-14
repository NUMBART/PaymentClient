package models;

public class PaymentGateway {
	GatewayBehavior gatewayBehavior;
	PayMode payMode;

	public PaymentGateway(GatewayBehavior gatewayBehavior, PayMode payMode) {
		this.gatewayBehavior = gatewayBehavior;
	}

	PaymentStatus pay(PayMode payMode) {
		return gatewayBehavior.pay(payMode);
	}

}
