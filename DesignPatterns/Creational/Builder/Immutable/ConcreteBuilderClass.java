package Creational.Builder.Immutable;

public class ConcreteBuilderClass implements BuilderClass {
    private String name;
    private int bornYear;
    private String email;

    private void checkValidStudent(){
        if(this.name == null && bornYear <=0 ){
            throw new IllegalArgumentException("Name and born year isn't valid");
        }
    }

    @Override
    public BuilderClass studentBuilder(String name, int year) {
        this.name = name;
        this.bornYear = year;
        return this;
    }

    @Override
    public BuilderClass studentEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Object build(){
        checkValidStudent();
        return new ImmutableStudent(name, bornYear, email);
    }


}
