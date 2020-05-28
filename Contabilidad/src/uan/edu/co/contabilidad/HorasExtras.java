package uan.edu.co.contabilidad;

public class HorasExtras {
	

	
			
	private static double diurna = (((Empleados.getSaldo4/240) * 1.25) * 1);
	private static double nocturna = (((Empleados.getSaldo4/240) * 1.75) * 3);
	
	private static double diurna5 = (((Empleados.getSaldo5/240) * 1.25) * 4);
	private static double nocturna5 = (((Empleados.getSaldo5/240) * 1.75) * 3);
	private static double festdiurna = (((Empleados.getSaldo5/240) * 2) * 1);
	private static double festnocturna = (((Empleados.getSaldo5/240) * 2.5) * 2);
	private static double festcompleto = (((Empleados.getSaldo5/240) * 1.75) * 8);
	

	public static double getDiurna() {
		return diurna;
	}
	public static void setDiurna(double diurna) {
		HorasExtras.diurna = diurna;
	}
	public static double getNocturna() {
		return nocturna;
	}
	public static void setNocturna(double nocturna) {
		HorasExtras.nocturna = nocturna;
	}
	public static double getFestdiurna() {
		return festdiurna;
	}
	public static void setFestdiurna(double festdiurna) {
		HorasExtras.festdiurna = festdiurna;
	}
	public static double getFestnocturna() {
		return festnocturna;
	}
	public static void setFestnocturna(double festnocturna) {
		HorasExtras.festnocturna = festnocturna;
	}
	public static double getFestcompleto() {
		return festcompleto;
	}
	public static void setFestcompleto(double festcompleto) {
		HorasExtras.festcompleto = festcompleto;
	}
	public static double getDiurna5() {
		return diurna5;
	}
	public static void setDiurna5(double diurna5) {
		HorasExtras.diurna5 = diurna5;
	}
	public static double getNocturna5() {
		return nocturna5;
	}
	public static void setNocturna5(double nocturna5) {
		HorasExtras.nocturna5 = nocturna5;
	}
	
	
	
	
	
	
	
	

}
