package school.lambda.orders.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.orders.models.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
