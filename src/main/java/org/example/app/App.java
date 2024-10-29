package com.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("name", "Dmytro");
        nameMap.put("lastName", "Mikulin");

        Gson gson = new Gson();
        String json = gson.toJson(nameMap);

        System.out.println(json);
    }
}
