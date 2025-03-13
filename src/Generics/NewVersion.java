package Generics;

public class NewVersion <T , V>{
    T first;
    V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
     // we are creating our own type in the method level also like
   public <K> K doSomething(K something){
        return something;
   }
}
