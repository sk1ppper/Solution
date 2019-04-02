package com.google;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Check");
        Cat cat=new Cat();
        cat.name="Murat";
        cat.lastName="Urazbaev";
        cat.age=22;
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer,cat);
        System.out.println(writer.toString());
        String jsonText = "{\"name\":\"msm\",\"lastName\":\"killer\",\"age\":228}";
        StringReader reader = new StringReader(jsonText);
        Cat cati;
        cati = mapper.readValue(reader,Cat.class);
        System.out.println(cati.name);



    }
    @JsonAutoDetect
    public static class Cat{
        @JsonProperty(value="alias")
        public String name;
        public String lastName;
        public int age;
        public Cat(){

        }
    }
}