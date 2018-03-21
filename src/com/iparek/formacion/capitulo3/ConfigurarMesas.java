package com.iparek.formacion.capitulo3;
import java.util.Scanner;

public class ConfigurarMesas {
	public static int patas;
	public static String color;

	public static void main(String[] args) {

		pedirDatos();
		imprimirTikect();

	}

	private static void pedirDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Numero de Patas?");
		patas = sc.nextInt();
		System.out.println("¿Color");
		color = sc.next();

	}

	private static void imprimirTikect() {
		System.out.println("---------------------");
		System.out.println("------Resumen--------");
		System.out.println("---------------------");
		System.out.println("Nº Patas: " + patas + " 2€");
		System.out.println("Color: " + color + " 0€");
		System.out.println("---------------------");
		System.out.println("Precio--------------€");

	}

}
