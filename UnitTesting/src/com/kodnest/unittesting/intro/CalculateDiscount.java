package com.kodnest.unittesting.intro;

public class CalculateDiscount {

    // Method to calculate the discounted price
    public static double calculateDiscountedPrice(double amount) {

        if (amount > 5000) {
            // 20% discount
            return roundToTwoDecimals(amount * 0.8);
        } else if (amount > 2000) {
            // 10% discount
            return roundToTwoDecimals(amount * 0.9);
        } else {
            // No discount
            return roundToTwoDecimals(amount);
        }
    }

    // Helper method to round to two decimal places
    public static double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double amount = 3500; // Example input
        double discountedPrice = calculateDiscountedPrice(amount);
        System.out.println("The discounted price is: " + discountedPrice);
    }
}




