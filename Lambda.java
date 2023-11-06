import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        String input="iloveloveyou";
        //count each char occurance
        Map<String,Long> result=Arrays.stream(input.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(result);

        //find duplicate element
        List<String> duplicates=Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("dupliacte elment "+duplicates);
        //unique elements
        List<String> unique=Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("unique  "+unique);

        //find first nonrepeat element in string
       String firstnonrepeatchar=Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst().get();
        String firstnonrepeatchar1= Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
        System.out.println("first non repnchatr "+firstnonrepeatchar);
        System.out.println("String firstnonrepeatchar"+firstnonrepeatchar1);
        /*{u=1, e=2, v=2, y=1, i=1, l=2, o=3}
        dupliacte elment [e, v, l, o]
        unique  [u, y, i]
        first non repnchatr u
        String firstnonrepeatcharu*/

        //order is not preserved so we have to use linkedhashmap to store identity and its occurance
        String firstnonrepeatchar2= Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
        System.out.println("first non reoeat liked hash "+firstnonrepeatchar2);

        //second highest num
        int[] nums={5,2,1,4,7};
        Integer secondhigh= Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(secondhigh);
        Integer thirdhigh= Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(thirdhigh);

        //longest string in an array
        String[] arr={"java","citi","jpmcmorgan"};
        String longword=Arrays.stream(arr).
                reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println(longword);

        //elemnet from an array starts with 1
        int[] arr1={5,2,11,4,7,12};
        List<String> l=Arrays.stream(arr1).boxed().map(s->s+"").
                filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(l);

        Map<String,Integer> map=new HashMap<>();
        map.put("eight",8);
        map.put("four",4);
        Collections.sort(Arrays.asList(map.entrySet().toArray()), new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        //string join method

    }
}
