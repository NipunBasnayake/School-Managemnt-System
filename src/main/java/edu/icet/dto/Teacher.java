package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import util.GenderType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher {
    private int id;
    private String name;
    private String subject;
    private int age;
    private GenderType gender;
    private String address;
}
