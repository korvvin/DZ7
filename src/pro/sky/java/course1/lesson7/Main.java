package pro.sky.java.course1.lesson7;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Роджер", "Желязный");
        Author author2 = new Author("Джордж","Мартин");
        Books book1 = new Books("Хроники Амбера",author1,1970);
        Books book2 = new Books("Песнь льда и пламени",author2,1997);
        book1.setYear(1985);
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println(book1.equals(book2));

    }

}