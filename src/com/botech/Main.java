package com.botech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero: ");
	    int entrada = scanner.nextInt();
	    int quantDiv = 0;
	    for (int i = 1; i <= entrada; i++) {
	        if (entrada % i == 0) {
	            System.out.println(entrada + ", divisivel por: " + i);
	            quantDiv++;
            }
        }
	    if (quantDiv == 2) {
			System.out.println(entrada + ", numero primo");
		} else {
			System.out.println(entrada + ", numero nao-primo");
		}
    }
}
