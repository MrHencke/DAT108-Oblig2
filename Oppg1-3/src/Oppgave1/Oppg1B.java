package Oppgave1;

import java.util.function.BiFunction;

public class Oppg1B {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;		
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
		BiFunction<Integer, Integer, Integer> absoluteDist = (a, b) -> Math.abs(a-b); 
		
		System.out.println(beregn(69, 420, add));
		System.out.println(beregn(69, 420, multiply));
		System.out.println(beregn(69, 420, absoluteDist));
		
	}
	
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> funksjon) {
		return funksjon.apply(a,b);	 
	}

}
