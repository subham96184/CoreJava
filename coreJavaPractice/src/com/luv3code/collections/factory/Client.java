package com.luv3code.collections.factory;

public class Client {

	public static void main(String[] args) {

		Polygon polygon = PolygonFactory.getInstance(3);
		System.out.println(polygon);

		/*
		 * int x=010; int y=07; System.out.println(x + "" + y);
		 * 
		 */
		/*
		 * boolean b1 = true; boolean b2 = false; boolean b3 = true; if (b1 & b2 | b2 &
		 * b3 | b2) System.out.println("ok"); if (b1 & b2 | b2 & b3 | b2 | b1)
		 * System.out.println("dokery");
		 */
	}
}
