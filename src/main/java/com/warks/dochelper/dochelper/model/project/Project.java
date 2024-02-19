package com.warks.dochelper.dochelper.model.project;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "project")
@Data
public class Project {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "short_name")
    private String shortName;

    @Column
    @Enumerated(EnumType.STRING)
    private String status;

}
