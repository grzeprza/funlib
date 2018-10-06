package com.grzeprza.funlib.model;

import com.grzeprza.funlib.enums.WorkCategory;
import com.grzeprza.funlib.enums.WorkLengthUnit;
import com.grzeprza.funlib.enums.WorkType;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@Entity
@Data
//@Builder
@NoArgsConstructor
public class Work {

    @Id
    @Column(name = "work_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "work_title")
    private String workTitle;

    @Column(name = "work_type")
    @Enumerated(value = EnumType.STRING)
    private WorkType workType;

    @Column(name = "work_category")
    @Enumerated(value = EnumType.STRING)
    private WorkCategory category;

    @Column(name = "work_link")
    private String workLink;

    @Column(name = "work_length")
    private Integer workLength;

    @Column(name = "work_length_unit")
    @Enumerated(value = EnumType.STRING)
    private WorkLengthUnit workLengthUnit;

    @Column(name = "work_language")
    private Locale workLanguage;

    @Column(name = "work_authors")
    private String authorsFullNames;
}
