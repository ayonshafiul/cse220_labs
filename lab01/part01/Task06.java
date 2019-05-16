public class Task06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1};
        int[] arr2 = {1,2,3,2,1};
        int[] arr3 = {1,2,4,5,6};
        System.out.println(isPaindrome(arr));
        System.out.println(isPaindrome(arr2));
        System.out.println(isPaindrome(arr3));
    }
    public static boolean isPaindrome(int[] arr) {
        int limit = arr.length / 2;
        boolean palindrome = true;
        for ( int i = 0; i < limit; i++ ) {
            if ( arr[i] != arr[arr.length - 1 - i ]) {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
