package com.devstack.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long code;
    @Column(length = 700)
    private String description;
    private int qty;
    private double cost;

    @ManyToMany()
    private List<Order> orders=new ArrayList<>();
}
