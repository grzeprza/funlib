package com.grzeprza.funlib.funlib.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Commentary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "comm_id")
    private Long id;

//    @Column(name = "comm_auth")
    private String auth;

//    @Column(name = "comm_comment")
    private String commentary;

//    @Column(name = "comm_date")
    private LocalDateTime date;

    @ManyToOne
    private Book book;
}
