
public abstract class Insect {

	private Tile tile;
	private int healthPoints;
	
	public Insect(final Tile tile, final int healthPoints) {
		this.tile = tile;
		this.healthPoints = healthPoints;
	}
	
	public final Tile getPosition() {
		return this.tile;
	}
	
	public final int getHealth() {
		return this.healthPoints;
	}
	
	public void setPosition(final Tile tile) {
		this.tile = tile;
	}
}
