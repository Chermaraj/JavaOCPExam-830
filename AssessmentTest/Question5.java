package AssessmentTest;

public class Question5 {
    public static void addToInt(int x, int amountToAdd)
    {
        x = x + amountToAdd % -5;
     }

     public static void main(String args[])
     {
        var a = 15;
        var b = 10;
        
        Question5.addToInt(a, b);
        System.out.println(a);
     }
}
