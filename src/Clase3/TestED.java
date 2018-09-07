package Clase3;

public class TestED {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("AAA","111", Pais.values()[0]);
		Persona p2 = new Persona("BBB","222", Pais.ARGENTINA);
		Persona p3 = new Persona("CCC","333", Pais.ESTADOS_UNIDOS);
		Persona p4 = new Persona("DDD","444", Pais.UGANDA);
		
		
		Persona[] aPersonas = new Persona[5]; //vamos a tener un array de 5 elementos.
		Persona[] aPersonas2 = new Persona[]{p1,p2,p3,p4};
		int[] aEnteros = new int[50];
		
		for (int i = 0; i < aEnteros.length; i++) {
			System.out.println(aEnteros[i]);
		}
		
		for (int i = 0; i < aPersonas.length; i++) {
			System.out.println(aPersonas[i].toString());
		}
		
		for (int i = 0; i < aPersonas2.length; i++) {
			System.out.println(aPersonas2[i].toString());
		}
		

	}	
}
