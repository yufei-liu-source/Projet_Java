
public class Lot {
    static int IDMAX = 0;
    int ID;
    int volume;
    PieceDetachee pieceDetachee;

    public Lot(PieceDetachee pieceDetachee, int volume){
        this.ID = IDMAX;
        this.pieceDetachee = pieceDetachee;
        this.volume = volume;
        IDMAX++;
    }

    public PieceDetachee getPieceDetachee() {
        return pieceDetachee;
    }

    public int getVolume() {
        return volume;
    }
}