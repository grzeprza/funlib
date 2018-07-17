package com.grzeprza.funlib.service;

import com.grzeprza.funlib.model.Publisher;
import com.grzeprza.funlib.repository.PublisherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@Slf4j
public class PublisherServiceImpl implements PublisherService{

    private PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Publisher> findAll() {
        List<Publisher> publishers = new LinkedList<>();
        publisherRepository.findAll().forEach(publisher -> publishers.add(publisher));
        return publishers;
    }

    @Override
    public Publisher findByName(String publisherName) {
        Publisher publisher = publisherRepository.findByName(publisherName);
        if(publisher == null){
            log.debug(String.format("No publisher with name %s found", publisherName));
        }
        return publisher;
    }
}
