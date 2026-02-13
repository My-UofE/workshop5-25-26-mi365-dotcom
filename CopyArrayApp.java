import java.util.Arrays;
import java.util.ArrayList;


public class CopyArrayApp{
  public static void main(String[] args) {

    int nVals = args.length;
    
    // to create a new array of ints
    int[] myVals = new int[nVals]; 
    
    for (int i = 0; i < nVals; i++) {
      
      int item = Integer.parseInt(args[i]);
      
      // to allocate a value into the created array at index i
      myVals[i] = item;
    }

    System.out.println("Original values: " + Arrays.toString(myVals));

    ArrayList<Integer> uniqueVals = new ArrayList<>();

    for(int i = 0; i < myVals.length; i++ ){

        int values = myVals[i];

        // add only if not already present
        if (!uniqueVals.contains(values)) {
            uniqueVals.add(values);
            }
    }

    



    System.out.println("Unique values: " + uniqueVals);
  }
}
