package com.grzeprza.funlib.repository;

import com.grzeprza.funlib.enums.WorkCategory;
import com.grzeprza.funlib.enums.WorkType;
import com.grzeprza.funlib.model.Work;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Repository
public interface WorkRepository extends CrudRepository<Work, Long> {
    public List<Work> findByWorkTitle(String title);
    public List<Work> findByCategory(WorkCategory workCategory);
    public List<Work> findByWorkType(WorkType type);
    public List<Work> findByWorkLanguage(Locale locale);
    public List<Work> findAll();
    public List<Work> findByAuthorsFullNamesLike(String authorFullname);

}
