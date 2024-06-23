public class missingNum {
    public static void main(String args[]) {
        int arr[] = { 12, 15, 14, 11 };
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        int sum2 = 0;

        for (int i = 11; i <= 15; i++) {
            sum2 = sum2 + i;
        }
        int MissNum = sum2 - sum1;

        System.out.println("Missing Number is :" + MissNum);

    }
}
