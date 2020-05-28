package uan.edu.co.contabilidad;

import uan.edu.co.contabilidad.*;

public class Pension {
			
		private static double pension = 4;
		private static double totalpension = (pension * Empleados.getSaldo1)/100;
		private static double totalpension2 = (pension * Empleados.getSaldo2)/100;
		private static double totalpension3 = (pension * Empleados.getSaldo3)/100;
		private static double totalpension4 = ((Empleados.getSaldo4 + HorasExtrasTotal.getTotaldiurnoc()) * pension )/100;
		private static double totalpension5 = ((Empleados.getSaldo5 + HorasExtrasTotal.getTotaldiurnocfesttotal()) * pension )/100;
		
		
		
		public static double getPension() {
			return pension;
		}
		public static void setPension(double pension) {
			Pension.pension = pension;
		}
		public static double getTotalpension() {
			
			return totalpension;
		}
		public static void setTotalpension(double totalpension) {
			Pension.totalpension = totalpension;
		}
		public static double getTotalpension2() {
			return totalpension2;
		}
		public static void setTotalpension2(double totalpension2) {
			Pension.totalpension2 = totalpension2;
		}
		public static double getTotalpension3() {
			return totalpension3;
		}
		public static void setTotalpension3(double totalpension3) {
			Pension.totalpension3 = totalpension3;
		}
		public static double getTotalpension4() {
			return totalpension4;
		}
		public static void setTotalpension4(double totalpension4) {
			Pension.totalpension4 = totalpension4;
		}
		public static double getTotalpension5() {
			return totalpension5;
		}
		public static void setTotalpension5(double totalpension5) {
			Pension.totalpension5 = totalpension5;
		}
		
			
}




