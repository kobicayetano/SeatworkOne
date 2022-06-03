package com.activity.one;
import com.activity.one.util.ClassC;

public class  MainClass{
	

	public void printClassA(){
		ClassA a  = new ClassA();
		System.out.println("The value is " + a.bool);
	}//end printClassA

	public void printClassB(){
		ClassB b  = new ClassB();
		for(int i=0; i<b.days.length; i++){
			System.out.println("["+i+"] = "+ b.days[i]);
		}
	}//end printClassB

	public int printClassC(){
		int variableToPass = 9;
		ClassC c = new ClassC();
		c.printVal(variableToPass);
		int result = variableToPass;
		
		return result;
	}//end printClassC

	public static void main(String args[]){
		ClassA aInstance = new ClassA();
		MainClass mc  = new MainClass();
		
		if(aInstance.bool){
			System.out.println("True");
		}else{
			System.out.println("False");
		}

		mc.printClassA();
		mc.printClassB();
		mc.printClassC();
	}//end main

}//end MainClass