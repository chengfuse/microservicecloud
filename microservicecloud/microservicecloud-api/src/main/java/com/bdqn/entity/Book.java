package com.bdqn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int bid;
    private String bname;
    private User user;
    private int uid;
    private double price;
    private Date createTime;
    private String data_source;
}
