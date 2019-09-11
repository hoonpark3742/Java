package HexaArea;

public class Hexa {
	private Square square;
	private int height;
	private int hexaarea;
	
	Hexa(int h,int v, int h2) {
		Square square = new Square(h, v);
		height = h2;
		hexaarea = h2*square.getArea();
	}
	
	void HexaHeightArea(){ 
		square.SquareHV();
		System.out.println("≥Ù¿Ã : " + height);
	    System.out.println("≥–¿Ã : " + hexaarea);
	}
	
}
