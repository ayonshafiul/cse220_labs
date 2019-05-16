public class Task01 {
    public static void main(String[] args) {
        int[] arr = {1,6};
        System.out.println(firstLast6(arr));
    }
    public static boolean firstLast6(int[] arr) {
        return arr[0] == 6 || arr[arr.length-1] == 6;
    }
}
