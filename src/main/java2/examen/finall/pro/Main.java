package examen.finall.pro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		Scanner Lector1 = new Scanner(System.in);
		
		int opcion =0 ;
		String marca = "";
		String modelo = "";
		int anioFabricacion = 0;
		String placa ="";
		double kilometraje = 0;
		
		
		int numVehiculo = 5;
		
		Auto Vehiculo[] = new Auto[numVehiculo];
		
		System.out.println("Bienvendos a AMBACAR");
		System.out.println("====================");
		
		do {
		
		System.out.println("CONCERSIONARIO AMBACAR Elija una opcion: ");
		System.out.println("1. Ingresar Auto");
		System.out.println("2. Consultar  Auto");
		System.out.println("3. Actualizar Kilometraje");
		System.out.println("4. Imprimir reporte");
		System.out.println("5. SALIR");
		opcion  = Lector.nextInt();
		
		
		
		if(opcion == 1) {
			
			String opc ="";
		do {
			
			
			
			System.out.println("a. Auto Nacional");
			System.out.println("b. Auto Importado");
			System.out.println("c. Salir");	
			opc = Lector1.nextLine();
			
			if (opc.equals("a")) {
				
				int i = 0; ; 
				i++;
				Auto auto = new Auto(marca, modelo, anioFabricacion, placa, kilometraje);
				Vehiculo[i] = auto;
				
				System.out.println("Ingrese la marca del auto: ");
				marca = Lector1.nextLine();
				
				System.out.println("Ingrese la modelo del auto: ");
				modelo = Lector1.nextLine();
				
				System.out.println("Ingrese la año fabricacion  del auto: ");
				anioFabricacion = Lector.nextInt();
				
				System.out.println("Ingrese la placa del auto: ");
				placa = Lector1.nextLine();
				
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
				marca = Lector1.nextLine();
				
				System.out.println("Ingrese la modelo del auto: ");
				modelo = Lector1.nextLine();
				
				System.out.println("Ingrese la año fabricacion  del auto: ");
				anioFabricacion = Lector.nextInt();
				
				System.out.println("Ingrese la placa del auto: ");
				placa = Lector1.nextLine();
				
				System.out.println("Ingrese la kilometraje del auto: ");
				kilometraje = Lector.nextDouble();
				
				System.out.println("Ingrese codigo importacion:  ");
				String codigo = Lector1.nextLine();
				
				System.out.println("Ingrese codigo importacion:  ");
				double valorImportacion = Lector.nextDouble();
				
				auto.setMarca(marca);
				auto.setModelo(modelo);
				auto.setAnioFabricacion(anioFabricacion);
				auto.setPlaca(placa);
				auto.setKilometraje(kilometraje);
				
			}
			
			
		}while(opc.equals("c"));
			
		}else if(opcion == 2) {
			
			System.out.println("Ingrese el nro de placa: ");
			placa = Lector.nextLine();
			
			for (int i = 0; i < Vehiculo.length; i++) {
				Auto auto = Vehiculo[i];
				boolean encontar = auto.getPlaca().contains(placa);
				if (encontar == true) {
					
					System.out.println(Vehiculo[i]);
					
				}
				
			System.out.println("El auto con esta placa no existe en la base de datos");
			}
		}else if(opcion == 3) {
			
			System.out.println("Ingrese el nro de placa: ");
			placa = Lector.nextLine();
			
			
			for (int i = 0; i < Vehiculo.length; i++) {
				Auto auto = Vehiculo[i];
				boolean encontar = auto.getPlaca().contains(placa);
				if (encontar == true) {
				auto.getKilometraje();
				System.out.println("Ingrese el nuevo Kilometraje: ");
				kilometraje = Lector.nextDouble();
				auto.setKilometraje(kilometraje);
					
				}
				Vehiculo[i] = auto;
				
			System.out.println("El auto con esta placa no existe en la base de datos");
			}
			
			
		}else if(opcion== 4) {
			
	
			System.out.println("================================");
			System.out.println("Reporte de Autos");
			System.out.println("de Menor a Mayor: ");
			Arrays.sort(Vehiculo);
			System.out.println(Arrays.toString(Vehiculo));
			
			
		}

		}while(opcion !=5);
		

	}

}
