package com.kodnest.designpattern.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialPrimeMinister {

    public static void main(String[] args) {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("PrimeMinister.txt"));
            PrimeMinister pm = (PrimeMinister) os.readObject();
            System.out.println(pm.name + " " + pm.age);
            System.out.println("Hashcode: " + pm.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
