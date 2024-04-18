class Pair<T,V>{
    private T ff;
    private V ss;
    Pair(T f, V s){
        this.ff = f;
        this.ss = s;
    }
    public T getFirst(){
        return ff;
    }
}
class Test {
    public static void main(String[] args) {
        Pair<Integer, Integer> p = new Pair<>(10, 20);
        System.out.println(p.getFirst());
    }
}