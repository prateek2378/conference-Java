package com.packages.service;

import com.packages.model.Speaker;
import com.packages.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl () {
        System.out.println("Inside SpeakerServiceImpl no args Constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("Inside SpeakerServiceImpl args Constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
    
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Inside SpeakerServiceImpl setter");
        this.repository = repository;
    }

}
