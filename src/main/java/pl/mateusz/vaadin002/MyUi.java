package pl.mateusz.vaadin002;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
@Theme("valo")
public class MyUi extends UI {


    private final Vaadin002Application.MyService service;


    public MyUi(Vaadin002Application.MyService service) {
        this.service = service;
    }

    public  Layout layout = new VerticalLayout();
    @Override
    protected void init(VaadinRequest vaadinRequest) {

       /* VerticalLayout content = new VerticalLayout();
        content.setSizeFull();
        setContent(content);*/

        GridLayout gridLayout= new GridLayout();

        rejestracja();
/*
        Window okno = new Window();
        okno.setHeight("200px");
        okno.setWidth("400px");
        // Set window position.
        okno.setPositionX(400);
        okno.setPositionY(50);

        UI.getCurrent().addWindow(okno);
        */

        setContent(layout);

    }


    public String wiek(String word) {
        if (Integer.parseInt(word) >= 18) {
            return "Jesteś pełnoletni";
        } else {
            return "Masz za mało lat";
        }
    }

    public void rejestracja(){
        Label label = new Label("HELLO WORLD");
        layout.addComponent(label);
        Label name1 = new Label();
        Label someLastname = new Label();
        Label someAge = new Label();




        TextField name = new TextField();
        name.setWidth(15.2f, Unit.PERCENTAGE);
        name.setCaption("podaj imię");

        Button button = new Button("Wyświetl");

        TextField age = new TextField();
        age.setCaption("Podaj wiek");

        TextField lastname = new TextField();
        lastname.setCaption("Podaj nazwisko");

        button.addClickListener((Button.ClickEvent e) ->{
            name1.setValue("Imię: "+name.getValue());
            someLastname.setValue("Nazwisko: "+lastname.getValue());
            someAge.setValue("Wiek: "+age.getValue()+" lat "+wiek(age.getValue()));
        });
        layout.addComponents( name, lastname,age,button,name1,someLastname, someAge);

    }


   public String wieks="jesteś pełnoletni";



}
