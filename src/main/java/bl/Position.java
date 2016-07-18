package bl;


public class Position {
    public static int MAX_X = 5;
    public static int MAX_Y = 9;
    public static int MAX_Z = 5;
	
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

	public Position(int x, int y, int z) throws PositionOffBoardException {
	    setPosition(x, y, z);
	    if(!isOnMainBoard()){
	        if(!isOnAttackBoard()){
	            throw new PositionOffBoardException();
	        }
	    }
    }
	
	public boolean isOnMainBoard(){
	    if(isOnBottomMainBoard() || isOnMiddleMainBoard() || isOnTopMainBoard()){
	        return true;
	    }
	    return false;
	}
	
	public boolean isOnAttackBoard(){
	    if(LFB() || RFB() || LBB() || RBB() || LFM() || RFM() || LBM() || RBM() || LFT() || RFT() || LBT() || RBT()){
            return true;
        }
	    return false;
	}
	
	private void setPosition(int x, int y, int z) {
	    this.x = x;
	    this.y = y;
	    this.z = z;
	}
	
	
	
	public boolean isOnBottomMainBoard(){
	    if(x >= 1 && x <= 4){
            if(y >= 1 && y <= 4){
                if(z == 0){
                    return true;
                }
            }
        }
        return false;
	}
	
	public boolean isOnMiddleMainBoard(){
        if(x >= 1 && x <= 4){
            if(y >= 3 && y <= 6){
                if(z == 2){
                    return true;
                }
            }
        }
        return false;
    }
	
	public boolean isOnTopMainBoard(){
        if(x >= 1 && x <= 4){
            if(y >= 5 && y <= 8){
                if(z == 4){
                    return true;
                }
            }
        }
        return false;
    }
	
	
	
	/**
	 * Left Front Bottom
	 * @return
	 */
	public boolean LFB(){
	    if(x >= 0 && x <= 1){
            if(y >= 0 && y <= 1){
                if(z == 1){
                    return true;
                }
            }
        }
        return false;
	}
	
	/**
     * Right Front Bottom
     * @return
     */
    public boolean RFB(){
        if(x >= 4 && x <= 5){
            if(y >= 0 && y <= 1){
                if(z == 1){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Left Back Bottom
     * @return
     */
    public boolean LBB(){
        if(x >= 0 && x <= 1){
            if(y >= 4 && y <= 5){
                if(z == 1){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Right Bottom Back
     * @return
     */
    public boolean RBB(){
        if(x >= 4 && x <= 5){
            if(y >= 4 && y <= 5){
                if(z == 1){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Left Front Middle
     * @return
     */
    public boolean LFM(){
        if(x >= 0 && x <= 1){
            if(y >= 2 && y <= 3){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Right Front Middle
     * @return
     */
    public boolean RFM(){
        if(x >= 4 && x <= 5){
            if(y >= 2 && y <= 3){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Left Back Middle
     * @return
     */
    public boolean LBM(){
        if(x >= 0 && x <= 1){
            if(y >= 6 && y <= 7){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Right Back Middle
     * @return
     */
    public boolean RBM(){
        if(x >= 4 && x <= 5){
            if(y >= 6 && y <= 7){
                if(z == 3){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Left Front Top 
     * @return
     */
    public boolean LFT(){
        if(x >= 0 && x <= 1){
            if(y >= 4 && y <= 5){
                if(z == 5){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Right Front Top
     * @return
     */
    public boolean RFT(){
        if(x >= 4 && x <= 5){
            if(y >= 4 && y <= 5){
                if(z == 5){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Left Back Top
     * @return
     */
    public boolean LBT(){
        if(x >= 0 && x <= 1){
            if(y >= 8 && y <= 9){
                if(z == 5){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Right Back Top
     * @return
     */
    public boolean RBT(){
        if(x >= 4 && x <= 5){
            if(y >= 8 && y <= 9){
                if(z == 5){
                    return true;
                }
            }
        }
        return false;
    }
    
}