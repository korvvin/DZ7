package pro.sky.java.course1.lesson7;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Роджер", "Желязный");
        Author author2 = new Author("Джордж","Мартин");
        Books book1 = new Books("Хроники Амбера",author1,1970);
        Books book2 = new Books("Песнь льда и пламени",author2,1997);
        System.out.print(book1.getName()+ " ");
        System.out.print( author1.getFirstName()+" "+author1.getLastName()+" ");
        System.out.println(+ book1.getYear()+" ");
        book1.setYear(1985);
        System.out.println( + book1.getYear());
        System.out.print(book2.getName()+" ");
        System.out.print(author1.getFirstName()+" "+author1.getLastName()+" ");
        System.out.println( + book2.getYear());


    }

}