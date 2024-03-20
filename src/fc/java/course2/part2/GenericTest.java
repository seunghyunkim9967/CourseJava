package fc.java.course2.part2;

import fc.java.model2.ObjectArr;

import javax.xml.transform.stream.StreamSource;

public class GenericTest {
    public static void main(String[] args) {
        //<T> 제네릭타입 어떤 타입이 올지 몰라 ObjectArr size = 5;
        ObjectArr<String> array = new ObjectArr<>(5);
        array.set(0, "hello");
        array.set(1, "World");
        array.set(2, "java");
        array.set(3, "Generic");

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

//        ObjectArr<Movie> bList = new ObjectArr<>(5);
//        bList.set(0, new Movie("괴물","봉준호","2006","한국"));
//        bList.set(1, new Movie("괴물2","봉준호","2008","한국"));
    }
}
