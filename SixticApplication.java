package com.SIXTIC.SIXTIC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class SixticApplication {

	public static void main(String[] args) {
		SpringApplication.run(SixticApplication.class, args);

		/*CLASE EMPRESA*/
		Scanner input1 = new Scanner(System.in);
		String nombreEmpresa,direccionEmpresa,telefonoEmpresa, NIT;
		System.out.print("Nombre de la empresa   : ");
		nombreEmpresa = String.valueOf(input1.nextLine());
		System.out.print("Direccion de la empresa: ");
		direccionEmpresa = String.valueOf(input1.nextLine());
		System.out.print("Telefono empresa       : ");
		telefonoEmpresa = String.valueOf(input1.nextLine());
		System.out.print("NIT de la empresa      : ");
		NIT = String.valueOf(input1.nextLine());

		Empresa e = new Empresa(nombreEmpresa,direccionEmpresa,telefonoEmpresa,NIT);

		System.out.println("--------------------------------------------------------------");
		System.out.println("Nombre de la empresa   : "+nombreEmpresa);
		System.out.println("Direccion de la empresa: "+direccionEmpresa);
		System.out.println("Telefono de la empresa : "+telefonoEmpresa);
		System.out.println("NIT de la empresa      : "+NIT);
		System.out.println("==============================================================");

		/*CLASE EMPLEADO*/
		Scanner input2 = new Scanner(System.in);
		String nombreEmpleado, correoEmpleado, empresaEmpleado, rollEmpleado;
		System.out.print("Nombre del empleado: ");
		nombreEmpleado = String.valueOf(input2.nextLine());
		System.out.print("Correo             :");
		correoEmpleado = String.valueOf(input2.nextLine());
		System.out.print("Empresa empleado   : ");
		empresaEmpleado = String.valueOf(input2.nextLine());
		System.out.print("Roll empleado      : ");
		rollEmpleado = String.valueOf(input2.nextLine());

		Empleado x = new Empleado(nombreEmpleado, correoEmpleado, empresaEmpleado, rollEmpleado);

		System.out.println("--------------------------------------------------------------");
		System.out.println("Nombre del empleado: "+nombreEmpleado);
		System.out.println("Correo             : "+correoEmpleado);
		System.out.println("Empresa empleado   : "+empresaEmpleado);
		System.out.println("Roll empleado      : "+rollEmpleado);
		System.out.println("==============================================================");

		/*CLASE MDinero*/
		Scanner input3 = new Scanner(System.in);
		int montoMovimiento;
		System.out.print("Monto del movimiento             : ");
		montoMovimiento = Integer.parseInt(input3.nextLine());
		String usuarioMovimiento;
		System.out.print("Usuario que realizo el movimiento: ");
		usuarioMovimiento = String.valueOf(input3.nextLine());
		System.out.println("--------------------------------------------------------------");

		MDinero y = new MDinero(montoMovimiento,usuarioMovimiento);

			if (montoMovimiento > 0) {
				System.out.print("Concepto del movimiento    : Consignacion");
			}
			else{
				if(montoMovimiento < 0){
					System.out.print("Concepto del movimiento          : Retiro");
			}
			}

		System.out.print("\nMonto del movimiento             : "+montoMovimiento);
		System.out.print("\nUsuario que realizo el movimiento: "+usuarioMovimiento);
		System.out.println("\n========================= END =================================");
	}

}
