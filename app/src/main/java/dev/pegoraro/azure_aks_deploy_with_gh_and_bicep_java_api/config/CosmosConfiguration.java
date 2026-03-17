package dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.config;

import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.core.mapping.EnableCosmosAuditing;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCosmosAuditing
public class CosmosConfiguration {

}