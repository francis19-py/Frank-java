class Book{
    String title;
    double price;

    Book(String t){
        title = t;
        price = 0;
    }
    Book (String t, double p){
        title = t;
        price = p;

    }

    void display(){
        System.out.println(title + " -" + price);
    }
}

public class constructor{
    public static void main(String[] args){
        Book b1 = new Book("Java basics");
        Book b2 = new Book("adavanced java", 500);

        b1.display();
        b2.display();
        
    }
}