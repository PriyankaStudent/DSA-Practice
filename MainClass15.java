class ClassOne {
    int methodOne(int i, int j) {
        return i++ + ++j - ++i - j++;
    }
}

abstract class ClassTwo extends ClassOne {
    abstract int methodOne(int i, int j, int k);

    @Override
    int methodOne(int i, int j) {
        return methodOne(i, j, i + j);
    }
}

class ClassThree extends ClassTwo {
    @Override
    int methodOne(int i, int j, int k) {
        return --i - j-- + ++k - i++ + ++j - k--;
    }
}

public class MainClass15 {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        ClassThree three = new ClassThree();
        System.out.println(three.methodOne(one.methodOne(2, 3),
                one.methodOne(3, 2)));
    }
}