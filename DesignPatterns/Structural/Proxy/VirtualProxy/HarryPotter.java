package Structural.Proxy.VirtualProxy;

public class HarryPotter implements Book{
    @Override
    public void goToPage(int page) {
        System.out.println("go to page: " + page);
    }

    @Override
    public int getTotalPages() {
        return 500;
    }
}
