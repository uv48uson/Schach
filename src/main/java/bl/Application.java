package bl;

import ui.I_UI_Impl;

public class Application {
    
    public static void main(String[] args){
        Game game = new Game(new I_UI_Impl());
        game.play();
    }
}