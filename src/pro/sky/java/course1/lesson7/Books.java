package pro.sky.java.course1.lesson7;

import java.util.Objects;

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

    @Override
    public String toString() {
        return name+" "+year+" "+author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return year == books.year && Objects.equals(name, books.name) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
