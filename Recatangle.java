class Recatangle{
   //instance variables,instance methods
    static int length,breadth;
  int area(int l, int b){
    length=l; // initialize
    breadth=b;
    return length*breadth;
    }
  int perimeter(int l ,int b){
  length=l;
  breadth=b;
  int p=2*(length+breadth);
  return p;
  }

    public static void main(String args[]){
   Recatangle r=new Recatangle();
  int area=r.area(20,30);
 System.out.println(area);
 System.out.println("perimeter="+r.perimeter(20,30));
 

 
}
}
 