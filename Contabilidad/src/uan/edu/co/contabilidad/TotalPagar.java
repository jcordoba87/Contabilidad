package uan.edu.co.contabilidad;

public class TotalPagar {
	
	private static double c = TotalDevengado.a - TotalDescuento.getB();
	private static double d = TotalDevengado.b - TotalDescuento.getC();
	private static double e = TotalDevengado.c - TotalDescuento.getH();
	private static double f = TotalDevengado.d - TotalDescuento.getI();
	private static double g = TotalDevengado.e - TotalDescuento.getJ();
	

	public static double getC() {
		return c;
	}

	public static void setC(double c) {
		TotalPagar.c = c;
	}

	public static double getD() {
		return d;
	}

	public static void setD(double d) {
		TotalPagar.d = d;
	}

	public static double getE() {
		return e;
	}

	public static void setE(double e) {
		TotalPagar.e = e;
	}

	public static double getF() {
		return f;
	}

	public static void setF(double f) {
		TotalPagar.f = f;
	}

	public static double getG() {
		return g;
	}

	public static void setG(double g) {
		TotalPagar.g = g;
	}

	
	
	
	
	
	
	
}
