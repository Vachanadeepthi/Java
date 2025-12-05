class Simple {
    int defaultVar = 20;          // package-private
    protected int protectedVar = 30;
    public int publicVar = 40;

}

public class sample2 {
    public static void main(String[] args) {
        Simple obj = new Simple();
        // System.out.println(obj.privateVar); 
        System.out.println(obj.defaultVar);     
        System.out.println(obj.protectedVar);  
        System.out.println(obj.publicVar);      
    }
}

