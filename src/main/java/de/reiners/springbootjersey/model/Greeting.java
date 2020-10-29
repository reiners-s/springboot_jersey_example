package de.reiners.springbootjersey.model;

public class Greeting {
    
    private String greetingText;

    public Greeting() {
        this.greetingText = "Hello Anonymous";
    }

    public Greeting(String name) {
        this.greetingText = "Hello " + name;
    }

    public String getGreetingText() {
        return greetingText;
    }

    public void setGreetingText(String greetingText) {
        this.greetingText = greetingText;
    }

}
