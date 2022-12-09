package Behavioral.Template;

public abstract class TemplatePage {
    public void Header() {
        System.out.println("Template Header");
    }

    public void Body(){
        System.out.println("Template Body");
    }

    public void Footer(){
        System.out.println("Template Footer");
    }

    public final void showPage(){
        Header();
        Body();
        Footer();
    }
}
