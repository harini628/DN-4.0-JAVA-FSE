import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = { new Product(103, "Watch", "Accessories"), new Product(101, "Laptop", "Electronics"), new Product(104, "Phone", "Electronics"), new Product(102, "Shoes", "Footwear") };

        Product foundLinear = Search.linearSearch(products, 104);
        if (foundLinear != null){
            System.out.println("Linear Search Result: " + foundLinear);
        }
        else{
            System.out.println("Product not found using Linear Search");
        }
      
        Arrays.sort(products, (a, b) -> a.productId - b.productId);

        Product foundBinary = Search.binarySearch(products, 104);
        if(foundBinary != null){
            System.out.println("Binary Search Result: " + foundBinary);
        }
        else{
            System.out.println("Product not found using Binary Search");
        }
    }
}
