package com.ra.customearray;

public class MyListImp implements MyList {
    private Object[] source;
    private int size;

    public MyListImp() {
        this.source = new Object[MIN_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(Object item) {
        if (size == source.length) {
            // Resize kích thước mảng
            Object[] newArray = new Object[size + MIN_CAPACITY];
            System.arraycopy(source, 0, newArray, 0, source.length);
            source = newArray;
        }
        source[size] = item;
        size++;
    }
    @Override
    public void remove(Object item) {
        int index = findIndex(item);
        if (index != -1) {
            // VD:
            // src = [1,2,3,4,5,6,7]
            // Xóa số 3 đi
            // src = [1,2,4,5,6,7]
            System.arraycopy(source, index + 1, source, index, size - index - 1);
            size--;
        } else {
            System.out.println("Không tìm thấy phần tử \"" + item + "\" trong tập hợp");
        }
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Vượt quá phạm vi của mảng!");
            return null;
        }
        return source[index];
    }

    @Override
    public Object find(Object item) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(item))
                return source[i];
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(Object str) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(str))
                return true;
        }
        return false;
    }
    @Override
    public int findIndex(Object item) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(item))
                return i;
        }
        return -1;
    }
}
