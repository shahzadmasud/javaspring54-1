/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class7;

import com.evs.javaspring54.class5.Animal;
import java.io.Serializable;

/**
 *
 * @author ok
 */
public class MyLinkList<T > {// extends Animal & Serializable

    private ListItem start, end, current;

    public MyLinkList() {
    }

    public MyLinkList(T item) {
        addItem(item);
    }

    public MyLinkList(T[] items) {
        addItems(items);
    }

    public void addItem(T item) {
        ListItem it = new ListItem(item);
        if (start == null) {
            start = end = it;
        } else {
            end.next = it;
            end = it;
        }
    }

    public void addItems(T[] items) {
        for (T it : items) {
            addItem(it);
        }
    }

    public T getFirst() {
        current = start;
        return current != null ? current.item : null;
    }

    public T getNext() {
        if (current != null) {
            current = current.next;
        }
        return current != null ? current.item : null;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (T item = getFirst();
                item != null;
                item = getNext()) {
            buf.append(item);
            buf.append(current.next != null ? "," : "");
        }
        return buf.toString();
    }

    private class ListItem {

        T item;
        ListItem next;

        public ListItem(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "ListItem{" + "item=" + item + '}';
        }
    }

}
