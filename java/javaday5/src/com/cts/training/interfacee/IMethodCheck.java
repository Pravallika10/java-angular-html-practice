package com.cts.training.interfacee;

public interface IMethodCheck {
	default public void fun() {
		System.out.println("Fun of interface");
	}


	public static void sfun() {
		System.out.println("SFun of interface");
	}

}
