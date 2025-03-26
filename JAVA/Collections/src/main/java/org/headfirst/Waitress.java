package org.headfirst;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
    List<Menu> menus;
    public  Waitress(){
        menus = new ArrayList<>();
    }
    public void addMenu(Menu menu){
        menus.add(menu);
    }
    public void printMenus(){
        for(Menu menu: menus ){
            printMenu(menu);
        }
    }
    void printMenu(Menu menu){
        System.out.println(menu.getName());
        Iterator iterator = menu.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
