package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    /*@PostConstruct
    public void init() {
        this.name = "Kiki";
    }*/

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
