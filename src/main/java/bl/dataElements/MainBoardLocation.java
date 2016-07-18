package bl.dataElements;

import bl.Position;

public enum MainBoardLocation implements Location{
    Bottom{
        @Override
		public int getYOffSet(){
            return 1;
        }
        @Override
		public int getZOffSet(){
            return 0;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.isOnBottomMainBoard();
        }
    }, Middle{
        @Override
		public int getYOffSet(){
            return 3;
        }
        @Override
		public int getZOffSet(){
            return 2;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.isOnMiddleMainBoard();
        }
    }, Top{
        @Override
		public int getYOffSet(){
            return 5;
        }
        @Override
		public int getZOffSet(){
            return 4;
        }
        @Override
		public boolean isOnBoard(Position position){
            return position.isOnTopMainBoard();
        }
    };
    @Override
	public int getXOffSet(){
        return 1;
    }
}
