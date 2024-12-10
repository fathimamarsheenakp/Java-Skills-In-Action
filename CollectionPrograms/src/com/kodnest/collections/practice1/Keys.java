package com.kodnest.collections.practice1;

public class Keys {

	int k;

	public Keys(int k) {
		super();
		this.k = k;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return k + "";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.hashCode(k);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Keys ref = (Keys) obj;
		if (this.k == ref.k) {
			return true;
		} 
		return false;
	}
}
