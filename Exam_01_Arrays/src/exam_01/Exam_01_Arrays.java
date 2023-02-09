package exam_01;

import java.util.Scanner;

public class Exam_01_Arrays {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean state = true, checked_price = false, checked_quantity = false, checked_discount = false;
		double cheaper = 0, expensive = 0;
		int opc, n = 0, e = 0;
		int[] quantity = new int[1];
		int[] discount = new int[1];
		String[] name = new String[1];
		double[] price = new double[1];
		do {
			System.out.println("[1] Agregar productos");
			System.out.println("[2] Editar productos");
			System.out.println("[3] Listar productos");
			System.out.println("[4] Estadísticas");
			System.out.println("[5] Configuraciones");
			System.out.println("[6] Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("### AGREGAR PRODUCTOS ###");
				System.out.print("Indique la cantidad de productos que quiere ingresar: ");
				n = sc.nextInt();
				name = new String[n];
				price = new double[n];
				quantity = new int[n];
				discount = new int[n];
				for (int i = 0; i < name.length; i++) {
					System.out.print( "[" + (i + 1) + "] " + "Nombre: ");
					name[i] = sc.next();
					System.out.print("[" + (i + 1) + "] " + "Price ($): ");
					// VALIDATION
					do {
						price[i] = sc.nextDouble();
						if (price[i] < 0) {
							System.err.println("Error. You can not introduce negative values");
							System.out.print("[" + (i + 1) + "] " + "Price ($): ");
							checked_price = false; 
						}
						else if (price[i] >= 0) {
							System.out.println("Price accepted");
							checked_price = true;
						}
						else {
							System.err.println("Error, something broke.");
							checked_price = false;
						}
					}
					while (checked_price == false);
					System.out.print( "[" + (i + 1) + "] " + "Quantity: ");
					// VALIDATION
					do {
						quantity[i] = sc.nextInt();
						if (quantity[i] < 0) {
							System.err.println("Error. You can not introduce negative values.");
							System.out.print("[" + (i + 1) + "] Quantity: ");
							checked_quantity = false;
						}
						else if (quantity[i] >= 0) {
							System.out.println("Quantity accepted");
							checked_quantity = true;
						}
						else {
							System.err.println("Error, something broke.");
						}
					}
					while (checked_quantity == false);
					System.out.print( "[" + (i + 1) + "] " + "Discount (0 - 20): ");
					// VALIDATION
					do { 
						discount[i] = sc.nextInt();
						if (discount[i] < 0 || discount[i] > 20) {
							System.err.println("Error. You can only introduce values between 0 and 20");
							checked_discount = false;
							System.out.println("[" + (i + 1) + "] Discount: ");
						}
						else if (discount[i] >= 0 && discount[i] <= 20) {
							System.out.println("Discount accepted");
							checked_discount = true;
						}
						else {
							System.err.println("Error. Something broke.");
							checked_discount = false;
						}
					}
					while (checked_discount == false);
					if (i == 0) {
						expensive = price[i];
						cheaper = price[i];
					}
					if (expensive < price[i]) {
						expensive = price[i];
					}
					if (cheaper > price[i]) {
						cheaper = price[i];
					}
				}
			break;
			case 2:
				System.out.println("### EDITAR PRODUCTOS ###");
				for (int i = 0; i < n; i++) {
					System.out.println("------- Producto " + (i + 1) + " -------");
					System.out.println(name[i]);
					System.out.println(price[i]);
					System.out.println(quantity[i]);
					System.out.println(discount[i]);
				}
				
				System.out.print("Ingrese el numero del producto que quiere editar: ");
				e = sc.nextInt();
				e -= 1;
				System.out.print("[" + (e + 1) + "] Nombre: ");
				name[e] = sc.next();
				System.out.print("[" + (e + 1) + "] Precio: ");
				price[e] = sc.nextDouble();
				System.out.print("[" + (e + 1) + "] Cantidad: ");
				quantity[e] = sc.nextInt();
				System.out.print("[" + (e + 1) + "] Descuento: ");
				discount[e] = sc.nextInt();
			break;
			case 3:
				System.out.println("### LISTAR PRODUCTOS ###");
				for (int i = 0; i < n; i++) {
					System.out.println("------- Producto " + (i + 1) + " -------");
					System.out.println(name[i]);
					System.out.println(price[i]);
					System.out.println(quantity[i]);
					System.out.println(discount[i]);
				}
			break;
			case 4:
				System.out.println("### ESTADISTICAS ###");
				System.out.println("Most expensive product: " + expensive);
				System.out.println("Cheaper product: " + cheaper);
			break;
			
			case 5:
				System.out.println("### CONFIGURACIONES ###");
			break;
			
			case 6:
				System.out.println("### FIN DEL PROGRAMA ###");
				state = false;
			break;
			
			default:
				System.err.println("Error. Solo se aceptan valores entre 1 y 6");
			break;
			}
		}
		while (state == true);
	}
	
}
