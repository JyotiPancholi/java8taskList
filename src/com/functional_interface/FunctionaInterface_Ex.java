package com.functional_interface;

//function interface using @functionalinterface annotation
@FunctionalInterface
interface Sayable{  
    void saySomeThing(String msg);   // abstract method  
//    void talk(String msg);   // abstract method   

}  
public class FunctionaInterface_Ex {

	public static void main(String[] args) {
		Sayable say =  (msg) -> System.out.println(msg);
		say.saySomeThing("hello there.... this is Jyoti PAncholi !");
	}
}
