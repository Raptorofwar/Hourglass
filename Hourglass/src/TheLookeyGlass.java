//version 2.0


public class TheLookeyGlass {

	public static void main(String[] args) {
		int totalWidth=13;
		for(int i=-1*totalWidth; i<=totalWidth; i+=2) {
			String a;
			String b;
			String c;
			if(i%totalWidth==0||(i<0&&i+2>0)) {
				a="|";
				b="\"";
				c="|";
			}else {
				b=":";
				if(i<0) {
					a="\\";
					c="/";
				}else {
					a="/";
					c="\\";
				}
			}
			drawObj(Math.abs(i), totalWidth, a, b, c);
		}
	}
	
	public static void drawObj(int width, int totalWidth, String a, String b, String c) {
		drawSpaces(width, totalWidth);
		drawThing(width, a, b, c);
	}
	
	public static void drawSpaces(int width, int totalWidth) {
		for(int i=0; i<(totalWidth-width)/2; i++) {
			System.out.print(" ");
		}
	}
	
	public static void drawThing(int width, String a, String b, String c) {
		System.out.print(a);
		for (int i=0; i<width; i++) {
			System.out.print(b);
		}
		System.out.println(c);
	}

}
