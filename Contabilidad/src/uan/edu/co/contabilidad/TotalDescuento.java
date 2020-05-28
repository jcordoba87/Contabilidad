package uan.edu.co.contabilidad;

public class TotalDescuento {

	private static double b = Salud.getTotalsalud() + Pension.getTotalpension() + FondoEmpleados.getTotalempleado();
	private static double c = Salud.getTotalsalud2() + Pension.getTotalpension2() + FondoEmpleados.getTotalempleado2();
	private static double h = Salud.getTotalsalud3() + Pension.getTotalpension3() + Prestamos.getJ() + FondoEmpleados.getTotalempleado3();
	private static double i = Salud.getTotalsalud4() + Pension.getTotalpension4() + FondoEmpleados.getTotalempleado4();
	private static double j = Salud.getTotalsalud5() + Pension.getTotalpension5() + FondoEmpleados.getTotalfondempleado5();
	
	public static double getB() {
		return b;
	}

	public static void setB(double b) {
		TotalDescuento.b = b;
	}

	public static double getC() {
		return c;
	}

	public static void setC(double c) {
		TotalDescuento.c = c;
	}

	public static double getH() {
		return h;
	}

	public static void setH(double h) {
		TotalDescuento.h = h;
	}

	public static double getI() {
		return i;
	}

	public static void setI(double i) {
		TotalDescuento.i = i;
	}

	public static double getJ() {
		return j;
	}

	public static void setJ(double j) {
		TotalDescuento.j = j;
	}
	
	
	
	
	
	
	
	
	
	
	
}
