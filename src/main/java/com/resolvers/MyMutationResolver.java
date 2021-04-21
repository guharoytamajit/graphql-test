package com.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.dao.SuperCharacterRepo;
import com.model.SuperCharacter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyMutationResolver implements GraphQLMutationResolver {
    private SuperCharacterRepo characterRepo;

    public MyMutationResolver(SuperCharacterRepo repo){
        this.characterRepo = repo;
    }

    public SuperCharacter addCharacter(String name, Integer age){
        return characterRepo.addCharacter(name, age);
    }

}
