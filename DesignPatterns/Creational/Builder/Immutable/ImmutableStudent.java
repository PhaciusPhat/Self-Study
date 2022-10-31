package Creational.Builder.Immutable;

public record ImmutableStudent(String name, int bornYear, String email) {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bornYear=" + bornYear + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
