package com.hcl.fault;

public class MissingName extends Exception {
	public MissingName(){
		super("Your name is required.");
	}

}
