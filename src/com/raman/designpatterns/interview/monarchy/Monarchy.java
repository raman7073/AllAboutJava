package com.raman.designpatterns.interview.monarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Monarchy {
    public Map<String, Person> personMap;
    String king;

    public Monarchy(String king) {
        this.king = king;
        Person p = new Person(king);
        personMap = new HashMap<>();
        personMap.put(king, p);
    }

    //child is child of parent
    void birth(String child, String parent) {
        Person p = this.personMap.get(parent);
        Person c = new Person(child);
        p.child.add(c);
        personMap.put(child, c);
    }

    void death(String name) {
        personMap.get(name).isAlive = false;
    }


    // dfs order, alive person
    void dfs(Person p, List<String> ans) {
        if (p.isAlive) ans.add(p.name);
        for (Person c : p.child) {
            dfs(c, ans);
        }
    }

    List<String> getOrderOfSuccession() {
        List<String> ans = new ArrayList<>();
        dfs(this.personMap.get(king), ans);
        return ans;
    }
}
