package com.iparek.formacion.capitulo3;

public class EjercicioMesas {

	public static void main(String[] args) {
		System.out.println("Listado de Mesas");
		System.out.println("-----------------");

		Mesa m1 = new Mesa();
		Mesa mIzaskun = new Mesa(8, 6, "negro", Mesa.MATERIAL_MADERA);
		Mesa mMikel = new Mesa(2, 5, "verde", 1);
		Mesa mAingeru = new Mesa(5, 7, "platino", 2);
		Mesa mJoseba = new Mesa(3, 5, "amarillo", 3);
		Mesa mAnder = new Mesa(1, 2, "custom", 4);

		// System.out.println(m1.precio());
		System.out.println(m1.getPrecio());
		System.out.println("Precio Izaskun");
		System.out.println(mIzaskun.getPrecio());
		System.out.println("Precio Mikel");
		System.out.println(mMikel.getPrecio());
		System.out.println("Precio Aingeru");
		System.out.println(mAingeru.getPrecio());
		System.out.println("Precio Joseba");
		System.out.println(mJoseba.getPrecio());
		System.out.println("Precio Ander");
		System.out.println(mAnder.getPrecio());

	}

}
