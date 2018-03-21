package com.iparek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HamburTest {

	@Test
	public void testHambuguesa() {
		Hamburguesa burger = new Hamburguesa();
		assertEquals("1 pan", 1, burger.getPan());
		assertEquals("1 Burguer", 1, burger.getHamburguesa());
		assertEquals("Sin ingrediente 0", false, burger.getIngredientes_pedido(0));
		assertEquals("Sin ingrediente 1", false, burger.getIngredientes_pedido(1));
		assertEquals("Sin ingrediente 2", false, burger.getIngredientes_pedido(2));
		assertEquals("Sin ingrediente 3", false, burger.getIngredientes_pedido(3));
	}

	@Test
	public void testGetPrecio() {
		final float PRECIO_BASE = 1f;

		Hamburguesa burger = new Hamburguesa();
		assertEquals(PRECIO_BASE, burger.getPrecio(), 0.01);

		burger.setIngrediente(0);
		float precio = PRECIO_BASE + Hamburguesa.INGREDIENTES_PRECIOS[0];
		assertEquals(precio, burger.getPrecio(), 0.01);
	}

	@Test
	public void testSetIngrediente() {
		Hamburguesa burger = new Hamburguesa();
		burger.setIngrediente(0);
		assertEquals(true, burger.getIngredientes_pedido(0));

		burger.setIngrediente(0);
		assertEquals(false, burger.getIngredientes_pedido(0));

		burger.setIngrediente(1);
		assertEquals(true, burger.getIngredientes_pedido(1));

		burger.setIngrediente(2);
		assertEquals(true, burger.getIngredientes_pedido(2));

		burger.setIngrediente(3);
		assertEquals(true, burger.getIngredientes_pedido(3));

	}

}
