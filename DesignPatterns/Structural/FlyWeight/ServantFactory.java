package Structural.FlyWeight;

import java.util.HashMap;

public class ServantFactory {

    private static final HashMap<String, Servant> servants = new HashMap<>();



    public static Servant createServant(String name, SpecialSkill specialSkill){
        Servant servant = servants.get(name);
        if(servant == null){
            Servant newServant = new Servant(specialSkill);
            servants.put(name, newServant);
            return newServant;
        }
        return servant;
    }

    public static int getTotalServants(){
        return servants.size();
    }

}
