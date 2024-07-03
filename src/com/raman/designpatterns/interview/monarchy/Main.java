package com.raman.designpatterns.interview.monarchy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monarchy m = new Monarchy("King XLV");
        m.birth("Alice", "King XLV");
        m.birth("Bob", "King XLV");
        m.birth("Chandan Mangler", "Bob");
        System.out.println(m.personMap.size());
        List<String> ans = m.getOrderOfSuccession();
        System.out.println(ans.size());
        for (String s : ans) {
            System.out.println(s + " ");
        }
    }
}
