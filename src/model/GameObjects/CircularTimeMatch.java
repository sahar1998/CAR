package model.GameObjects;

/**
 * Created by ASUS on 10/12/2016.
 */
public class CircularTimeMatch extends Match {

    public CircularTimeMatch(Path path, int roundNumber) {
        super(path);
        roundNumber = roundNumber;
        matchType = "CircularTimeMatch";
    }
}
