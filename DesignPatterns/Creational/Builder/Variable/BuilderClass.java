package Creational.Builder.Variable;

public interface BuilderClass {
    BuilderClass studentBornYear(int year);
    BuilderClass studentName(String name);

    Object build();
}
