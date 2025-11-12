package AssessmentTest;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Question4 {
    
    Predicate<String> empty = String::isEmpty;
    Predicate<String> notEmpty = empty.negate();

    public static void main(String args[]){
        //Add test code here

        //Add any print statment here
     Question4 q4 = new Question4();
     System.out.println(q4.empty.test("Hi"));
     System.out.println(q4.notEmpty.test("hello"));

     var result = Stream.generate(() -> "").filter(q4.notEmpty).limit(5);

     System.out.println(result);

    }
     
}
