int edad = 19;
	if (edad >= 18) {
    	System.out.println("Eres mayor de edad");
	} else {
   	 System.out.println("Eres menor de edad");
	}
	
	
for (int i = 1; i < 6; i++) {
System.out.println("Número: " + i + "   ");
}

	int contador = 1;
	while (contador <= 3) {
   	 System.out.println("Contando: " + contador);
   	 contador++;
	}
	

	boolean condicion = true;
	
	while(condicion == true){
	for(int i = 1; i < 9;i++){
		if (i / 2 == 4){
			System.out.println(i);
			condicion = false;
			}
		}
	}