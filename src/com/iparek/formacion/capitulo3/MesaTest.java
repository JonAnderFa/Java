package com.iparek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MesaTest {

	@Test
	public void testMesa() {
		Mesa mesa = new Mesa();
		assertEquals("Patas 4 por defecto", 4, mesa.getNumeroPatas());
		assertEquals("blanco", mesa.getColor());
		assertEquals(1, mesa.getDimension());
		assertEquals(Mesa.MATERIAL_MADERA, mesa.getMaterial());
	}

	@Test
	public void testMesaInt() {
		final int MATERIAL_NO_EXISTENTE = -1;
		Mesa mesa = new Mesa(MATERIAL_NO_EXISTENTE);
		assertEquals(MATERIAL_NO_EXISTENTE, mesa.getMaterial());

		Mesa mesa2 = new Mesa(Mesa.MATERIAL_ACERO);
		assertEquals(Mesa.MATERIAL_ACERO, mesa2.getMaterial());
	}

	@Test
	public void testSetNumeroPatas() {
		Mesa mesa = new Mesa();

		mesa.setNumeroPatas(5);
		assertEquals(5, mesa.getNumeroPatas());

		mesa.setNumeroPatas(0);
		assertEquals(1, mesa.getNumeroPatas());

		mesa.setNumeroPatas(-5);
		assertEquals(1, mesa.getNumeroPatas());
	}

	@Test
	public void testGetPrecio() {
		final int PRECIO_BASE = 13;
		Mesa mesa = new Mesa();
		assertEquals(13, mesa.getPrecio());

		mesa.setColor(Mesa.PRECIO_COLOR_NAME_CUSTOM);
		assertEquals((PRECIO_BASE + Mesa.PRECIO_COLOR_CUSTOM), mesa.getPrecio());

		mesa.setColor("rojo");
		assertEquals(PRECIO_BASE, mesa.getPrecio());

		mesa.setMaterial(mesa.MATERIAL_ACERO);
		int precio = PRECIO_BASE - Mesa.PRECIO_MATERIAL_MADERA + mesa.PRECIO_MATERIAL_ACERO;
		assertEquals(precio, mesa.getPrecio());

		// TODO Probar resto de materiales

		mesa = new Mesa();
		int nuevaDimension = 5;
		mesa.setDimension(nuevaDimension);
		precio = PRECIO_BASE + (mesa.PRECIO_M2 * mesa.getDimension()) - mesa.PRECIO_M2;
		assertEquals(precio, mesa.getPrecio());

		nuevaDimension = 0;
		mesa.setDimension(nuevaDimension);
		precio = PRECIO_BASE + (mesa.PRECIO_M2 * mesa.getDimension()) - mesa.PRECIO_M2;
		assertEquals("Precio 0", precio, mesa.getPrecio());

		nuevaDimension = -5;
		mesa.setDimension(nuevaDimension);
		precio = PRECIO_BASE + (mesa.PRECIO_M2 * mesa.getDimension()) - mesa.PRECIO_M2;
		assertEquals("Precio -5", precio, mesa.getPrecio());

	}

}
