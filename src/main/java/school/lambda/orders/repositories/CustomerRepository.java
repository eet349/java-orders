package school.lambda.orders.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.orders.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
