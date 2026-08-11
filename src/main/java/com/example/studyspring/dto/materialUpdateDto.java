package com.example.studyspring.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class materialUpdateDto {
    @NotEmpty(message = "id不能为空")
    private String id;

    @NotBlank(message = "name不能为空")
    private String name;

    @NotBlank(message = "key不能为空")
    private String key;
}
