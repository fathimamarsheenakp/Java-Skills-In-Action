package com.kodnest.practice.revision;

import java.util.Scanner;

public class PredictTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        
        TemperaturePredictor temp = new TemperaturePredictor();
        System.out.println(temp.predict(temperature));

	}

}
