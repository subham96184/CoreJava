package com.luv3code.collections.factory;

public class PolygonFactory {

	public static Polygon getInstance(int sides)
	{
		Polygon polygon=null;
		
		switch (sides) {
		case 3:
			polygon =new Triangle();
			break;
		case 4:
			polygon =new SquAre();
			break;
		case 6:
			polygon =new Rectangle();
			break;
			

		default:
			break;
		}
	
		return polygon;
	}
}
