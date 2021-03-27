import java.util.*;

public class test {
    public static void main(String[] args) {
       Integer []a={1,1,1,6,6,7,7,7,7,9,3};
       List list= Arrays.asList(a);
       solution(list);


    }
   static  void solution(List<Integer> list){
        Map<Integer,Integer> m=new HashMap<>();
        for(Integer str:list) {
            if (m.containsKey(str)) {
                m.put(str, m.get(str)+1);
            } else {
                m.put(str, 1);
            }
        }
        List<Map.Entry<Integer,Integer>> sortList=new ArrayList<>(m.entrySet());
        Collections.sort(sortList,(o1, o2) -> {
        return o2.getValue()-o1.getValue();
        });
      sortList.forEach(l->{
          System.out.println(l.getKey()+"  "+l.getValue());
      });

    }
}
