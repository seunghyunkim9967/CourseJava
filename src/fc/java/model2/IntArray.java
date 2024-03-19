package fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5; // 수정불가(final)=> 상수
    private int[] elements;
    private int size=0;
    //생성동작
    public IntArray() {
        elements=new int[DEFAULT_CAPACITY];
    }
    //저장
    public void add(int element){
        if(size==elements.length){
            //크기 2배로
            ensureCapacity();
        }
        // 크기체크
        elements[size++]=element;
    }

    public void ensureCapacity() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // 얻음
    public int get(int index) { //-1, 5~
        // index 체크

        return elements[index];
    }

    //원소의 개수 넘겨줌
    public int size() {
        return size;
    }

}
