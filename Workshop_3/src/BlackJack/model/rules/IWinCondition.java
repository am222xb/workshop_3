package BlackJack.model.rules;

<<<<<<< HEAD
public interface IWinCondition {
	boolean winCondition(int dealer_score, int player_score );
=======
import BlackJack.model.Player;

public interface IWinCondition {
	boolean winCondition(Player dealer, Player player, int maxScore);
>>>>>>> f7f8fcb9d669784eb58c537559eb9f5c492d3521
}
