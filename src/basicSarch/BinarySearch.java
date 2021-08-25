package basicSarch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 83;
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        int mid = (left + right) / 2;

        int temp = numbers[mid];
        while (right >= left) {

            if (target == temp) {
                break;
            }
        }

        System.out.println(temp);
    }
}
