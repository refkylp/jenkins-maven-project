package com.javaapp.demo;

public class JavaApp
{

    private final String message = "2.Pipeline SUCCESS – Java project is ready again";

    public JavaApp() {}

    public static void main(String[] args) {
        System.out.println(new JavaApp().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
