package ru.honorzor.shoesshop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column (name = "name")
    private String name;
    @Column (name = "count")
    private int count;
    @Column (name = "size")
    private int size;
    @Column (name = "price")
    private double price;
    @Column (name = "description")
    private String description;

}
