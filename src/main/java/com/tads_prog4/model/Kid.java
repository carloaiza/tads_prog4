package com.tads_prog4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Kid {
    private String identification;
    private String name;
    private byte age;
}
