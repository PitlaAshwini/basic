//static method and static block
class StaticExample{ 
    int num;
    static int value;
    static { 
            System.out.println("Static block");
}

       public static void message(){
          System.out.println("Static value="+value);
      }
      public void access(){
     System.out.println("num="+num+",static value="+value);// simple method
}
}
public class StaticDemo{
       public static void main(String args[]){
        StaticExample.message();
        StaticExample ex=new StaticExample();
        ex.num=30;
        ex.value=50;
        StaticExample.message();
        ex.access();

}
}
          