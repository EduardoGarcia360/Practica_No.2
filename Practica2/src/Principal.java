package listas;


import java.io.BufferedReader;
import java.io.FileReader;



public class Principal {
	private static int clase3;


	public static void main(String[] args) {
		Lista lista=new Lista();
		
		try {
			FileReader fr=new FileReader("archivo.txt");
			BufferedReader br=new BufferedReader(fr);
			String cadena="", pos="";
			while ((cadena=br.readLine()) != null) {
				
				
					if (cadena.indexOf("estacion ")!=-1){
						System.out.println(cadena);
						pos=cadena.substring(6, 8);
						clase3=Integer.parseInt(pos);
					}
					if (cadena.indexOf("suben ")!=-1){
						System.out.println(cadena);
						
					}	
					
					if (cadena.indexOf("bajan ")!=-1){
						System.out.println(cadena);
						
					}	
						
			}
		} catch (Exception e) {
			
			
		}
			
lista.Agregar(clase3);
	}

}
