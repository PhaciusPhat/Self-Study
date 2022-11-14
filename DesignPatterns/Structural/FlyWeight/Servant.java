package Structural.FlyWeight;

public class Servant implements ServantInterface {
    private SpecialSkill specialSkill;

    public Servant(SpecialSkill specialSkill) {
        this.specialSkill = specialSkill;
    }

    @Override
    public void SpecialSkill() {
        System.out.println("Special Skill: " + specialSkill.name() + " (" + specialSkill.time() + ")");
    }
}
