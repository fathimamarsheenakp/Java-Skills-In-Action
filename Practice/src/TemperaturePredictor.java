package com.kodnest.practice.revision;

public class TemperaturePredictor {
	String predict(int temperature) {
		if (temperature < 0) {
			return "The temperature " + temperature + " is categorized as Freezing.";
			
        } else if (temperature >= 0 && temperature <= 15) {
			return "The temperature " + temperature + " is categorized as Cold.";
			
        } else if (temperature >= 16 && temperature <= 25) {
			return "The temperature " + temperature + " is categorized as Moderate.";
			
        } else if (temperature >= 26 && temperature <= 35) {
			return "The temperature " + temperature + " is categorized as Warm.";
			
        } else {
			return "The temperature " + temperature + " is catagorized as Hot.";
        }
	}

}
