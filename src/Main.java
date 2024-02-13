import java.util.LinkedList;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
public class Main {
    public static void main(String[] args) {

        //Creare un LinkedList con elementi
        LinkedList<Fruit> listFruit = new LinkedList<Fruit>();
        listFruit.add(new Fruit("mela"));
        listFruit.add(new Fruit("arancia"));
        listFruit.add(new Fruit("caco"));
        listFruit.add(new Fruit("fico"));
        listFruit.add(new Fruit("lampone"));
        listFruit.add(new Fruit("pesca"));
        listFruit.add(new Fruit("albicocca"));
        listFruit.add(new Fruit("pera"));
        listFruit.add(new Fruit("guava"));
        listFruit.add(new Fruit("mango"));
        listFruit.add(new Fruit("kiwi"));

        //stampa la lista in console
        System.out.println("la lista dei frutti e' la seguente");
        for (Fruit fruit : listFruit) {
            System.out.println(fruit);
        }

        //Aggiungere un elemento al primo posto della lista e uno all'ultimo
        listFruit.addFirst(new Fruit("mandarino"));
        listFruit.addLast(new Fruit("fragola"));

        //stampa la lista aggiornata in console
        System.out.println("la lista aggiornata dei frutti e' la seguente");
        for (Fruit fruit : listFruit) {
            System.out.println(fruit);
        }
    }
}