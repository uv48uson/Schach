package bl.dataElements;

import bl.Position;

public abstract class Chessman {

    public enum Color {
        White, Black
    }
    
    protected Color color;

	public Chessman(Color color) {
        this.color = color;
    }

    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
	public Position[] getPossibleMoves(Position currentPosition) {
		// TODO - implement Chessman.getPossibleMoves
		throw new UnsupportedOperationException();
	}

}