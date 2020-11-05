package communication;

/**
 * This class is used for building a message with the updated stats to the other player 
 * 
 * @author Abner Arroyo y Adolfo Amador
 *
 */
public class UpdatedStats {
	public String newLife;
	public String newMana;
	
	public UpdatedStats(String newLife, String newMana) {
		this.newLife = newLife;
		this.newMana = newMana;
	}
}
