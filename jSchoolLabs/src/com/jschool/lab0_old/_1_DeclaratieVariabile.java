package com.jschool.lab0_old;

public class _1_DeclaratieVariabile {
	
	
	public static void main(String args[]) {		
		stareSanatateDog();
	}
	
	public static void stareSanatateDog() {
		byte virsta1 = 1;
		short nrPaduchi1 = 1000;
		int nrPaduchi2 = 100000;
		long nrPaduchi3 = 1000000000;
		float virsta2 = 2.3f;
		double virsta3 = 3.4;
		String la = "La";
		String dog = "Bobik";
		boolean sanatos = true;
		boolean bolnav = false;
		char c = '╚';
		
		// TODO: inc and dec la fiecare variabila
		
		// TODO: afiseaza fiecare var inc si dec
		
		System.out.println(la + " virsta de " + virsta1 + " an " + dog
				+ " avea " + nrPaduchi1 + " paduchi. ");
		System.out.println(la + " virsta de " + virsta2 + " ani " + dog
				+ " avea " + nrPaduchi2 + " paduchi. ");
		System.out.println(la + " virsta de " + virsta3 + " ani " + dog
				+ " avea " + nrPaduchi3 + " paduchi. ");
		if (nrPaduchi3 <= 0 && nrPaduchi2 <= 0 && nrPaduchi1 <= 0) {
			System.out
					.println(dog + " este sanatos? " + " Raspuns: " + sanatos);
		} else {
			System.out.println(dog + " este sanatos? " + " Raspuns: " + bolnav);

		}
	}	
	
}
