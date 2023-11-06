import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> ll= List.of(List.of(1,2,3),List.of(4,5,6));
        ll.parallelStream().flatMap(obj->obj.stream().map(x->x+".."+Thread.currentThread().getName())).map(x->x+"--").forEach(System.out::println);
    }
}
