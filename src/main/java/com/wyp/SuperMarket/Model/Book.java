package com.wyp.SuperMarket.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Book {

    private String name;
    private String author;

    @JsonIgnore
    private Float price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;


}

