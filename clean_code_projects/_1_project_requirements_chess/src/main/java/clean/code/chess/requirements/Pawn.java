package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY)
    {
        if(movementType.equals(movementType.MOVE))
        {
            if(pieceColor.equals(PieceColor.WHITE))
            {
                if(this.getChesssBoard().getPiece(xCoordinate+1,yCoordinate)==null && newX==xCoordinate+1  && newY==yCoordinate)
                {
                    xCoordinate=xCoordinate+1;
                }
            }
            if(pieceColor.equals(PieceColor.BLACK)&& newX==xCoordinate-1  && newY==yCoordinate)
            {
                if(this.getChesssBoard().getPiece(xCoordinate-1,yCoordinate)==null)
                {
                    xCoordinate=xCoordinate-1;
                }
            }
        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
