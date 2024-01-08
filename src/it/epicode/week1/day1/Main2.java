package it.epicode.week1.day1;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		int a = 70;
		int b = 10;
		int result = multiply(a, b);
		System.out.println(result);
		
		System.out.println(concat("Il numero e:", 6));
		
		String[] arr = insertIntoArray(new String[]{"A", "B", "C", "D", "E"}, "");
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static String concat(String str, int num) {
		return str + num;
	}
	
	public static String[] insertIntoArray(String[] stringArray, String str) {
		String[] array = new String[6];
		for (int i = 0; i < stringArray.length +1 ; i++) {
			if(i < 2) {
				array[i] = stringArray[i];
			} else if(i == 2) {
				array[i] = str;
			} else {
				array[i] = stringArray[i - 1];
			}
		}
		
		return array;
	}

}
