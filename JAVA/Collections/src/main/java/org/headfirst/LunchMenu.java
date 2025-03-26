package org.headfirst;

public class LunchMenu implements Menu {
    final String name = "Lunch Menu";
    int maxSize;
    int currSize;
    MenuItem[] array;
    public LunchMenu(int x){
        maxSize=x;
        currSize = 0;
        array = new MenuItem[maxSize];
        this.addItem(new MenuItem("ln1",false) );
        this.addItem(new MenuItem("ln2",true) );
        this.addItem(new MenuItem("ln3",false) );
    }
    public void addItem(MenuItem item){
        if(currSize == maxSize){
            System.out.println("Oopes ! the menu is full.");
            return;
        }
        array[currSize++] = item;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Iterator createIterator(){
        return new LunchIterator(array,currSize);
    }

}
