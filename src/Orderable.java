import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Orderable {
    String createOrder(Set<Order> orders);

    Set<Order> findAllOrders() ;

    Order removeByName(String name);

    Order findById(Long id);

    Map<Integer, Order> getAge();

    String name(String name);

    Map<Gender, List< Order>> groupingByGender();

}
