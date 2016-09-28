package sample;

public class SomeExcluded {

    public final int id;
    public final String name;

    public SomeExcluded(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String someExcludedToString() {
        return id + ", " + name;
    }
}
