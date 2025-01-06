package com.kodnest.designpattern.singleton.serialization;

import java.io.Serializable;

public class PrimeMinister implements Serializable {
	private static final long serialVersionUID = 1L;
	private static PrimeMinister pm = null;
    String name = "Modi";
    int age = 75;

    private PrimeMinister() {
    }

    public static PrimeMinister getObject() {
        if (pm == null) {
            pm = new PrimeMinister();
        }
        return pm;
    }

    private Object readResolve() {
        return getObject();
    }
}
