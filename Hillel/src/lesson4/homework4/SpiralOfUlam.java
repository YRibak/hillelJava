package lesson4.homework4;

/**
 * Created by yura on 02.07.15.
 */
public class SpiralOfUlam {
    public static void main(String[] args) {
        int n = 3;
        int size = 2*n+1;
        int itter = (int) Math.pow(size,2);
        System.out.println(size);
        int i=0;
        int j=0;
        int[][] array = new int[size+1][size+1];
        for (int k = 0; k<itter-1; k++){
            System.out.println(i + " | " + j + "  " + (n+i) + " | " + (n+j));
           array[n+i][n+j] = k;

//           if (i>j){
//               if (i>=(j-1)) {
//                   j++;
//               } else {
//                   i++;
//               }
//           }
//           else if (i==j){
//             if (i>=0) {
//                 j++;
//             } else {
//                 i++;
//             }
//           }
//           else{
//               if (i<(j)) {
//                   i = i-1;
//               } else {
//                   j = j-1;
//               }
//           }
       }
//        for (i=0; i<=size-1;i++){
//            for (j=0; j<=size-1; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
    }
}
