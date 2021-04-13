package school.lambda.orders.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.lambda.orders.models.Agent;
import school.lambda.orders.repositories.AgentRepository;

@Transactional
@Service(value = "agentServices")
public class AgentServicesImpl implements AgentServices{

    @Autowired
    private AgentRepository agentrepo;

    @Transactional
    @Override
    public Agent save(Agent agent) {
        return agentrepo.save(agent);
    }
}
