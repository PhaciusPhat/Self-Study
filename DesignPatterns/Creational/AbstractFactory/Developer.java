package Creational.AbstractFactory;

public class Developer extends Human {
    private String staffCode;

    public Developer(String name, int bornYear, String staffCode) {
        super(name, bornYear);
        this.staffCode = staffCode;
    }

    @Override
    public String toString() {
        return "Developer " + this.staffCode + " - " + super.toString();
    }
}
