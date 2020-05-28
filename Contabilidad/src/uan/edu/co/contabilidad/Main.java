package uan.edu.co.contabilidad;

 //Juan Camilo Cordoba V.
import uan.edu.co.contabilidad.Salud;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
System.out.println("Devengados del empleado 1");	

/* Empleado 1 */
		System.out.println("Saldo del empleado 1: " + Empleados.getSaldo1 +  " con un descuento del 4 porciento en salud " + Salud.getTotalsalud() + " 4 porciento en pension " + Pension.getTotalpension() + " Con el fondo de empleados " + FondoEmpleados.getTotalempleado());
		System.out.println("Total del devengado: " +  + TotalDevengado.a );
		System.out.println("Total de descuentos: " + TotalDescuento.getB());
		System.out.println("Total a pagar: " + TotalPagar.getC());
		
		System.out.println("----------------------------------------");
	
System.out.println("Devengados del empleado 2");		

		/* Empleado 2 */
		System.out.println("Saldo del empleado 2: " + Empleados.getSaldo2 + " con un descuento del 4 porciento en salud " + Salud.getTotalsalud2() + " 4 porciento en pension " + Pension.getTotalpension2() + " Con el fondo de empleados " + FondoEmpleados.getTotalempleado2());
		System.out.println("Total del devengado: " +  + TotalDevengado.b );
		System.out.println("Total de descuentos: " + TotalDescuento.getC());
		System.out.println("Total a pagar: " + TotalPagar.getD());
		
		System.out.println("---------------------------------------");
		
System.out.println("Devengados del empleado 3");		

		/* Empleado 3 */
		System.out.println("Saldo del empleado 3: " + Empleados.getSaldo3 + " con un descuento del 4 porciento en salud " + Salud.getTotalsalud3() + " 4 porciento en pension " + Pension.getTotalpension3() + " Descuento de juez civil " + Prestamos.getJ() + " Con el fondo de empleados " + FondoEmpleados.getTotalempleado3());
		System.out.println("Total del devengado: " +  + TotalDevengado.c );
		System.out.println("Total de descuentos: " + TotalDescuento.getH());
		System.out.println("Total a pagar: " + TotalPagar.getE());
		
System.out.println("-----------------------------------------");
		
/* Empleado 4 */
		System.out.println("Devengados del empleado 4");		
		System.out.println("Saldo del empleado 4: " + Empleados.getSaldo4 + " Con un auxilio de transporte " + AuxilioTransporte.aux + " Horas extras " + HorasExtrasTotal.getTotaldiurnoc() + " Con una comision " + Comisiones.getComisiones() + " con un descuento del 4 porciento en salud " + Salud.getTotalsalud4() + " 4 porciento en pension " + Pension.getTotalpension4() + " Con el fondo de empleados " + FondoEmpleados.getTotalempleado4());
		System.out.println("Total del devengado: " +  + TotalDevengado.d );
		System.out.println("Total de descuentos: " + TotalDescuento.getI());
		System.out.println("Total a pagar: " + TotalPagar.getF());
				
System.out.println("-----------------------------------------");
		
/* Empleado 5 */
				System.out.println("Devengados del empleado 5");		
				System.out.println("Saldo del empleado 5: " + Empleados.getSaldo5 + " Con un auxilio de transporte " + AuxilioTransporte.aux + " Horas extras " + HorasExtrasTotal.getTotaldiurnocfesttotal() + " con un descuento del 4 porciento en salud " + Salud.getTotalsalud5() + " 4 porciento en pension " + Pension.getTotalpension5() + " Con el fondo de empleados " + FondoEmpleados.getTotalfondempleado5());
				System.out.println("Total del devengado: " +  + TotalDevengado.e );
				System.out.println("Total de descuentos: " + TotalDescuento.getJ());
				System.out.println("Total a pagar: " + TotalPagar.getG());
								
		
		

	}

}
