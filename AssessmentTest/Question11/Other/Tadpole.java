package AssessmentTest.Question11.Other;

import AssessmentTest.Question11.Animal.*;


public class Tadpole extends Frog{
   public static void main(String[] args){
     Tadpole t = new Tadpole();
     t.ribbit(); 
     t.jump();

     Frog f = new Tadpole();
     f.ribbit();
     f.jump();
   }
}