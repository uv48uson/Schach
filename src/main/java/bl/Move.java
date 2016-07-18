package bl;

public class Move {
    
    private int x;
    private int y;
    private int z;
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getZ(){
        return z;
    }
    
    public Move(int x, int y, int z) {
        setPosition(x, y, z);
    }
    
    private void setPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
}
