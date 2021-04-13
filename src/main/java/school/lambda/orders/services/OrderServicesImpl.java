package school.lambda.orders.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.lambda.orders.models.Order;
import school.lambda.orders.repositories.OrderRepository;

@Transactional
@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices{
    @Autowired
    private OrderRepository orderrepo;

    @Transactional
    @Override
    public Order save(Order order) {
        return orderrepo.save(order);
    }
}
