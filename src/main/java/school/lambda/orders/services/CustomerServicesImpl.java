package school.lambda.orders.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.lambda.orders.models.Customer;
import school.lambda.orders.repositories.CustomerRepository;

@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices{
    @Autowired
    private CustomerRepository custrepo;
    @Transactional
    @Override
    public Customer save(Customer customer) {
        return custrepo.save(customer);
    }
}
