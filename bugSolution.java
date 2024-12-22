public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //System.out.println(arr[5]); //this line is removed. Accessing index 5 is out of bound
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}