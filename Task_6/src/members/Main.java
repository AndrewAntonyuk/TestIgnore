package members;

import geometry.Circle;
import geometry.Shape;
import geometry.Square;
import geometry.Triangle;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Member> members = new ArrayList<>();
        Collection<Barricade> barricades = new ArrayList<>();

        members.add(new Cat("Snow",300.0,1.8));
        members.add(new Human("Robin",100.0,2.1));
        members.add(new Robot("Dron",500.0,0.5));
        barricades.add(new Racetrack("Hardway",150.0));
        barricades.add(new Wall("Bestwall",1.7));
        barricades.add(new Racetrack("Endwall",80.0));

        doSport(members, barricades);
    }
    public static void doSport(Collection<Member> m, Collection<Barricade> b) {
        for(Member member : m){
            for(Barricade barricade : b){
                if(barricade.overcome(member)){
                    break;
                }
            }
        }
    }
}
