package Structural.Adapter;

public class AdapterClass extends Computer{
    private Printer printer;

    public AdapterClass(Printer printer){this.printer = printer;}

    private String convertTextIntoDocument(String text){
        return "Document " + text;
    }

    @Override
    public void wantToPrint(String text){
        System.out.println("Computer request print");
        printer.print(convertTextIntoDocument(text));
        System.out.println("Printer complete print");
    }
}
