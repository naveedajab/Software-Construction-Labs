package abstractFactory;

public class shapeFactory {
	
	public shape getshape(String shapeType) {
		if(shapeType==null) {
			System.out.println("null");
		}
		else if(shapeType.equalsIgnoreCase("circle")) {
			new circle().draw();
		}
		else if(shapeType.equalsIgnoreCase("square")) {
			new square().draw();
		}
		else if(shapeType.equalsIgnoreCase("rectangle")) {
			new rectangle().draw();
		}
		return null;
	}
}
