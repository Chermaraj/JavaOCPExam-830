package AssessmentTest;

import java.util.Collections;
import java.util.SequencedMap;
import java.util.TreeMap;

public class Question20 {
   

    public static void main(String[] args) {
    SequencedMap<Character, Integer> t = new TreeMap<>();
    t.put('k',1);
    t.put('m',2);

    var u = Collections.unmodifiableMap(t);

    t.put('m',4);
    t.putFirst('x',5);
    t.putLast('x',5);

    t.replaceAll((k,v) -> v + v);
    u.entrySet()
    .stream()
    .map(e -> e.getValue())
    .forEach(System.out::print);

    }
    
}


