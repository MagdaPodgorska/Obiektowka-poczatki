package com.company;

public class PriceComaprison {

    public static void main(String[] args) {

        Writer author=new Writer();
        author.writer();

        Book book=new Book();
        book.writer=author;
        book.book();

        Bookstore bookstore=new Bookstore();
        bookstore.book=book;
        bookstore.name();

        Bookstore bookstore1=new Bookstore();
        bookstore1.book=book;
        bookstore1.name();

        System.out.println();

if(bookstore.price>bookstore1.price)
    System.out.println("W ksiegarni "+bookstore.name+" ksiazka autora "+bookstore.book.writer.name+" "+
            bookstore.book.writer.surname+" "+bookstore.book.name+" jest drozsza.");
else if (bookstore.price<bookstore1.price)
    System.out.println("W ksiegarni "+bookstore1.name+" ksiazka autora "+bookstore1.book.writer.name+" "+
            bookstore1.book.writer.surname+" "+bookstore1.book.name+" jest drozsza.");
else
    System.out.println("W ksiegarni "+bookstore.name+" ksiazka autora "+bookstore.book.writer.name+" "+
            bookstore.book.writer.surname+" "+bookstore.book.name+" jest w takiej samej cenie "
    +" jak w ksiegarni "+bookstore1.name+".");


    }



}
