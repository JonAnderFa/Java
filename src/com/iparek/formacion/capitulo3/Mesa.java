//Definicion package
package com.iparek.formacion.capitulo3;
//Import => ahora mismo no tenemos ninguno

//Definicion Clase
public class Mesa {

	// precio en �
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINO = 3;
	final int MATERIAL_PLASTICO = 4;

	// Atributos siempre en private para mantener la encapsulacion
	private int numeroPatas;
	private int dimension; // metros cuadrados
	private String color;
	private int material;

	/*
	 * Metodos Constructores Getters y setters Otros Metodos
	 */

	// Constructor Vacio
	/*
	 * POr defecto las mesas tienen 4 patas blancas 1m2 y de madera
	 */
	public Mesa() {
		super();
		this.setNumeroPatas(4);
		this.setDimension(1);
		this.setColor("blanco");
		this.setMaterial(1);
	}

	// Constructor con atributos
	public Mesa(int numeroPatas, int dimension, String color, int material) {
		super();
		this.setNumeroPatas(numeroPatas);
		this.setDimension(dimension);
		this.setColor(color);
		this.setMaterial(material);
	}

	// Getter
	public int getNumeroPatas() {
		return numeroPatas;
	}

	public int getDimension() {
		return dimension;
	}

	public String getColor() {
		return color;
	}

	public int getMaterial() {
		return material;
	}

	// Setter
	/**
	 * Sirve para documentar con JavaDoc
	 * 
	 * @author Jon Ander
	 * @param numeroPatas
	 *            en caso de ser negativo se inicializa en 0
	 */
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	public void setDimension(int dimension) {
		this.dimension = (dimension < 0) ? 0 : dimension;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Sirve para que material en caso de no pasarle bien los argumentos inserte
	 * madera
	 * 
	 * @param material
	 *            1 Madera 2 Acero 3 Aluminio 4 Plastico
	 */
	public void setMaterial(int material) {
		if (material > 0 || material <= 4) {
			this.material = material;
		} else {
			this.material = 1;
		}
	}

	// Otros metodos
	@Override
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

	public String precio() {
		int precio = 0;
		// Empezamos sumando las patas
		precio = precio + (getNumeroPatas() * PRECIO_PATA);
		// Sumamos las dimensiones
		precio = precio + (getDimension() * PRECIO_M2);
		// color
		if (getColor() == PRECIO_COLOR_NAME_CUSTOM) {
			precio = precio + PRECIO_COLOR_CUSTOM;

		}
		// Material
		String mate = "";
		int material = this.getMaterial();
		switch (material) {
		case 1: {
			precio = precio + PRECIO_MATERIAL_MADERA;
			mate = "Madera";
			break;
		}
		case 2: {
			precio = precio + PRECIO_MATERIAL_ACERO;
			mate = "Acero";
			break;
		}
		case 3: {
			precio = precio + PRECIO_MATERIAL_ALUMINIO;
			mate = "Aluminio";
			break;
		}
		case 4: {
			precio = precio + PRECIO_MATERIAL_PLASTICO;
			mate = "Platisco";

			break;
		}

		}

		return "El precio total de su mesa de " + getNumeroPatas() + " patas , de " + getDimension() + " m2 y de "
				+ mate + " es de: " + precio + "�";
	}

}
