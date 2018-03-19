package com.iparek.formacion.capitulo3;

public class EjercicioMesas {

	public static void main(String[] args) {
		System.out.println("Listado de Mesas");
		System.out.println("-----------------");

		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa();
		Mesa m3 = new Mesa();

		m1.setNumeroPatas(8);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

	}

}
