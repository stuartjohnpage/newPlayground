package hourglassProblem;

public class HourglassProblem {
    public static void main(String[] args) {
        int[][] inputArray = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                inputArray[i][j] = 1;
            }
        }
        hourglassSum(inputArray);
    }
    static int hourglassSum(int[][] arr){
        int biggestHourglassSum= 0;
        int currentHourglassSum = 0;

        for(int i =0;i<2;i++) {
            int topSum = arr[0][i] + arr[0][i+1] + arr[0][i+2];
            int middleSum = arr[1][i+1];
            int botSum = arr[2][i] + arr[2][i+1] + arr[2][i+2];
            currentHourglassSum += topSum + middleSum + botSum;
            System.out.println(currentHourglassSum);
        }
//
//        arr[0][0,1,2]  array[0][1,2,3]
//        arr[1][1]      array[1][2]
//        arr[2][0,1,2]  array[2][1,2,3]
//
//        array[1][0,1,2]
//        array[2][1]
//        array[3][0,1,2]
//
//        array[2][0,1,2]
//        array[3][1]
//        array[4][0,1,2]
//
//        array[3][0,1,2]
//        array[4][1]
//        array[5][0,1,2]
//
//        array[4][0,1,2]
//        array[5][1]
//        array[6][0,1,2]

        return  biggestHourglassSum;
    }
}
