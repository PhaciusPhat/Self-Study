package Structural.FlyWeight;

public class FlyWeight {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createByNormalWay("saber", new SpecialSkill("excalibur", 100), 10);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println("/////////////////");
        startTime = System.currentTimeMillis();
        createServants("saber", new SpecialSkill("excalibur", 100), 10);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
//        System.out.println(endTime - startTime);
//        createServants("rider", new SpecialSkill("racing", 50), 2);
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//        createServants("archer", new SpecialSkill("shoot", 20), 20);
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
    }

    private static void createByNormalWay(String name, SpecialSkill specialSkill, int number){
        for (int i = 1; i <= number; i++) {
            Servant servant = new Servant(specialSkill);
            System.out.println("servant: " + name + i + " have created");
        }
    }

    private static void createServants(String name, SpecialSkill specialSkill, int number) {
        for (int i = 1; i <= number; i++) {
            Servant servant = ServantFactory.createServant(name + i, specialSkill);
            System.out.println("servant: " + name + i + " have created");
        }
    }
}
