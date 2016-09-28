package sample;

public class AllExcluded {

    public final int id;
    public final String name;

    public AllExcluded(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String allExcludedToString() {
        return id + ", " + name;
    }
}
