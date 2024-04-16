package untitled.src.day2;
public class exercise6_20 {

  private static int[] shuffle(int[] original) {
    int[] temp = new int[original.length];
    for (int i = 0; i < original.length; i++) {
      temp[i] = (int) (Math.random() * 10);
    }
    return temp;
  }



  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(java.util.Arrays.toString(original));

    int[] result = shuffle(original);
    System.out.println(java.util.Arrays.toString(result));
  }


}


