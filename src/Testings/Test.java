package Testings;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matriz ={ 
			{'a','b','c','d','e','a','u','t','o','j','k','l','m','n','o'},
			{'a','b','c','d','e','u','u','h','i','j','k','l','m','n','o'},
			{'a','b','c','d','e','t','g','t','i','j','k','l','m','n','o'},
			{'a','b','c','d','e','o','g','h','o','j','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','a','i','j','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','h','u','j','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','h','i','t','k','l','m','n','o'},
			{'a','b','c','d','e','f','g','h','i','j','o','l','m','n','o'},
			{'a','b','c','a','u','t','o','h','i','j','k','l','m','n','o'},
			{'a','b','a','u','t','o','g','h','i','j','a','u','t','n','o'},
			{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'},
			};
		Prueba pbr1 = new Prueba(matriz);
		ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
		ubicaciones = pbr1.encontrarPalabra("auto");
		for (Ubicacion ubicacion : ubicaciones) {
			System.out.println("x: " + ubicacion.posX + " y: " + ubicacion.posY + " sentido: " + ubicacion.sentido);
		}
	}

	
}
