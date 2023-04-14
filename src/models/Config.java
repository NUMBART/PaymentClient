package models;

import java.util.HashMap;

public class Config {
	private HashMap<PaymodeType, GatewayBehavior> config;
	private static Config instance;

	private Config() {
		config = new HashMap<>();
	}

	public static Config getConfig() {
		if(instance == null) instance = new Config();
		return instance;
	}

	public GatewayBehavior getGateway(PaymodeType paymodeType) {
		return config.get(paymodeType);
	}

	public void setGateway(PaymodeType paymodeType, GatewayBehavior gatewayBehavior) {
		config.put(paymodeType, gatewayBehavior);
	}
}
