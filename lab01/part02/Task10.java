public class Task10 {
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
        rightRotate(a,4);
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void leftRotate(int[] arr, int offset) {
        int[] temp = new int[arr.length];
        for ( int i = 0; i < arr.length; i++ ) {
            int pos = (i - offset) % temp.length;
            if ( pos < 0 ) {
                pos += temp.length;
            }
            temp[pos] = arr[i];
        }
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
    public static void rightRotate(int[] arr, int offset) {
        int[] temp = new int[arr.length];
        for ( int i = 0; i < arr.length; i++ ) {
            int pos = (i + offset) % temp.length;
            temp[pos] = arr[i];
        }
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
