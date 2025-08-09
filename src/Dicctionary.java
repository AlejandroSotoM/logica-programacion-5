import java.sql.SQLOutput;
import java.util.*;

public class Dicctionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> palabras = new HashMap<>();

        //Agregar las 20 palabras clave-valor
        palabras.put("Jugar", "play");
        palabras.put("Dormir", "sleep");
        palabras.put("Cocinar", "cook");
        palabras.put("Estudiar", "study");
        palabras.put("Ver", "see");
        palabras.put("Caminar", "walk");
        palabras.put("Comer", "eat");
        palabras.put("Trabajar", "work");
        palabras.put("Correr", "run");
        palabras.put("Tomar", "drink");
        palabras.put("Barrer", "sweep");
        palabras.put("Sol", "sun");
        palabras.put("Ventana", "window");
        palabras.put("Puerta", "door");
        palabras.put("Casa", "house");
        palabras.put("Cuarto", "room");
        palabras.put("Cuchara", "spoon");
        palabras.put("Cuchillo", "knife");
        palabras.put("Botella", "bottle");
        palabras.put("Plato", "plate");

        Random random = new Random();
        List<String> numeros = new ArrayList<>(palabras.keySet());

        System.out.println(" -------------------------------------- \n" +
                           " \t TRADUCE LAS SIGUIENTES PALABRAS\n" +
                           "---------------------------------------");

        for (int i = 1; i <= 5; i++) {
            int aleatorio = random.nextInt(numeros.size());
            String palabra = numeros.get(aleatorio);
            String traduccion;
            do {
                System.out.println("Escribe la traduccion al ingles:");
                System.out.printf(palabra + " : ");
                traduccion = scanner.nextLine();
                if(!palabras.get(palabra).toLowerCase().equals(traduccion.toLowerCase().trim())){
                    System.out.println("----------INCORRECTO----------\n");
                }
            } while (!palabras.get(palabra).toLowerCase().equals(traduccion.toLowerCase().trim()));
            System.out.println("----------CORRECTO----------\n");
        }
        System.out.println("\n\n=======================================================");
        System.out.println("          Felicidades has traducido correctamente         ");
        System.out.println("=======================================================");

    }
}
