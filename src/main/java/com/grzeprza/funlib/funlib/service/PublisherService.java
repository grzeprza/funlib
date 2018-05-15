package com.grzeprza.funlib.funlib.service;

import com.grzeprza.funlib.funlib.model.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> findAll();

    Publisher findByName(String publisherName);
}
