package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    @SuppressWarnings({"checkstyle:VisibilityModifier", "checkstyle:SuppressWarnings"})
    public String playID;
    @SuppressWarnings({"checkstyle:VisibilityModifier", "checkstyle:SuppressWarnings"})
    public int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }
}
