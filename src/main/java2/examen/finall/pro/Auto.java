package examen.finall.pro;

public class Auto {
	
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private String placa;
	private double kilometraje;
	
	// 	CONSTRUCTOR
	public Auto(String marca, String modelo, int anioFabricacion, String placa, double kilometraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.placa = placa;
		this.kilometraje = kilometraje;
		
	}
	// METODOS SET Y GET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	@Override
	public String toString() {
		return "[Marca=" + marca + ", Modelo=" + modelo + ", Placa=" + placa + ", Kilometraje=" + kilometraje+ "]";
	}
	
	

}
