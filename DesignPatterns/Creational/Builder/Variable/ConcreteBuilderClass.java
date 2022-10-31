package Creational.Builder.Variable;

public class ConcreteBuilderClass implements BuilderClass{
    private String name;
    private int bornYear;


    @Override
    public BuilderClass studentBornYear(int year) {
        this.bornYear = year;
        return this;
    }

    @Override
    public BuilderClass studentName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Object build() {
        return new Student(name, bornYear);
    }


}
