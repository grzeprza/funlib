package com.grzeprza.funlib.service;

import java.util.List;
import java.util.Locale;

import com.grzeprza.funlib.enums.WorkCategory;
import com.grzeprza.funlib.enums.WorkType;
import com.grzeprza.funlib.model.Work;

public interface WorkService {

    Work findById(Long id); 
    List<Work> findByTitle(String title);
    List<Work> findByAuthor(String authorFullname);
    List<Work> findByCategory(WorkCategory workCategory);
    List<Work> findByType(WorkType type);
    List<Work> findByLanguage(Locale locale);
    List<Work> findAll();
    Long save(Work newWork);
}
