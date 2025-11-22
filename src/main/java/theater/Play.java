package theater;

@SuppressWarnings({"checkstyle:WriteTag", "checkstyle:SuppressWarnings"})
public class Play {

    @SuppressWarnings("checkstyle:VisibilityModifier")
    public String name;
    @SuppressWarnings("checkstyle:VisibilityModifier")
    public String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
