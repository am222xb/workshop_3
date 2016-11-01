package BlackJack.model.rules;


import BlackJack.model.Player;

class BasicHitStrategy implements IHitStrategy {

	public boolean DoHit(Player a_dealer) {
		return a_dealer.CalcScore() < hitLimit(a_dealer);  
	}
	public int hitLimit(Player a_dealer){
		return 17;
	}
}