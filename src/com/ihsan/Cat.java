package com.ihsan;

public class Cat extends Animal implements LandAnimal {
    private String type;
    private String nationality;

    public Cat(String name, String type, String nationality) {
        super(name);
        this.type = type;
        this.nationality = nationality;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }
}
