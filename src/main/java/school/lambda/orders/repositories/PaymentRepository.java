package school.lambda.orders.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.orders.models.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
