package Structural.Proxy.VirtualProxy;

public class BookProxy implements Book{
    private HarryPotter harryPotter = null;

    public BookProxy(){
        System.out.println(harryPotter);
        if (harryPotter == null){
            harryPotter = new HarryPotter();
        }
    }

    @Override
    public void goToPage(int page) {
        System.out.println(harryPotter.hashCode());
        harryPotter.goToPage(page);
    }

    @Override
    public int getTotalPages() {
        return harryPotter.getTotalPages();
    }
}
