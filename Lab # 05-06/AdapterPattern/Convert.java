package adapterPattern;

public class convert {
	
	public static void main(String[] args) {
		movable GTR = new NissanGTR();
		
		movableAdapter GTRAdapter = new movableAdapterImpl(GTR);
		
		System.out.println("Sccucess");
		
		((movableAdapterImpl) GTRAdapter).MPHtoKPH(120);
		((movableAdapterImpl) GTRAdapter).speed();
		System.out.println("End");
		}

}
