package school.lambda.orders.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.orders.models.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}
