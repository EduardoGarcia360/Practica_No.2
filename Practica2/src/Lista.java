
public class Lista {
	
	Nodo inicio, fin;
	int tamaño=0;
	public Lista(){
		inicio=fin=null;
		
	}
	
	//PARA SABER SI ESTA VACIA
		public boolean Vacia(){
			return inicio==null;
		}
		
	//AGREGAR AL INICIO
	public void AgregarInicio(String elemento){
		inicio=new Nodo(elemento, inicio); //creando Nodo
		if(fin==null){
			fin=inicio;
		}
		tamaño = tamaño+1;
	}
	
	//AGREGAR AL FINAL
	public void AgregarFinal(String elemento){
		if(Vacia()){
			inicio=fin = new Nodo(elemento);
		}else{
			fin.siguiente = new Nodo(elemento);
			fin = fin.siguiente;
		}
		tamaño = tamaño+1;
	}
	
	//BUSCAR EN LA LISTA
	public boolean Buscar(String elemento){
		Nodo temporal = inicio;
		while(temporal!=null && temporal.dato!=elemento){
			temporal = temporal.siguiente;
		}
		return temporal!=null;
	}
	
	
	
	//TAMAÑO DE LA LISTA
	public void Tamaño(){
		System.out.println("El tamaño de la lista actualmente es de: " + tamaño);
	}
	
	
	
	//MOSTRAR DATOS
	
	//MOSTRAR ELEMENTOS
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
		System.out.println("Los datos en la lista son: ");
		System.out.println(mLista + "||");
		System.out.println();
		}
	}

	
	
	
}
