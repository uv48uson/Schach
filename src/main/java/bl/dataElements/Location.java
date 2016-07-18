package bl.dataElements;

import bl.Position;

public interface Location {
    public int getXOffSet();
    public int getYOffSet();
    public int getZOffSet();
    public boolean isOnBoard(Position position);
}
