package org.headfirst;

public interface Menu {
    String name = "";
    Iterator createIterator();
    void addItem(MenuItem item);
    String getName();
}
