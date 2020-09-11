package LoopsAndArrays;

/**
 * Created By Arshak on Sep, 2020
 */
public class TwoDimensionalArrayToOne {

    public static void main(String[] args){
        int[][] array = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10}};
        int[] aaray002 = new int[10];


        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                aaray002[i]= array[i][j];
                System.out.print( aaray002[i]);
            }
        }
    }


}
