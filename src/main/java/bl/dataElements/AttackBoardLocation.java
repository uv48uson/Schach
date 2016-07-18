package bl.dataElements;

import bl.Position;

public enum AttackBoardLocation implements Location{
    LFB{
        @Override
		public int getXOffSet(){
            return 0;
        }
        @Override
		public int getYOffSet(){
            return 0;
        }
        @Override
		public int getZOffSet(){
            return 1;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.LFB();
        }
    }, 
    RFB{
        @Override
		public int getXOffSet(){
            return 4;
        }
        @Override
		public int getYOffSet(){
            return 0;
        }
        @Override
		public int getZOffSet(){
            return 1;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.RFB();
        }
    }, 
    LBB{
        @Override
		public int getXOffSet(){
            return 0;
        }
        @Override
		public int getYOffSet(){
            return 4;
        }
        @Override
		public int getZOffSet(){
            return 1;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.LBB();
        }
    }, 
    RBB{
        @Override
		public int getXOffSet(){
            return 4;
        }
        @Override
		public int getYOffSet(){
            return 4;
        }
        @Override
		public int getZOffSet(){
            return 1;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.RBB();
        }
    },
    LFM{
        @Override
		public int getXOffSet(){
            return 0;
        }
        @Override
		public int getYOffSet(){
            return 2;
        }
        @Override
		public int getZOffSet(){
            return 3;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.LFM();
        }
    },
    RFM{
        @Override
		public int getXOffSet(){
            return 4;
        }
        @Override
		public int getYOffSet(){
            return 2;
        }
        @Override
		public int getZOffSet(){
            return 3;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.RFM();
        }
    },
    LBM{
        @Override
		public int getXOffSet(){
            return 0;
        }
        @Override
		public int getYOffSet(){
            return 6;
        }
        @Override
		public int getZOffSet(){
            return 3;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.LBM();
        }
    },
    RBM{
        @Override
		public int getXOffSet(){
            return 4;
        }
        @Override
		public int getYOffSet(){
            return 6;
        }
        @Override
		public int getZOffSet(){
            return 3;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.RBM();
        }
    },
    LFT{
        @Override
		public int getXOffSet(){
            return 0;
        }
        @Override
		public int getYOffSet(){
            return 4;
        }
        @Override
		public int getZOffSet(){
            return 5;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.LFT();
        }
    },
    RFT{
        @Override
		public int getXOffSet(){
            return 4;
        }
        @Override
		public int getYOffSet(){
            return 4;
        }
        @Override
		public int getZOffSet(){
            return 5;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.RFT();
        }
    },
    LBT{
        @Override
		public int getXOffSet(){
            return 0;
        }
        @Override
		public int getYOffSet(){
            return 8;
        }
        @Override
		public int getZOffSet(){
            return 5;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.LBT();
        }
    },
    RBT{
        @Override
		public int getXOffSet(){
            return 4;
        }
        @Override
		public int getYOffSet(){
            return 8;
        }
        @Override
		public int getZOffSet(){
            return 5;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.RBT();
        }
    };
    @Override
	public abstract int getXOffSet();
    @Override
	public abstract int getYOffSet();
    @Override
	public abstract boolean isOnBoard(Position position);
}