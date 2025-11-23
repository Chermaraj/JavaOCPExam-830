package AssessmentTest;

interface HasTail{
    default int getTailLength()
    {
        return 2;
    }
}

abstract class Puma implements HasTail{
    int getTailLength(){
        return 4;
    }
}

public class Question10 implements HasTail{
  int length = 10; 
  try{
    var puma = new Puma(){
        public int getTailLength(){
            return length;
        }
    };
    System.out.println(puma.getTailLength());
  }catch (Exception e){
    length ++;
  }}
  public int getTailLength(int lenght){return 2;}
}

