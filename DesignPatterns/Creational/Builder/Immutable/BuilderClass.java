package Creational.Builder.Immutable;

public interface BuilderClass {
    BuilderClass studentBuilder(String name, int year);
    BuilderClass studentEmail(String email);
    Object build() throws Exception;
}
