package members;

public class Human extends Member{
    //region Constructors
    public Human() {
        super("Human");
    }

    public Human(String name, Double dist, Double hig) {
        this();
        instanceName = name;
        setMaxDistance(dist);
        setMaxHeight(hig);
    }
    //endregion
}
