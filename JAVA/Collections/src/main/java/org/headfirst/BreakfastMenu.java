package org.headfirst;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BreakfastMenu implements Menu{
    final String name = "BreakFast Menu";
    List<MenuItem> list;
    public BreakfastMenu(){
        list = new ArrayList<>();
        list.add(new MenuItem("bf1",true));
        list.add(new MenuItem("bf2",false));
        list.add(new MenuItem("bf3",true));
        list.add(new MenuItem("bf4",false));
    }

    public void addItem(MenuItem item){
        list.add(item);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void printMenu(){
        System.out.println("The Breakfast Menu is ..");
        for(MenuItem item : list){
            System.out.println(item);
        }
    }
    public Iterator createIterator(){
        return new BreakfastIterator(list);
    }
}
