package bl;

public class Position {
	
    private int x;
	private int y;
	private int z;

	public Position(int x, int y, int z) throws PositionOffBoardException {
	    setPosition(x, y, z);
	    if(!(isOnLowerMainBoard() || isOnMiddleMainBoard() || isOnUpperMainBoard())){
	        if(!(isOnLowerLeftAttackBoard() || isOnLowerRightAttackBoard() || isOnMiddleLeftAttackBoard() || isOnMiddleRightAttackBoard() || isOnUpperMiddleLeftAttackBoard()
	                || isOnUpperMiddleRightAttackBoard() || isOnUpperLeftAttackBoard() || isOnUpperRightAttackBoard())){
	            throw new PositionOffBoardException();
	        }
	    }
    }
	
	private void setPosition(int x, int y, int z) {
	    this.x = x;
	    this.y = y;
	    this.z = z;
	}
	
	private boolean isOnLowerMainBoard(){
	    if(x >= 1 && x <= 4){
            if(y >= 1 && y <= 4){
                if(z == 0){
                    return true;
                }
            }
        }
        return false;
	}
	
	private boolean isOnMiddleMainBoard(){
        if(x >= 1 && x <= 4){
            if(y >= 3 && y <= 6){
                if(z == 1){
                    return true;
                }
            }
        }
        return false;
    }
	
	private boolean isOnUpperMainBoard(){
        if(x >= 1 && x <= 4){
            if(y >= 5 && y <= 8){
                if(z == 2){
                    return true;
                }
            }
        }
        return false;
    }
	
	private boolean isOnLowerLeftAttackBoard(){
	    if(x >= 0 && x <= 1){
            if(y >= 0 && y <= 1){
                if(z == 1){
                    return true;
                }
            }
        }
        return false;
	}
	
	private boolean isOnLowerRightAttackBoard(){
        if(x >= 4 && x <= 5){
            if(y >= 0 && y <= 1){
                if(z == 1){
                    return true;
                }
            }
        }
        return false;
    }
	
	private boolean isOnMiddleLeftAttackBoard(){
        if(x >= 0 && x <= 1){
            if(y >= 2 && y <= 3){
                if(z == 2){
                    return true;
                }
            }
        }
        return false;
    }
	
	private boolean isOnMiddleRightAttackBoard(){
        if(x >= 4 && x <= 5){
            if(y >= 2 && y <= 3){
                if(z == 2){
                    return true;
                }
            }
        }
        return false;
    }
	
	private boolean isOnUpperMiddleLeftAttackBoard(){
        if(x >= 0 && x <= 1){
            if(y >= 4 && y <= 5){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isOnUpperMiddleRightAttackBoard(){
        if(x >= 4 && x <= 5){
            if(y >= 4 && y <= 5){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isOnUpperLeftAttackBoard(){
        if(x >= 0 && x <= 1){
            if(y >= 8 && y <= 9){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isOnUpperRightAttackBoard(){
        if(x >= 4 && x <= 5){
            if(y >= 8 && y <= 9){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
	        
}