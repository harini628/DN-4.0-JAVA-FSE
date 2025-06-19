public class Test {

    public static void main(String[] args) {
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();
        if(obj1 == obj2){
            System.out.println("It follows SINGLETON Design Pattern ");
        }else{
            System.out.println("It does not follows SINGLETON Design Pattern");
        }
        
        
        
    }

    
    
}
