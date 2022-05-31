package org.example;

public class ArrayDemo {
    private char s[];

    public void createArray(int size) {
        s = new char[size];
        for (int i = 0; i < s.length; i++) {
            s[i] = (char)('A'+i);
        }
    }

    public void displayArray() {
        for (int i = 0; i < s.length; i++) {
            System.out.println("\t"+s[i]);
        }
    }
}
