package com.iparek.formacion.capitulo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pedido {
	static int posicion;
	static boolean añadir;

	public static void main(String[] args) {
		Hamburguesa burger = new Hamburguesa();
		pedirDatos(burger);
		System.out.println("Su pedido es de: " + burger.getPrecio() + " €");
	}

	private static void pedirDatos(Hamburguesa burger) {
		posicion = 0;
		Scanner sc = new Scanner(System.in);
		int tope = Hamburguesa.INGREDIENTES_STOCK.length;
		for (int i = 0; i < tope; i++) {
			try {
				System.out.println("¿Quieres " + Hamburguesa.INGREDIENTES_STOCK[posicion] + " a "
						+ Hamburguesa.INGREDIENTES_PRECIOS[posicion] + " €?");
				añadir = sc.nextBoolean();
				if (añadir) {
					burger.setIngrediente(posicion);
				}
				reset();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input!");
				i--;
				break;
			}

		}
	}

	private static void reset() {
		posicion++;
		añadir = false;

	}

}
