import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrderSerrvice implements Orderable{
    Set<Order> orders1 = new LinkedHashSet<>();

    @Override
    public String createOrder(Set<Order> orders) {
        orders1.addAll(orders);
        return "Uspeshno";
    }

    @Override
    public Set<Order> findAllOrders() {
        return orders1;
    }


    @Override
    public Order removeByName(String name) {
        for (Order o:orders1) {
            if (name.equalsIgnoreCase(o.getName())){
                orders1.remove(o);
                return o;
            }

        }return null;

    }

    @Override
    public Order findById(Long id) {

        return orders1.stream().filter(order -> order.getId().equals(id)).findAny().orElseThrow();
    }

    @Override
    public Map<Integer, Order> getAge() {
        Map<Integer,Order> orderMap = new TreeMap<>();
        for (Order order : orders1) {
            Integer nam = LocalDate.now().getYear()-order.getAge().getYear();
            orderMap.put(nam,order);
        }

        return orderMap;
    }

    @Override
    public String name(String name) {
        for (Order order : orders1) {
            if (name.equalsIgnoreCase(order.getName())){

            }

        }
        return null;
    }

    @Override
    public Map<Gender,List< Order>> groupingByGender() {
        return  orders1.stream().collect(Collectors.groupingBy(Order::getGender)) ;

    }
}
