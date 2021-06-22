import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[])   {

        //Create a new scanner
        Scanner reader = new Scanner(System.in);

        //Ask name
        System.out.println("Ingresa un nombre");
        String name = reader.nextLine();

        //Ask last name
        System.out.println("Ingresa un apellido");
        String lstName = reader.nextLine();

        //Print info
        System.out.println("Hola mi nombre es: " + name + "\nMi apellido es: " + lstName);
    }
}
