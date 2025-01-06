package com.kodnest.designpattern.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialPrimeMinister {

    public static void main(String[] args) {
        try {
            PrimeMinister pm = PrimeMinister.getObject();
            System.out.println(pm.name + " " + pm.age);
            System.out.println("Hashcode: " + pm.hashCode());

            FileOutputStream fos = new FileOutputStream("PrimeMinister.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(pm);
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
