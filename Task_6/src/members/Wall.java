package members;

public class Wall extends Barricade{
    //region Constructors
    public Wall() {
        super("Wall");
    }
    public Wall(String name) {
        this();
        instanceName = name;
    }
    public Wall(String name, Double lim) {
        this();
        instanceName = name;
        limit = lim;
    }
    //endregion
    @Override
    public Boolean overcome(Member m) {
        Boolean ret = false;
        m.jump();
        System.out.println(getName() + " with name " + getInstanceName() + ":");
        if(m.getMaxHeight() > limit){
            System.out.println(m.getName() + " with name " + m.instanceName
                    + " passed " + getName() + " with name " + instanceName
                    + " on the distance " + limit);
        }else{
            ret = true;
            System.out.println(m.getName() + " with name " + m.instanceName
                    + " didn't pass " + getName() + " with name " + instanceName
                    + " on the distance " + limit + ". Passed: " + m.getMaxHeight());
        }

        return ret;
    }
}
