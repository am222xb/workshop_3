package BlackJack.model.rules;

<<<<<<< HEAD
public class winConditionDealer implements IWinCondition{

	public boolean winCondition(int dealer_score, int player_score) {
		
=======
import BlackJack.model.Player;

public class winConditionDealer implements IWinCondition{

	public boolean winCondition(Player dealer, Player player, int maxScore) {
		if (player.CalcScore() > maxScore) {
		      return true;
		    } 
		    else if (dealer.CalcScore() > maxScore) {
		      return false;
		    }
		    if(player.CalcScore()<dealer.CalcScore()){
		    	return true;
		    }
		    else if(player.CalcScore()>dealer.CalcScore()){
		    	return false;
		    }
>>>>>>> f7f8fcb9d669784eb58c537559eb9f5c492d3521
		return true;
	}

}
