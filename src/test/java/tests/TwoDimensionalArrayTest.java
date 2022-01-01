package tests;

public class TwoDimensionalArrayTest {

    public static void main(String[] args) {
      int[] a = new int[3];
      int[] b= {3,5,6};
        int[][] c = new int[2][3]; //number of rows, number of columns
        c[0][0] = 2;
        c[0][1] = 4;
        c[0][2] =10;
        c[1][0] = 6;
        c[1][1] = 8;
        c[1][2] = 12;

        System.out.println("c.length = " + c.length);


        for (int i = 0; i < 2; i++) { //1  2
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j]); //0,1 ,1,0 ,1,1
            }
        }

        int[][] d = new int[][]{
                {7,8,9},{1,2,3},{6,3,7}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(d[i][j]);
            }
        }

        Object[][] e = new Object[][]{ //2*2 matrix
                {1,"sdfs"}, {"sfdsfd",3}
        };

        //all the classes are basically subclasses of object class implicitly



    }

}
