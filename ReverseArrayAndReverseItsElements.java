/*
@author: Sajjad SHAH POOR


*/



public class ReverseArrayAndReverseItsElements{
    public static void main(String[] args) {
        int [] arr = new int [] {47, 29, 34, 12, 53, 98};
        System.out.println("Original array: ");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != (arr.length-1)){
                System.out.print("-");
            }
        }
        System.out.print("}");
        System.out.println();
        System.out.println("Array in reverse order: ");
        System.out.print("{");
        for (int i = arr.length-1; i >= 0; i--) {
            int n = arr[i];
            int reverse = 0;
            while(n != 0)
            {
                reverse = reverse * 10;
                reverse = reverse + n%10;
                n = n/10;
            }
            System.out.print(reverse);
            if(i != 0){
                System.out.print("-");
            }
        }
        System.out.print("}");
    }
}