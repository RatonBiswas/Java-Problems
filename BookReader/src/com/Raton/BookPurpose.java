package com.Raton;

public class BookPurpose {
    private String bookName;
    private  String bookId;
    private double price;

    public BookPurpose(String bookName, String bookId, double price) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.price = price;
    }
    public void cutomerCalculation(){

    }
    public void newcustomer(double discount){
        double totalPrice = getPrice()-discount/100;
    }
    public void Oldcustomer(double vat){
        double totalPrice = getPrice()+vat/100;
    }
    public double getPrice() {
        return price;
    }
    public void show(){
        System.out.println("Book name : "+this.bookName);
        System.out.println("Book Id : "+this.bookId);
        System.out.println("Book Price :"+this.price);
    }

}
