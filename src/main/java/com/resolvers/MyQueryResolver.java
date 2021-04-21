package com.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dao.SuperCharacterRepo;
import com.model.SuperCharacter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyQueryResolver implements GraphQLQueryResolver {

    private SuperCharacterRepo superCharacterRepo;

    public MyQueryResolver(SuperCharacterRepo repo){ this.superCharacterRepo = repo; }

    public List<SuperCharacter> characters(){ return superCharacterRepo.getCharacters(); }

    public SuperCharacter characterById(String id){
        return superCharacterRepo.getCharacterById(id);
    }

}
