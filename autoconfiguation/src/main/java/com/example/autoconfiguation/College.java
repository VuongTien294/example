package com.example.autoconfiguation;

import org.springframework.stereotype.Component;

@Component("college")
public class College {
    public void printCollegeName(){
        System.out.println("College name is : " + "UTT");
    }
}
