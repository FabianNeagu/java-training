package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard()
    {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor)
    {
        int ok=0;
        if(IsLegalBoardPosition(xCoordinate,yCoordinate))
        {
            if(pieceColor.equals(PieceColor.BLACK))
            {
                if(xCoordinate==6)
                {
                    if(pieces[xCoordinate][yCoordinate]==null)
                    {
                        pawn.setXCoordinate(xCoordinate);
                        pawn.setYCoordinate(yCoordinate);
                        pawn.setChessBoard(this);
                        pieces[xCoordinate][yCoordinate]=pawn;
                        ok=1;
                    }
                }
            }
            if(pieceColor.equals(PieceColor.WHITE))
            {
                if(xCoordinate==1)
                {
                    if(pieces[xCoordinate][yCoordinate]==null)
                    {
                        pawn.setXCoordinate(xCoordinate);
                        pawn.setYCoordinate(yCoordinate);
                        pawn.setChessBoard(this);
                        pieces[xCoordinate][yCoordinate]=pawn;
                        ok=1;
                    }
                }
            }
        }
        if(ok==0)
        {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate)
    {
        if (xCoordinate <= 7 && xCoordinate >= 0 && yCoordinate >= 0 && yCoordinate <=7)
            return true;
        else
            return false;
    }
    public  Pawn getPiece(int x,int y)
    {
        return pieces[x][y];
    }
}
