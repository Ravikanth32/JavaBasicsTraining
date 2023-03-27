package org.example.arraysexamples;

public class TestingArrays {
    public static void main(String[] args) {
        int person1Age = 30;
        int person2Age = 40;
//        Sample cla = new Sample();

//        int[] v1 = {1,5,6};

//        System.out.println(person1Age);
//        int[] v2 = new int[5];
//        v2[0] = 1;
//        v2[1] = 2;
//        v2[2] = 3;
//        v2[3] = 4;
//
//        for (int i = 0; i < v2.length; i++) {
//            System.out.print(v2[i]);
//        }

        int[] arr = new int[5];
//
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
// [1,2,3,4,5] = 15
        // 0 1 2 3 4 = 10
        // 30 60 100
//        int sum =0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
////            System.out.println(sum);
//        }
//        System.out.println("total sum "+sum);

        int[][] matrix = {{1,2,3},{4,5,6}}; // 3 * 2

        // [0][0] =1
        // 1 2 3 =>0 0[0] 0[1] 0[2]
        // 4 5 6 =>1 1[0] 1[1] 1[2]
        // [1][1] = 5
//        System.out.println(matrix[1][1]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(i+"*"+j+"="+matrix[i][j] +" ");
            }
            System.out.println("");
        }
        
        
    }
}
