package examen.finall.pro;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		
		int opcion =0 ;
		String marca = "";
		String modelo = "";
		int anioFabricacion = 0;
		String placa ="";
		double kilometraje = 0;
		
		
		int numVehiculo = 10;
		
		Auto Vehiculo[] = new Auto[numVehiculo];
		
		System.out.println("Bienvendos a AMBACAR");
		
		do {
		
		System.out.println("CONCERSIONARIO AMBACAR Elija una opcion: ");
		System.out.println("1. Ingresar Auto");
		System.out.println("2. Consultar  Auto");
		System.out.println("3. Actualizar Kilometraje");
		System.out.println("4. Imprimir reporte");
		System.out.println("5. SALIR");
		
		
		if(opcion == 1) {
			
			String opc ="";
		do {
			
			
			
			System.out.println("a. Auto Nacional");
			System.out.println("b. Auto Importado");
			
			if (opc.equals("a")) {
				
				int i = 0; ; 
				i++;
				Auto auto = new Auto(marca, modelo, anioFabricacion, placa, kilometraje);
				Vehiculo[i] = auto;
				
				System.out.println("Ingrese la marca del auto: ");
				marca = Lector.nextLine();
				
				System.out.println("Ingrese la modelo del auto: ");
				modelo = Lector.nextLine();
				
				System.out.println("Ingrese la año fabricacion  del auto: ");
				anioFabricacion = Lector.nextInt();
				
				System.out.println("Ingrese la placa del auto: ");
				placa = Lector.nextLine();
				
				System.out.println("Ingrese la kilometraje del auto: ");
				kilometraje = Lector.nextDouble();
				
				System.out.println("Ingrese codigo nacional:  ");
				String codigo = Lector.nextLine();
				
				auto.setMarca(marca);
				auto.setModelo(modelo);
				auto.setAnioFabricacion(anioFabricacion);
				auto.setPlaca(placa);
				auto.setKilometraje(kilometraje);
				
				
			}else if (opc.equals("b")) {
				
				int i = 0; ; 
				i++;
				Auto auto = new Auto(marca, modelo, anioFabricacion, placa, kilometraje);
				Vehiculo[i] = auto;
				
				System.out.println("Ingrese la marca del auto: ");
				marca = Lector.nextLine();
				
				System.out.println("Ingrese la modelo del auto: ");
				modelo = Lector.nextLine();
				
				System.out.println("Ingrese la año fabricacion  del auto: ");
				anioFabricacion = Lector.nextInt();
				
				System.out.println("Ingrese la placa del auto: ");
				placa = Lector.nextLine();
				
				System.out.println("Ingrese la kilometraje del auto: ");
				kilometraje = Lector.nextDouble();
				
				System.out.println("Ingrese codigo nacional:  ");
				String codigo = Lector.nextLine();
				
				auto.setMarca(marca);
				auto.setModelo(modelo);
				auto.setAnioFabricacion(anioFabricacion);
				auto.setPlaca(placa);
				auto.setKilometraje(kilometraje);
				
				
				
			}
			
			
		}while(opc.equals("c"));
			
			
			

			
			
		}else if(opcion == 2) {
			
			
		}else if(opcion == 3) {
			
			
		}else if(opcion== 4) {
			
			
		}

		}while(opcion !=5);
		

	}

}
