package Behavioral.State;

public class Pan {
    private final Status status;

    public Pan(Status status){
        this.status = status;
    }

    public String Turning(){
        return switch (status) {
            case Performant -> "Turning with " + Status.Performant.name();
            case Turbo -> "Turning with " + Status.Turbo.name();
            case Silence -> "Turning with " + Status.Silence.name();
            default -> null;
        };
    }
}
