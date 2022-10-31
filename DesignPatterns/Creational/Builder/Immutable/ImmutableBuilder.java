package Creational.Builder.Immutable;

public class ImmutableBuilder {
    public static void main(String[] args) throws Exception {
        ImmutableStudent student =
                (ImmutableStudent) new ConcreteBuilderClass()
                        .studentBuilder("Phát", 2001)
                                .build();
        System.out.println(student.toString());
    }
}
