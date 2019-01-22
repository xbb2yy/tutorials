package com.xubing.designpattern;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/8 15:01
 */
public class Iterator模式 {
}

interface Aggregate {
    Iterator iterator();
}

interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}

class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int size) {
        books = new Book[size];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < last;
        }

        @Override
        public Object next() {
            Book book = getBookAt(index);
            index++;
            return book;
        }
    }
}


