package school.lambda.orders.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.lambda.orders.models.Payment;
import school.lambda.orders.repositories.PaymentRepository;

@Transactional
@Service(value = "paymentServices")
public class PaymentServicesImpl implements PaymentServices{
    @Autowired
    private PaymentRepository payrepo;
    @Transactional
    @Override
    public Payment save(Payment payment) {
        return payrepo.save(payment);
    }
}
