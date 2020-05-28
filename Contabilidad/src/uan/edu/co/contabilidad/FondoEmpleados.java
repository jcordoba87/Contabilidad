package uan.edu.co.contabilidad;

public class FondoEmpleados {

	private static double empleados= 10;
	private static double totalfondempleado = (empleados * Empleados.getSaldo1)/100;
	private static double totalfondempleado2 = (empleados * Empleados.getSaldo2)/100;
	private static double totalfondempleado3 = (empleados * Empleados.getSaldo3)/100;
	private static double totalfondempleado4 = ((Empleados.getSaldo4 + HorasExtrasTotal.getTotaldiurnoc()) * empleados )/100;
	private static double totalfondempleado5 = ((Empleados.getSaldo5 + HorasExtrasTotal.getTotaldiurnocfesttotal()) * empleados )/100;
	
	public static double getEmpleados() {
		return empleados;
	}
	public static void setEmpleados(double empleados) {
		FondoEmpleados.empleados = empleados;
	}
	public static double getTotalempleado() {
		return totalfondempleado;
	}
	public static void setTotalempleado(double totalempleado) {
		FondoEmpleados.totalfondempleado = totalempleado;
	}
	public static double getTotalempleado2() {
		return totalfondempleado2;
	}
	public static void setTotalempleado2(double totalempleado2) {
		FondoEmpleados.totalfondempleado2 = totalempleado2;
	}
	public static double getTotalempleado3() {
		return totalfondempleado3;
	}
	public static void setTotalempleado3(double totalfondempleado3) {
		FondoEmpleados.totalfondempleado3 = totalfondempleado3;
	}
	public static double getTotalempleado4() {
		return totalfondempleado4;
	}
	public static void setTotalempleado4(double totalfondempleado4) {
		FondoEmpleados.totalfondempleado4 = totalfondempleado4;
	}
	public static double getTotalfondempleado5() {
		return totalfondempleado5;
	}
	public static void setTotalfondempleado5(double totalfondempleado5) {
		FondoEmpleados.totalfondempleado5 = totalfondempleado5;
	}
	
	
	
	
	
	
	
}
