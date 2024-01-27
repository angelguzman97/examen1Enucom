import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreRefaccion;
		String tipoRefaccion;
		float precioRefaccion;
		int cantidad;
		float precioCompra;
		float ganancias;

		Refaccionaria refaccion;

		Scanner lectura = null;

		Implementacion imp = new Implementacion();

		int menuP, subMenu;

		do {
			System.out.println("MENU PRINCIPAl");
			System.out.println("1---LISTAR");
			System.out.println("2---GUARDAR");
			System.out.println("3---EDITAR");
			System.out.println("4---ELIMINAR");
			System.out.println("5---BUSCAR");
			System.out.println("6---SALIR");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {
			case 1:
				imp.listar();
				break;
			case 2:
				try {
					System.out.println("INGRESE EL NOMBRE DE LA REFACCIÓN");
					lectura = new Scanner(System.in);
					nombreRefaccion = lectura.nextLine();

					System.out.println("INGRESE EL TIPO DE REFACCIÓN");
					lectura = new Scanner(System.in);
					tipoRefaccion = lectura.nextLine();

					System.out.println("INGRESE EL PRECIO DE LA REFACCIÓN");
					lectura = new Scanner(System.in);
					precioRefaccion = lectura.nextFloat();

					System.out.println("INGRESE LA CANTIDAD");
					lectura = new Scanner(System.in);
					cantidad = lectura.nextInt();

					System.out.println("INGRESE EL PRECIO DE COMPRA");
					lectura = new Scanner(System.in);
					precioCompra = lectura.nextFloat();

					ganancias = cantidad * precioRefaccion - precioCompra;

					// Guardar
					refaccion = new Refaccionaria(nombreRefaccion, tipoRefaccion, precioRefaccion, cantidad,
							precioCompra, ganancias);
					imp.guardar(refaccion);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR AL GUARDAR " + e.getMessage());
				}
				break;

			case 3:

				System.out.println("INGRESE EL NOMBRE DE LA REFACCIÓN A EDITAR");
				lectura = new Scanner(System.in);
				nombreRefaccion = lectura.nextLine();

				refaccion = imp.buscarNombre(nombreRefaccion);
				if(refaccion != null) {
					do {
						System.out.println("SUBMENU EDITAR");
						System.out.println("1--- CANTIDAD");
						System.out.println("2--- PRECIO DE REFACCIÓN");
						System.out.println("3--- REGRESAR");
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:

							System.out.println("INGRESE LA NUEVA CANTIDAD");
							lectura = new Scanner(System.in);
							cantidad = lectura.nextInt();

							// Actualizar
							refaccion.setCantidad(cantidad);
							imp.editar(nombreRefaccion, refaccion);
							System.out.println("SE EDITÓ CON ÉXITO");

							break;
						case 2:

							System.out.println("INGRESE EL NUEVO PRECIO DE REFACCION");
							lectura = new Scanner(System.in);
							precioRefaccion = lectura.nextFloat();

							// Actualizar
							refaccion.setPrecioCompra(precioRefaccion);
							imp.editar(nombreRefaccion, refaccion);
							System.out.println("SE EDITÓ CON ÉXITO");

							break;

						case 3:
							break;

						}

					} while (subMenu < 3);
				}

				
				break;
			case 4:
				System.out.println("INGRESE EL NOMBRE DE LA REFACCIÓN A ELIMINAR");
				lectura = new Scanner(System.in);
				nombreRefaccion = lectura.nextLine();
				
				refaccion = imp.buscarNombre(nombreRefaccion);
				if(refaccion != null) {

				/// Eliminar
				imp.eliminar(nombreRefaccion);
				System.out.println("SE ELIMINÓ CON ÉXITO");
				break;
				}
				

			case 5:
				System.out.println("INGRESE EL TIPO DE REFACCION A BUSCAR");
				lectura = new Scanner(System.in);
				tipoRefaccion = lectura.nextLine();

				// Buscar ---- *****AQUI YA NO VA EL CASTEO POR QUE NO UTILIZASTE EL OBJECT POR
				// ESO LO QUITE**
				refaccion = imp.buscar(tipoRefaccion);
				break;
			case 6:
				System.out.println("¡GRACIAS! :)");
				break;

			}
		} while (menuP < 6);
	}

}
