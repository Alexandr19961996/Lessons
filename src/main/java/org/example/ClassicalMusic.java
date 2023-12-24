package org.example;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void initMethod() {
        System.out.println("Doing my initialisation");
    }

    public void destroyMethod() {
        System.out.println("Doing my destruction");
    }
}
