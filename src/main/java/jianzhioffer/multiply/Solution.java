package jianzhioffer.multiply;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * https://www.nowcoder.com/practice/94a4d381a68b47b7a8bed86f2975db46
 */
public class Solution {
    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) return new int[0];
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = A[i - 1] + B[i - 1];
        }
        int temp = 1;
        for(int j = A.length-2; j >= 0; j--){
            temp *= A[j+1];
            B[j] *= temp;
        }
        return B;
    }
}
