public class MyMagazine extends Magazine{

    String title;

    public MyMagazine(String author, double price, String title) {
        super(title, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(getName() + " " + getAuthor() + " " + getPrice() + " " + title);
    }
}
