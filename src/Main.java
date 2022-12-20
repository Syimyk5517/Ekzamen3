import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static OrderSerrvice orderSerrvice = new OrderSerrvice();

    public static void main(String[] args) {
        Order order = new Order(1L, "Rahim", "Kurbanov", LocalDate.of(2003, 9, 4), Gender.MALE, "0502044990");
        Order order1 = new Order(1L, "Muhammed", "AsanKaigy", LocalDate.of(1998, 2, 14), Gender.MALE, "0777777777");
        Order order2 = new Order(3L, "Aijamal", "Asangazieva", LocalDate.of(1995, 7, 21), Gender.FEMALE, "8888888888");
        Order order3 = new Order(4L, "Maksat", "Akylbekov", LocalDate.of(1992, 12, 24), Gender.MALE, "050204499099");
        Set<Order> orders = Set.of(order, order1, order2, order3);

        System.out.println("create order ");
        System.out.println(orderSerrvice.createOrder(orders));
        System.out.println("find all orders");
        System.out.println(orderSerrvice.findAllOrders());
        System.out.println("get age orders");
        System.out.println(orderSerrvice.getAge());
        System.out.println(orderSerrvice.groupingByGender());
    }
}