package com.demo.store.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String brand;
    String category;
    double price;

    @Column(columnDefinition = "TEXT")
    String description;
    Date createdAt;
    String imageFileName;

}
