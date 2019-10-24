package com.acme.training.flowabletraining;

import java.util.List;
import java.util.stream.Collectors;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.repository.ProcessDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    protected final RepositoryService repositoryService;
    protected final RuntimeService runtimeService;

    public MyController(RepositoryService repositoryService, RuntimeService runtimeService) {
        this.repositoryService = repositoryService;
        this.runtimeService = runtimeService;
    }

    @GetMapping("/latest-definitions")
    public List<String> latestDefinitions() {
        return repositoryService.createProcessDefinitionQuery()
            .latestVersion()
            .list()
            .stream()
            .map(ProcessDefinition::getKey)
            .collect(Collectors.toList());
    }

}