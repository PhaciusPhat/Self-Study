package Behavioral.Template;

public class Template{
    public static void main(String[] args){
        TemplatePage home = new HomePage();
        home.showPage();
        TemplatePage detail = new DetailPage();
        detail.showPage();
    }
}
