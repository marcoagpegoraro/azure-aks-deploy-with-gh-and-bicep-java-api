package dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.dto.Todo;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TodoRepository extends ReactiveCosmosRepository<Todo, String> {
    Flux<Todo> findByTextContaining(final String text);
}

