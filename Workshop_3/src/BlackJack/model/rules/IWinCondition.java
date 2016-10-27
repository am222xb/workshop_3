package BlackJack.model.rules;

public interface IWinCondition {
	boolean winCondition(int dealer_score, int player_score );
}
