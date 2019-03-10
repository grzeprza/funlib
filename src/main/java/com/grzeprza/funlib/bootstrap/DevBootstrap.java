package com.grzeprza.funlib.bootstrap;

import java.util.Locale;

import com.grzeprza.funlib.enums.WorkCategory;
import com.grzeprza.funlib.enums.WorkLengthUnit;
import com.grzeprza.funlib.enums.WorkType;
import com.grzeprza.funlib.model.Work;
import com.grzeprza.funlib.service.WorkService;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

   private WorkService workService;

    public DevBootstrap(WorkService workService) {
        this.workService = workService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initStaticData();
    }

    private void initStaticData() {
        Work work1 = new Work();
        work1.setAuthorsFullNames("Adam Johns");
        work1.setWorkTitle("Interview with Adam Johns");
        work1.setWorkLength(13);
        work1.setWorkLengthUnit(WorkLengthUnit.MIN);
        work1.setWorkLink("www.google.pl");
        work1.setWorkType(WorkType.MOBI);
        work1.setCategory(WorkCategory.SATIRE);
        work1.setWorkLanguage(Locale.CHINESE);

        Work work2 = new Work();
        work2.setAuthorsFullNames("John Johns");
        work2.setWorkTitle("Interview with Yeti");
        work2.setWorkLength(1);
        work2.setWorkLengthUnit(WorkLengthUnit.PAGES);
        work2.setWorkLink("www.google.pl");
        work2.setWorkType(WorkType.MP3);
        work2.setCategory(WorkCategory.HISTORY);
        work2.setWorkLanguage(Locale.ENGLISH);

        Work work3 = new Work();
        work3.setAuthorsFullNames("John Johns");
        work3.setWorkTitle("Interview with Zombie");
        work3.setWorkLength(15);
        work3.setWorkLengthUnit(WorkLengthUnit.HOUR);
        work3.setWorkLink("www.google.pl");
        work3.setWorkType(WorkType.PDF);
        work3.setCategory(WorkCategory.FANTASY);
        work3.setWorkLanguage(Locale.US);

        workService.save(work1);
        workService.save(work2);
        workService.save(work3);
    }
}
