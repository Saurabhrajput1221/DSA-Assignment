package Overriding;
public class Overriding {
 public static   class A{
      public static String meth(){
        return "Invoking method from class A";
      }
    }
  public static  class B extends A{
        public static String meth(){
        return "Method is overridden in Extendend class B";
      }
      
    }
    public static void main(String args[]){ 
    // B obj = new B();  
    // System.out.println( obj.meth());
    // System.out.println( obj.meth());
     
    }  
  }