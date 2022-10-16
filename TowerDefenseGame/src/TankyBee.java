
public class TankyBee extends HoneyBee{

	private int attackDamageBees;
	private int armorOfBees;
	
	public TankyBee(Tile tile, int attackDamageBees, int armorOfBees) {
		super(tile, 30, 3);
		this.attackDamageBees = attackDamageBees;
		this.armorOfBees = armorOfBees;
	}
	

}
