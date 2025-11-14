public class Persona{
	protected String nombre;
	protected int edad;
	
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public presentarse() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
	}
}

class Estudiante extends Persona {
	    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando en " + grado + ".");
    }

	public void presentarse() {
    super.presentarse();
    System.out.println("Además, soy estudiante.");
	}
}

	Estudiante e1 = new Estudiante("Maria", 16, "Quinto de secundaria");
	e1.presentarse();
	e1.estudiar();
	


