package com.raman.designpatterns.structural.flyweight.wordprocessor.solution;


import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, Letter> characterCache = new HashMap<>();

    public static Letter createLetter(char characterValue) {
        if (characterCache.containsKey(characterValue)) {
            return characterCache.get(characterValue);
        } else {
            DocumentCharacter character = new DocumentCharacter(characterValue, "Arial", 10);
            characterCache.put(characterValue, character);
            return character;
        }
    }
}
