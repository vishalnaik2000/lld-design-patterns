package org.headfirst;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu bfmenu = new BreakfastMenu();
        Menu lunchMenu=new LunchMenu(6);
        Waitress waitress = new Waitress();
        waitress.addMenu(new BreakfastMenu());
        waitress.addMenu(new LunchMenu(7));
        waitress.printMenus();
    }
}