package bl.dataElements;


public class OverAllBoard extends Board {
    Board[] boards = new Board[7];

    public OverAllBoard() {
        boards[0] = new MainBoard();
        boards[1] = new MainBoard();
        boards[2] = new MainBoard();
        
        boards[3] = new AttackBoard();
        boards[4] = new AttackBoard();
        boards[5] = new AttackBoard();
        boards[6] = new AttackBoard();
    }
}