package OOPS.Generics;

import java.util.Arrays;

public class CustomArrayList {

    int[] data;
    int DEFAULT_SIZE = 10;
    int size = 0;

    public CustomArrayList() {
        data = new int[10];
    }

    void add(int value) {
        if (size == DEFAULT_SIZE) {
            resize();
        }
        data[size++] = value;
    }

    void remove(int value) {
        System.out.println(--size);
    }


    private void resize() {
        int[] temp = new int[DEFAULT_SIZE * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    

    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", DEFAULT_SIZE=" + DEFAULT_SIZE + ", size=" + size
                + "]";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());
    }
}
