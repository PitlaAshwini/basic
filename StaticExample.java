//static method and static block
class StaticExample{ 
    static { 
            System.out.println("Static block");
}

       public static void message(){
          System.out.println("Static method");
      }
}
public class StaticDemo{
       public static void main(String args[]){
        StaticExample.message();
}
}
          