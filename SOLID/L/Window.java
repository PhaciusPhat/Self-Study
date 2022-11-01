package L;

public class Window extends OperatingSystem{
    @Override
    public void startUp(){
        // -> break liskov substitution principle because we expect this method can run
        throw new IllegalStateException("Can't start window system");
    }
}
