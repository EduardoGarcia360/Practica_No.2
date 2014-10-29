
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Lista list = new Lista();
		int opcion=0;
		String ele="", busca="";
		
		do{
			System.out.println("----------MENU----------\n"
					+ "1. Agregar al Inicio.\n"
					+ "2. Agregar al Final.\n"
					+ "3. Mostrar Elementos\n"
					+ "4. Tamaño de la Lista.\n"
					+ "5. Buscar.\n"
					+ "6. Agregar en Posicion.\n"
					+ "7. Obtener Posicion\n"
					+ "8. Eliminar Posicion\n"
					+ "9. Salir");
			Scanner o = new Scanner(System.in);
			opcion=o.nextInt();
			
			switch(opcion){
			case 1:
				System.out.print("Ingrese el elemento: ");
				Scanner ai = new Scanner(System.in);
				ele=ai.next();
				list.AgregarInicio(ele);
				break;
			case 2:
				System.out.print("Ingrese el elemento: ");
				Scanner af = new Scanner(System.in);
				ele=af.next();
				list.AgregarFinal(ele);
				break;
			case 3:
				list.Imprimir();
				break;
			case 4:
				list.Tamaño();
				break;
			case 5:
				System.out.print("Ingrese la busqueda: ");
				Scanner abu = new Scanner(System.in);
				busca=abu.next();
				if(list.Buscar(busca)){
					System.out.println("El elemento "+busca+" fue encontrado.");
				}else{
					System.out.println("El elemento "+busca+" no fue encontrado.");
				}
				break;
			case 6:
				if(list.Vacia()){
					System.out.println("Lista Vacia");
				}else{
					System.out.println("----Ingresar en posicion----\n"
							+ "Tome en cuenta que las posiciones estan dadas de la siguiente manera.\n"
							+ "[1]->[2]->[3]->...->[n]->||\n"
							+ "Ingrese una posicion a modificar: ");
					Scanner po = new Scanner(System.in);
					int posicion = po.nextInt();
					list.AgregarPosicion(posicion);
				}
				break;
			case 7:
				if(list.Vacia()){
					System.out.println("Lista Vacia");
				}else{
					System.out.println("----Obtener posicion----\n"
							+ "Tome en cuenta que las posiciones estan dadas de la siguiente manera.\n"
							+ "[1]->[2]->[3]->...->[n]->||\n"
							+ "Ingrese una posicion a mostrar: ");
					Scanner po = new Scanner(System.in);
					int posicion = po.nextInt();
					list.Obtener(posicion);
				}
				break;
			case 8:
				if(list.Vacia()){
					System.out.println("Lista Vacia");
				}else{
					System.out.println("----Eliminar posicion----\n"
							+ "Tome en cuenta que las posiciones estan dadas de la siguiente manera.\n"
							+ "[1]->[2]->[3]->...->[n]->||\n"
							+ "Ingrese una posicion para eliminar: ");
					Scanner po = new Scanner(System.in);
					int posicion = po.nextInt();
					list.Eliminar(posicion);
				}
				break;
			}
		}while(opcion!=9);

	}

}
