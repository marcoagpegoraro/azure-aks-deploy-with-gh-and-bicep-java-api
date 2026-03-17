package dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api;

import dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.dto.Todo;
import dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.repository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Optional;

@SpringBootApplication
public class Application {

	static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}