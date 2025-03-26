package org.headfirst;

public class MenuItem {
    String name;
    boolean isVeg;
    public MenuItem(String name, boolean isVeg){
        this.name=name;
        this.isVeg = isVeg;
    }

    @Override
    public String toString() {
        return name + " : isVeg=" + isVeg;
    }
}
