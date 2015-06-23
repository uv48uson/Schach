package bl;

import org.junit.Test;
import org.junit.Before;

import ui.I_UI_Impl;

public class Game_Test {
    Game game;
    
    @Before
    public void setUp(){
        game = new Game(new I_UI_Impl());
    }
    
    @Test
    public void Game(){
        assert(game != null);
    }
    
    @Test
    public void play(){
        game.play();
    }
}
