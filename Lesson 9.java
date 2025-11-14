public class JuegoAdivinanza {

    private int numeroSecreto;
    private int intentos;
    private boolean adivinado;

    public JuegoAdivinanza() {
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // número entre 1 y 100
        intentos = 0;
        adivinado = false;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el número entre 1 y 100");

        while (!adivinado) {
            System.out.print("Escribe tu número: ");
            int numero = scanner.nextInt();
            intentos++;

            if (numero == numeroSecreto) {
                adivinado = true;
                System.out.println("Felicidades! Adivinaste en " + intentos + " intentos.");
            } else if (numero < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }
    }
}