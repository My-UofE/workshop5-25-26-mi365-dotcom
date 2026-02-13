public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      System.out.println(item);
    }
  }
}