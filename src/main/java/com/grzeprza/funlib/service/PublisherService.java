package com.grzeprza.funlib.service;

import com.grzeprza.funlib.model.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> findAll();

    Publisher findByName(String publisherName);
}
