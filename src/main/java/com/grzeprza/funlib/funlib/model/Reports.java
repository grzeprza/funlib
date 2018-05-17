package com.grzeprza.funlib.funlib.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "repo_id")
    private Long id;

    @Column(name = "repo_auth")
    private String auth;

    @Column(name = "repo_comment")
    private String commentary;

    @Column(name = "repo_date")
    private LocalDateTime date;

    @ManyToOne
    private Book book;
}
