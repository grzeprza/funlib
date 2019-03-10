package com.grzeprza.funlib.service;

import java.util.List;
import java.util.Locale;

import com.grzeprza.funlib.enums.WorkCategory;
import com.grzeprza.funlib.enums.WorkType;
import com.grzeprza.funlib.model.Work;
import com.grzeprza.funlib.repository.WorkRepository;

import org.springframework.stereotype.Service;

@Service
public class WorkServiceImp implements WorkService {

    private final WorkRepository workRepository;

    public WorkServiceImp(WorkRepository workRepository) {
        this.workRepository = workRepository; 
    }

    @Override
    public Work findById(Long id) {
        return workRepository.findById(id).get();
    }

    @Override
    public List<Work> findByTitle(String title) {
        return workRepository.findByWorkTitle(title);
    }

    @Override
    public List<Work> findByAuthor(String authorFullname) {
        return workRepository.findByAuthorsFullNamesLike(authorFullname);
    }

    @Override
    public List<Work> findByCategory(WorkCategory workCategory) {
        return workRepository.findByCategory(workCategory);
    }

    @Override
    public List<Work> findByType(WorkType type) {
        return workRepository.findByWorkType(type);
    }

    @Override
    public List<Work> findByLanguage(Locale locale) {
        return workRepository.findByWorkLanguage(locale);
    }

    @Override
    public List<Work> findAll() {
        return workRepository.findAll();
    }

    @Override
    public Long save(Work newWork) {
        return workRepository.save(newWork).getId();
    }
}
