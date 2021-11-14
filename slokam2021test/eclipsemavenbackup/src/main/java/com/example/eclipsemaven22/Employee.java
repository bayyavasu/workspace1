package com.example.eclipsemaven22;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter 
@Getter
@Data
@NoArgsConstructor
public class Employee {
private Integer id;
private String name;
private final String newName="";
}
