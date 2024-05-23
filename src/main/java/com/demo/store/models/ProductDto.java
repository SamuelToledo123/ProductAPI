package com.demo.store.models;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    @NotEmpty(message = "The name is required")
    private String name;

    @NotEmpty(message = "The brand is required")
    private String brand;

    @NotEmpty(message = "The category is required")
    private String category;

    @Min(0)
    private double price;

    @Size(min = 5, message = "The description should be atleast 10 characters")
    @Size(max = 2000, message = "The description cannot exceed 2000 characters")
    private String description;

    private MultipartFile imageFile;

}