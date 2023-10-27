package isp.lab6.exercise1;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("It works.");
        Address a1 = new Address("Observatorului", "Cluj-Napoca");
        System.out.println(a1);

        Customer c1 = new Customer("1","Mihai","07770011",a1);
        Customer c2 = new Customer("2","Mihai","07770011",new Address("Bistritei", "Alba-Iulia"));

        Product p1 = new Product("10","Roses",100, ProductCategory.HOME_AND_GARDEN);
        Product p2 = new Product("11","Video Card2",200, ProductCategory.ELECTRONICS);
        Product p3 = new Product("12","Lip Gloss",50, ProductCategory.BEAUTY);
        System.out.println(p1);

        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Order o1 = new Order(list,"ORD01", LocalDateTime.now(),  1000d);

        System.out.println(o1);

    }
}
