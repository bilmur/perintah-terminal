/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inittesting;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public String ok() {
     String b ="ceksound";
     String w ="ceksound okok";

        return b;
    }

public int hitung(){
 
        int a =5;
        int b = 10;
        int nilai =0;
        nilai = 5+5;
       return nilai;
    }
  



    public static void main(String[] args) {
        App ap = new App();
        kalkulator kal = new kalkulator();
        System.out.println(ap.getGreeting());
        System.out.println(ap.ok());
        System.out.println(ap.hitung());
        System.out.println("======BATASCLASS======");
        System.out.println(kal.gethalo());
        System.out.println(kal.ok1());
        System.out.println(kal.hitung1(3,3));
        System.out.println(kal.multiply(10,0));
        System.out.println(kal.multiply(0,10));
        System.out.println(kal.multiply(0,0));
       

       
        
    }


}