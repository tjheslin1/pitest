package sample;

public class NoneExcluded {

    public final int id;
    public final String name;

    public NoneExcluded(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String noneExcludedToString() {
        return id + ", " + name;
    }
}
