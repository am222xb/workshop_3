package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;

public class PlayGame {

  public boolean Play(Game a_game, IView a_view) throws InterruptedException {
    a_view.DisplayWelcomeMessage();
    
    a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
    
    if (a_game.IsGameOver())
    {
        a_view.DisplayGameOver(a_game.IsDealerWinner());
    }

    int[] menuOptionsArray = a_view.getMenuArray();
    int input = a_view.GetInput();
    
    if (input == menuOptionsArray[0])
    {
        a_game.NewGame();
    }
    else if (input == menuOptionsArray[1])
    {
        a_game.Hit();
    }
    else if (input == menuOptionsArray[2])
    {
        a_game.Stand();
    }
    return input != menuOptionsArray[3];
  }
}
