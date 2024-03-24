package fc.java.model2;

@FunctionalInterface // 함수형 인터페이스
public interface MathOperation {

    public int operation(int x, int y); //추상 메서드, 추상메서드는 하나만 가지고 있어야함.

}
