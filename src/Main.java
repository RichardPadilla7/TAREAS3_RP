//Richard Padilla
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        int edad;
        double salario;

        Scanner ingresar = new Scanner(System.in);

        //Objetos con valores quemados
        Empleado empleado1 = new Empleado("Richard", 27, 450.0);
        System.out.println("--- Datos Quemados ---");
        empleado1.Empleado1();

        //Pedir datos atravez de Scanner
        System.out.println("--- DATOS INGRESADOS ---");
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = ingresar.nextLine();
        System.out.println("Ingrese la edad del empleado: ");
        edad = ingresar.nextInt();
        System.out.println("Ingrese el salario del empleado: ");
        salario = ingresar.nextDouble();

        //nuevo objeto con los datos ingresados
        Empleado empleado2 = new Empleado(nombre, edad, salario);
        System.out.println("--- Datos Ingresados ---");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());

    }

}