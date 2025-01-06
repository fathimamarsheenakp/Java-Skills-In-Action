package com.kodnest.selectiveserialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	String name;
	int id;
	double salary;
	String password;
	
	public Employee() {
		
	}
	
	public Employee(String name, int id, double salary, String password) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.password = password;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(id);
		out.writeDouble(salary);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		id = in.readInt();
		salary = in.readDouble();
	}
	
	
}
