import java.util.Scanner;
public class Lista {
	
	Nodo inicio, fin;
	
	public Lista(){
		inicio=fin=null;
	}
	
	
	//Agregar un Nodo (al inicio)
	public void Agregar(String elemento){
		inicio=new Nodo(elemento, inicio); //creando Nodo
		if(fin==null){
			fin=inicio;
		}
	}
	
	//Para saber si la lista esta vacia.
	public boolean Vacia(){
		if(inicio==null){
			return true; //si el inicio es NULL entonces 'Sí' esta vacia.
		}else{
			return false; //si el incio apunta a un Nodo entonces 'No' esta vacia.
		}
	}

	
	//Buscar en la lista
	public boolean Buscar(String elemento){
		Nodo temporal = inicio;
		while(temporal!=null && temporal.dato!=elemento){
			temporal = temporal.siguiente;
		}
		return temporal!=null;
		
	}
	
	//Modificar dato en especifico
		public void Modificar(){
			Nodo temporal = inicio;
			Nodo anterior = null;
			if(Vacia()){
				System.out.println("Lista Vacia");
			}else{
				System.out.println("Nodo a modificar: ");
				Scanner u = new Scanner(System.in);
				String modificar = u.next();
				
				if(Buscar(modificar)){
					System.out.println("----Dato no encontrado----");
				}else{
					System.out.println("----Dato encontrado----");
					System.out.println("Ingrese el nuevo dato: ");
					Scanner n = new Scanner(System.in);
					String nuevo = n.next();
					temporal=temporal.siguiente;
					temporal.dato=nuevo;
					System.out.println("----Dato Reemplazado----");
				}
			}
		}
	
	//Mostrar datos en pantalla.
	public void Imprimir(){
		String mLista="";
		Nodo recorrer=inicio;
		if(recorrer == null){
			System.out.print("La lista esta vacia, empieza ingresando un dato.");
			System.out.println();
		}else{
			
		while(recorrer!=null){
			mLista=mLista + "["+recorrer.dato+"]-->";
			recorrer = recorrer.siguiente;
		}
		System.out.println(mLista + "||");
		System.out.println();
		}
	}


	
	//Eliminar dato en especifico
	public void Eliminar() {
		Nodo temporal=inicio;
		Nodo anterior=null;
		boolean encontrado=false;
		
		if(Vacia()){
			System.out.println("Lista vacia");
		}else{
			System.out.println("Nodo a eliminar: ");
			Scanner o=new Scanner (System.in);
			String eliminar=o.next();
			
			if(Buscar(eliminar)){
				System.out.println("----Dato no encontrado----");
			}else{
				System.out.println("----Dato encontrado----");
				while(temporal!=null && encontrado == false){
					encontrado = eliminar.equals(temporal.dato);
					if(encontrado == false){
						anterior = temporal;
						temporal = temporal.siguiente;
					}
				}
				
				if(temporal!=null){
					if(temporal == inicio){
						inicio = temporal.siguiente;
					}else{
						anterior.siguiente = temporal.siguiente;
					}
				}
			System.out.println("Nodo Eliminado con exito");
			}
			
		}
		
	}//fin eliminar
CREO QUE YA PUDE..HAHAHAHAHAHA	
}
