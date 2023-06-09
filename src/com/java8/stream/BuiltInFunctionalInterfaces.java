package com.java8.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
	public static void main(String[] args) {
		//Function 
		/*
		 *  @FunctionalInterface
			public interface Function<T, R> {
		
		      R apply(T t);
		
			}
			
			class T2 implements Function{
			 	int apply(int i){
			 		return i*i;
			 	}
			}
			
			T2 o=new T2();
			System.out.println(o.apply(10)); //100
	
	
		 * */
		 Function<String, Integer> func = x -> x.length();
	        System.out.println(func.apply("mkyong"));   // 6
	        
	        ////////////////////////////////////////////////////////////
	        //Supli
	        /*
	         *  * @FunctionalInterface
					public interface Supplier<T> {
						
					    T get();
					}
					
					
					
				    class T3 implements Supplier{
			 			String get(){
			 				return new String("Hii");
			 			}
					}
			
					T3 o=new T3();
					System.out.println(o.get()); //100
	         */
	        
	        Supplier<String> sup = ()-> new String("Jyoti..!");
	        System.out.println(sup.get());
	        
	        /////////////
	        /*
	         *  * @FunctionalInterface
					public interface Consumer<T> {
 						void accept(T t);
 		
					}

					
					
					
				    class T4 implements Consumer{
			 			void accept(String s){
			 				Sysout(s);
			 			}
					}
			
					T4 o=new T4();
					o.accept("SSS"); //SSS
	         */
	        /////////////////////////////
	      
	        	Consumer<String> cus = (s) -> System.out.println(s);
	        	cus.accept("Jyoti Pancholi");
			 			
	        	
	        	/*
	        	 * @FunctionalInterface
					public interface Predicate<T> {
					    boolean test(T t);
					}
					class T5 implements Predicate{
			 			boolean test(int n){
			 				if(n%2==0)
			 					return true;
			 				else
			 					return false;
			 			}
					}
			
					T5 o=new T5();
					Sysout(o.(10)); //true
						        	 * 
	        	 * */
	        	
	        	Predicate<Integer> p= n->n%2==0?true:false;
	        	
	        	System.out.println(p.test(11));
	        	
	        
	}

}
