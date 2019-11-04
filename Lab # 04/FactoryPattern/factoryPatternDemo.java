package abstractFactory;
import java.util.*;

public class factoryPatternDemo {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		shapeFactory produce = new shapeFactory();
		System.out.println("Enter shape of your choice...");
		String shape = input.next();
		produce.getshape(shape);
	}
}
