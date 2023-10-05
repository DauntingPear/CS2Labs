package StatePopulations;

public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
    private Type1 value1;
    private Type2 value2;

    public StatePair(Type1 value1, Type2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public Type1 getValue1() {
        return value1;
    }

    public void setValue1(Type1 value1) {
        this.value1 = value1;
    }

    public Type2 getValue2() {
        return value2;
    }

    public void setValue2(Type2 value2) {
        this.value2 = value2;
    }

    public void printInfo() {
        System.out.println();
    }
}
