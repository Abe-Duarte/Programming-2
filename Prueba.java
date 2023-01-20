import java.util.Scanner;
public class Prueba {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int edad;
		System.out.print("Ingrese valor:"); // cout << "Ingrese valor:" 
		name = sc.next(); // cin >> name;
		System.out.print("Ingrese su edad: ");
		edad = sc.nextInt();
		System.out.println(name);
		System.out.println(edad);
		System.out.print("El usuario; " + name + " tiene: " + edad);
		// OPERACIONES MATEMATICAS
		System.out.print("Ingrese base: ");
		double base = sc.nextDouble();
		System.out.print("Ingrese el exponente: ");
		double exp = sc.nextDouble();
		double pw = Math.pow(base, exp);
		System.out.print("El total es: " + pw);
		System.out.println("Ingrese un valor: ");
		double Sum_01 = sc.nextDouble();
		System.out.println("Ingrese valor 2: ");
		double Sum_02 = sc.nextDouble();
		double total = Sum_01 + Sum_02;
		System.out.println(total);
	}
}

// COMO METER STRING CON ESPACIOS
// QUE SE PUEDA VISUALIZAR X CANTIDAD DE DECIMALES
// POTENCIAS
// PARA HACER CLS, SE DEBE DE HACER UN SALTO DE LINEA CONSECUTIVO, O UN FOR DE 100 ESPACIOS, POR EJEMPLO.
// ECUACION DE SEGUNDO GRADO
// DECIMALFORMAT