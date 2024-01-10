package it.epicode.week1.day3;

public class UsaAutomobile {

    public static void main(String[] args) {
        Automobile auto1 =new Automobile(1200, "Fiat", "Uno", "AB123CD", 5);




System.out.println("La targa dell'auto è: " + auto1.getTarga());


    //invoco il metodo accelera
    auto1.accelera();




    //invoco il metodo frena
    auto1.frena();


    //invoco il metodo getCaratteristiche
    System.out.println(auto1.getCaratteristiche());

    //cambio la targa dell'auto
    auto1.setTarga("CD456EF");
    System.out.println("La targa dell'auto è: " + auto1.getTarga());






    }
}
