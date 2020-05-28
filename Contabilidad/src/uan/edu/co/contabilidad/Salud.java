package uan.edu.co.contabilidad;

import uan.edu.co.contabilidad.*;

public class Salud {
		
	private static double salud= 4;
	private static double totalsalud = (salud * Empleados.getSaldo1)/100;
	private static double totalsalud2 = (salud * Empleados.getSaldo2)/100;
	private static double totalsalud3 = (salud * Empleados.getSaldo3)/100;
	private static double totalsalud4 = ((Empleados.getSaldo4 + HorasExtrasTotal.getTotaldiurnoc()) * salud )/100;
	private static double totalsalud5 = ((Empleados.getSaldo5 + HorasExtrasTotal.getTotaldiurnocfesttotal()) * salud )/100;
	
	
	public static double getTotalsalud() {
		return totalsalud;
	}
	public void setTotalsalud(double totalsalud) {
		this.totalsalud = totalsalud;
	}
	
	
	
	public static double getTotalsalud2() {
		return totalsalud2;
	}
	
	public static void setTotalsalud2(double totalsalud2) {
		Salud.totalsalud2 = totalsalud2;
	}
	
	public static double getTotalsalud3() {
		return totalsalud3;
	}
	public static void setTotalsalud3(double totalsalud3) {
		Salud.totalsalud3 = totalsalud3;
	}
	public static double getTotalsalud4() {
		return totalsalud4;
	}
	public static void setTotalsalud4(double totalsalud4) {
		Salud.totalsalud4 = totalsalud4;
	}
	public static double getTotalsalud5() {
		return totalsalud5;
	}
	public static void setTotalsalud5(double totalsalud5) {
		Salud.totalsalud5 = totalsalud5;
	}
	
	

	
	
}
