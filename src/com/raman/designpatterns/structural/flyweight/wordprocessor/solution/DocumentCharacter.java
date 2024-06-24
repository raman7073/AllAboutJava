package com.raman.designpatterns.structural.flyweight.wordprocessor.solution;

public class DocumentCharacter implements Letter {
    private char character;
    private String fontType;
    private int size;

    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    public char getCharacter() {
        return character;
    }

    public String getFontType() {
        return fontType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display(int row, int column) {

    }
}
