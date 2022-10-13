package members;

public class Robot extends Member{
    //region Constructors
    public Robot() {
        super("Robot");
    }
    public Robot(String name, Double dist, Double hig) {
        this();
        instanceName = name;
        setMaxDistance(dist);
        setMaxHeight(hig);
    }
    //endregion
}
