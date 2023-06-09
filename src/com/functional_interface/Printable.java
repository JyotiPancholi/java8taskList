package com.functional_interface;

interface SAM_Interfaces {
	void print(String msg);
}
public class Printable {
		public static void main(String[] args) {
			SAM_Interfaces sam = (msg) -> System.out.println(msg);
			sam.print("hello functional interface....");
			sam.print("This MSG is printed by lembda expression....!");
		}

}
