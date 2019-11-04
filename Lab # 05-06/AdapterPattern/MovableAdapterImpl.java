package adapterPattern;

public class movableAdapterImpl implements movableAdapter{
	movable luxuryCars;
	
	public movableAdapterImpl(movable gtr) {
		this.luxuryCars = gtr;
	}
	public double speed() {
		System.out.println(luxuryCars.speed());
		return MPHtoKPH(luxuryCars.speed());
		
	}
	public double MPHtoKPH(double mph) {
		return mph * 1.60934;
	}	
}
