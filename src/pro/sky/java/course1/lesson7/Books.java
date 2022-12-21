package pro.sky.java.course1.lesson7;

public class Books {
    private String name;
    private Author author;
    private int year;

    public Books(String name,Author author, int year) {
        this.name = name;
        this.year = year;
        this.author = author;

    }

    public String getName() {
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
