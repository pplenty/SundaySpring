package com.jason.sample.domain;

import lombok.Data;

import java.util.Date;

@Data
public class TodoDTO {

    private String title;
    private Date dueDate;

}