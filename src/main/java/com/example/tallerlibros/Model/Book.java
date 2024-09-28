package com.example.tallerlibros.Model;

public class Book {
   public String Tittle;
   public String Author;
   public String Year;
   public String ISBN;

   public Book(String Tittle, String Author, String Year, String ISBN) {
       this.Tittle = Tittle;
       this.Author = Author;
       this.Year = Year;
       this.ISBN = ISBN;
   }

    public String getTittle() {
        return Tittle;
    }

    public String getAuthor() {
        return Author;
    }

    public String getYear() {
        return Year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
