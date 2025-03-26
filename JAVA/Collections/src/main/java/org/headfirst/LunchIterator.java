package org.headfirst;

public class LunchIterator implements Iterator {
    MenuItem[] array;
    int idx ;
    int currSize;
    public LunchIterator(MenuItem[] array,int currSize){
        this.array=array;
        idx =0;
        this.currSize=currSize;
    }
    @Override
    public boolean hasNext() {
        return idx < currSize;
    }
    @Override
    public MenuItem next() {
        return array[idx++];
    }
}
