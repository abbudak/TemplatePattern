
public class Truck extends ChangeTire{

	@Override
	public void park() {
		System.out.println("truck parked");
	}

	@Override
	protected void lift2meters() {
		System.out.println("truck lifted 2 meters");
	}

	@Override
	protected void lift1meter() {
		System.out.println("truck lifted 1 meter");
	}

}
