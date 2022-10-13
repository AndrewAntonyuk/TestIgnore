public class Animal {
    private Integer distanceOfRunning;
    private Integer distanceOfSwimming;
    protected Integer maximumRunning;
    protected Integer maximumSwimming;
    protected String instanceName = "Unnamed";
    private String name = "Animal";
    public static Integer counter = 0;

    //region Getters/Setters

    public Integer getDistanceOfRunning() {
        return distanceOfRunning;
    }

    public Integer getDistanceOfSwimming() {
        return distanceOfSwimming;
    }

    public void setDistanceOfRunning(Integer distanceOfRunning) {
        this.distanceOfRunning = distanceOfRunning;
    }

    public void setDistanceOfSwimming(Integer distanceOfSwimming) {
        this.distanceOfSwimming = distanceOfSwimming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion

    //region Constructors
    public Animal(){
        counter ++;
    }

    public Animal(String Name){
        this();
        name = Name;
    }
    //endregion
     public void run(Integer distance){
         System.out.println("Animal is running");
     }
     public void swim(Integer distance){
         System.out.println("Animal is swimming");
     }
}
