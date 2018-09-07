package Clase3;

public class Persona {
	private String nombre;
	private String apellido;
	private Pais pais;
	public Persona(String nombre, String apellido, Pais pais) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return this.apellido;
	}
}
