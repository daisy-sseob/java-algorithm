package basicSarch;

public class basicSearch {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,56,6,243,1,2,3,3,10,28,49};
        int max = numbers[0];
        int maxPos = 1;
        int min = numbers[0];
        int minPos = 1;

        for ( int i=1; i<numbers.length; i++ ){

            int present = numbers[i];
            if (present > max) {
                max = present;
                maxPos = i + 1;
            }

            if (present < min) {
                min = present;
                minPos = i + 1;
            }
        }

        System.out.println("max : " + max + " | maxPos : " + maxPos);
        System.out.println("min : " + min + " | minPos : " + minPos);
    }
}