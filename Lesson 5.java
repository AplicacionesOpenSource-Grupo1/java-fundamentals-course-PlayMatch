	public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void atender() {
        System.out.println(nombre + " está estudiando.");
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Gian", 18);
        e1.atender();
    }
}
