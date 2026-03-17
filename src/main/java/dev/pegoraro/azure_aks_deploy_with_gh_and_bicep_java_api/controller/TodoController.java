package dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.controller;

import dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.dto.Todo;
import dev.pegoraro.azure_aks_deploy_with_gh_and_bicep_java_api.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoRepository repository;

    @GetMapping
    public Flux<Todo> getTodosByName(@RequestParam(value = "text", defaultValue = "")  String text){
        if ("".equals(text))
            return repository.findAll();

        return repository.findByTextContaining(text);
    }

    @PostMapping
    public Mono<Todo> postTodo(@RequestBody  Todo todo){
        return repository.save(todo);
    }


    @DeleteMapping("/{id}")
    public Mono<Void> deleteTodo(@PathVariable String id){
        return repository.deleteById(id);
    }


}
