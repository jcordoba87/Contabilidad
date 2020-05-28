package uan.edu.co.contabilidad;

public class HorasExtrasTotal {

	private static double totaldiurnoc = HorasExtras.getDiurna() + HorasExtras.getNocturna();
	
	private static double totalfest = HorasExtras.getFestcompleto() + HorasExtras.getFestdiurna() + HorasExtras.getFestnocturna();

	private static double totaldiurnocfesttotal = HorasExtras.getDiurna5() + HorasExtras.getNocturna5() + HorasExtras.getFestcompleto() + HorasExtras.getFestdiurna() + HorasExtras.getFestnocturna();
	
	public static double getTotaldiurnoc() {
		return totaldiurnoc;
	}

	public static void setTotaldiurnoc(double totaldiurnoc) {
		HorasExtrasTotal.totaldiurnoc = totaldiurnoc;
	}

	public static double getTotalfest() {
		return totalfest;
	}

	public static void setTotalfest(double totalfest) {
		HorasExtrasTotal.totalfest = totalfest;
	}

	public static double getTotaldiurnocfesttotal() {
		return totaldiurnocfesttotal;
	}

	public static void setTotaldiurnocfesttotal(double totaldiurnocfesttotal) {
		HorasExtrasTotal.totaldiurnocfesttotal = totaldiurnocfesttotal;
	}
	
	
	
	
	
	
	
}
