package dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.dto;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.time.OffsetDateTime;

@Container(containerName = "todos")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Todo {
    @Id
    @GeneratedValue
    @Getter
    private String id;
    @Getter
    @Setter
    private String text;
    @Getter
    @CreatedDate
    private Instant createdAt;
    @Getter
    @LastModifiedDate
    private Instant lastModifiedAt;

}