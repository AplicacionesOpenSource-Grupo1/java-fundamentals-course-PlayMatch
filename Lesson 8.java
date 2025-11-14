class Estudiante{
	String nombre;
	int edad;
	
	public Estudiante(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarInfo(){
		System.out.println(nombre + " tiene " + edad " años.");
	}
}


Estudiante[] estudiantes = new Estudiante[3];

estudiantes[0] = new Estudiante("Lucia", 16);

estudiantes[1] = new Estudiante("Jose", 25);

estudiantes[2] = new Estudiante("Ana", 19);

for (Estudiante e: estudiantes){
	e.mostrarInfo();
}
