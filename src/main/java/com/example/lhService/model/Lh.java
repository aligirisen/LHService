package com.example.lhService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lh {
    private String id;
    private String property_name;
    private int price;
    private String house_type;
    private int area;
    private int bedroom;
    private int bathroom;
    private int reception;
    private String location;
    private String city;
    private String postal_code;

}
