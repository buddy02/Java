package OOPS.Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    Object[] data;
    int DEFAULT_SIZE = 10;
    int size = 0;

    public CustomGenArrayList() {
        data = new Object[10];
    }

    void add(T value) {
        if (size == DEFAULT_SIZE) {
            resize();
        }
        data[size++] = value;
    }

    void remove() {
        System.out.println(--size);
    }


    private void resize() {
        Object[] temp = new Object[DEFAULT_SIZE * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    

    @Override
    public String toString() {
        return "CustomGenArrayList [data=" + Arrays.toString(data) + ", DEFAULT_SIZE=" + DEFAULT_SIZE + ", size=" + size
                + "]";
    }

    public static void main(String[] args) {
        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add("aaa");
        }
        // list.add("afsfasf");
        System.out.println(list.toString());
    }
}
