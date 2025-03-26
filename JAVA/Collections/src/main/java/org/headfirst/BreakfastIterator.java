package org.headfirst;

import java.util.List;

public class BreakfastIterator implements Iterator{
    List<MenuItem> list;
    int idx;
    public BreakfastIterator(List<MenuItem> list){
        idx = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return idx < list.size() ;
    }

    @Override
    public MenuItem next() {
        MenuItem item = list.get(idx);
        idx++;
        return item;
    }
}
