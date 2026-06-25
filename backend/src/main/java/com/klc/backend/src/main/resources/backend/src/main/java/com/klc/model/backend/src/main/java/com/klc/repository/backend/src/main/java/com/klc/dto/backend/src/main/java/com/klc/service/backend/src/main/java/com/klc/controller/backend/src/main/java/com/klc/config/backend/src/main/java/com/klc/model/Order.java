package com.klc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loadingCity;

    private String unloadingCity;

    private String cargoType;

    private Double weight;

    private String phone;

    @Column(length = 2000)
    private String comment;

    private String status = "НА РОЗГЛЯДІ";

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Order() {
    }

    // Generate Getters & Setters
}
