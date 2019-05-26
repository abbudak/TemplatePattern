
public class Auto extends ChangeTire {
    @Override
    public void park() {
        System.out.println("auto parked");
    }
	
    @Override
    protected boolean hasMoreTires() {
        return false;
    }   

	@Override
	protected void lift1meter() {
		System.out.println("auto lifted 1 meter");
	}

	@Override
	protected void lift2meters() {
		System.out.println("auto lifted 2 meters");
	}
}
