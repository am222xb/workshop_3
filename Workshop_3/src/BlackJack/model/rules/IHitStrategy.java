package BlackJack.model.rules;

import BlackJack.model.Player;

public interface IHitStrategy {
    boolean DoHit(Player p);
    int hitLimit(Player p);
}