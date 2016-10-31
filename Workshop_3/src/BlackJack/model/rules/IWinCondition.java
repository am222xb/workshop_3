package BlackJack.model.rules;

import BlackJack.model.Player;

public interface IWinCondition {
	boolean winCondition(Player dealer, Player player, int maxScore);

}
