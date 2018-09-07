package Testings;
import java.util.ArrayList;
public class Prueba {
	char [][] Matriz;

	public Prueba() {
		this.Matriz = new char [15][15];
	}
	public Prueba(char[][] matriz) {
		this.Matriz = matriz;
	}
	public ArrayList<Ubicacion> encontrarPalabra(String palabra) {		
		char [] aPalabra = palabra.toCharArray();
		int k = 0;
		boolean horCheck = false, verCheck = false, diagCheck = false;
		ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
		int x = 0, y = 0, p = 0, q = 0 , a = 0, b = 0;
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz[0].length; j++) {
				x = i;
				y = j;
				p = i;
				q = j;
				a = i;
				b = j;
				if (Matriz[i][j] == aPalabra[k]) {
					while (y < Matriz.length && y < j + aPalabra.length && horCheck == false) {
						if(Matriz[x][y] == aPalabra[k] ) {
							k++;
							if(k == aPalabra.length) {
								horCheck = true;
								Ubicacion ub = new Ubicacion(i,j,"Horizontal");
								ubicaciones.add(ub);
							}
						}
						else {
							k = 0;
						}
						y++;
					}
					k = 0;
					while (p < Matriz.length &&  p < i + aPalabra.length && verCheck == false) {
						if(Matriz[p][q] == aPalabra[k] ) {
							k++;
							if(k == aPalabra.length) {
								verCheck = true;
								Ubicacion ub = new Ubicacion(i,j,"Vertical");
								ubicaciones.add(ub);
							}
						}
						else
						{
							k = 0;
						}
						p++;
					}
					k = 0;
					while (a < Matriz.length && b < Matriz.length && a < x + aPalabra.length && b < y + aPalabra.length && diagCheck == false) {
						if(Matriz[a][b] == aPalabra[k]) {
							k++;
							if(k == aPalabra.length) {
								diagCheck = true;
								Ubicacion ub = new Ubicacion(i,j,"Diagonal");
								ubicaciones.add(ub);
							}
						}
						else
						{
							k = 0;
						}
						a++;
						b++;
					}
					k = 0;
					horCheck = false;
					verCheck = false;
					diagCheck = false;
				}
			}
		}
		return ubicaciones;
	}
}
