package com.iparek.formacion.capitulo3;

public class Hamburguesa {

	private int pan;
	private int hamburguesa;
	private Boolean[] Ingredientes_pedido = new Boolean[4];
	public static final String[] INGREDIENTES_STOCK = { "Tomate", "Lechuga", "Pepinillo", "Queso" };
	public static final float[] INGREDIENTES_PRECIOS = { 0.50f, 0.25f, 0.30f, 0.70f };
	public static final float PRECIO_HAMBUGUESA = (float) 0.70;
	public static final float PRECIO_PAN = (float) 0.30;

	public Hamburguesa() {
		super();
		this.pan = 1;
		this.hamburguesa = 1;
		this.Ingredientes_pedido[0] = false;
		this.Ingredientes_pedido[1] = false;
		this.Ingredientes_pedido[2] = false;
		this.Ingredientes_pedido[3] = false;
	}

	public float getPrecio() {
		float resul = 0f;

		resul += (this.pan * PRECIO_PAN) + (this.hamburguesa * PRECIO_HAMBUGUESA);
		for (int i = 0; i < this.Ingredientes_pedido.length; i++) {
			if (this.Ingredientes_pedido[i]) {
				resul += INGREDIENTES_PRECIOS[i];
			}

		}

		return resul;
	}

	public void setIngrediente(int posicion) {
		this.Ingredientes_pedido[posicion] = !this.Ingredientes_pedido[posicion];
	}

	// Getters
	public int getPan() {
		return pan;
	}

	public int getHamburguesa() {
		return hamburguesa;
	}

	public Boolean getIngredientes_pedido(int posicion) {
		return Ingredientes_pedido[posicion];
	}
}
