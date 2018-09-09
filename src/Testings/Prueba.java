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
				if (Matriz[i][j] == aPalabra[0]) {
					busquedaHorizontal(x,y,i,j,aPalabra,ubicaciones);
					busquedaVertical(p,q,i,j,aPalabra,ubicaciones);
					busquedaDiagonal(a,b,x,y,i,j,aPalabra,ubicaciones);
				}
			}
		}
		return ubicaciones;
	}
	
	private void busquedaDiagonal(int a, int b, int x, int y, int i, int j, 
			char[] aPalabra,ArrayList<Ubicacion> ubicaciones) {
		int k=0;
		boolean diagCheck= false;
		while (a < Matriz.length && b < Matriz.length && a < x + aPalabra.length && b < y + aPalabra.length && !diagCheck) {
			if(Matriz[a][b] == aPalabra[k]) {
				k++;
				if(k == aPalabra.length) {
					diagCheck = true;
					Ubicacion ub = new Ubicacion(i,j,"Diagonal");
					ubicaciones.add(ub);
				}
			}
			a++;
			b++;
		}
		
	}
	private void busquedaVertical(int p, int q, int i, int j, char[] aPalabra, 
			ArrayList<Ubicacion> ubicaciones) {
		int k=0;
		boolean verCheck = false;
		while (p < Matriz.length &&  p < i + aPalabra.length && !verCheck) {
			if(Matriz[p][q] == aPalabra[k] ) {
				k++;
				if(k == aPalabra.length) {
					verCheck = true;
					Ubicacion ub = new Ubicacion(i,j,"Vertical");
					ubicaciones.add(ub);
				}
			}
			p++;
		}
		
	}
	private void busquedaHorizontal(int x,int y, int i, int j, char[] aPalabra, 
			ArrayList<Ubicacion> ubicaciones) {
		int k=0;
		boolean horCheck = false;
		while (y < Matriz.length && y < j + aPalabra.length && !horCheck) {
			if(Matriz[x][y] == aPalabra[k] ) {
				k++;
				if(k == aPalabra.length) {
					horCheck = true;
					Ubicacion ub = new Ubicacion(i,j,"Horizontal");
					ubicaciones.add(ub);
				}
			}
			y++;
		}
	}
}
