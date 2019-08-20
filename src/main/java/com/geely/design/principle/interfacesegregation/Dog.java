package com.geely.design.principle.interfacesegregation;

public class Dog implements IEatAnimalAction,ISwimAnimalAction {
    @Override
    public void eat() {
        return;
    }

    @Override
    public void swim() {
        return;
    }
}
