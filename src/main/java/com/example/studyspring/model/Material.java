package com.example.studyspring.model;

import lombok.Data;

import java.time.Instant;

@Data
public class Material {
    private Instant id;
    private String name;
    private String key;

}
