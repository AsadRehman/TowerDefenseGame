
public class HoneyBee extends Insect{

	private int beeCostFood;
	
	public HoneyBee(final Tile tile, final int healthPoints, final int beeCostFood) {
		super(tile, healthPoints);
		this.beeCostFood = beeCostFood;
	}

	public int getCost() {
		return this.beeCostFood;
	}
}
