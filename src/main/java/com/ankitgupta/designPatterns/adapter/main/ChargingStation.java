package com.ankitgupta.designPatterns.adapter.main;

import com.ankitgupta.designPatterns.adapter.charger.Charger;
import com.ankitgupta.designPatterns.adapter.charger.ThreePinChargeAdapter;
import com.ankitgupta.designPatterns.adapter.charger.ThreePinCharger;
import com.ankitgupta.designPatterns.adapter.charger.TwoPinChargeAdapter;
import com.ankitgupta.designPatterns.adapter.charger.TwoPinCharger;

public class ChargingStation {

	public static void main(String[] args) {
		TwoPinCharger twoPinCharger = new TwoPinCharger();
		Charger twoPinChargerAdapter = new TwoPinChargeAdapter(twoPinCharger);
		twoPinChargerAdapter.chargePhone();
		
		ThreePinCharger threePinCharger = new ThreePinCharger();
		Charger threePinChargerAdapter = new ThreePinChargeAdapter(threePinCharger);
		threePinChargerAdapter.chargePhone();
	}
	
}
