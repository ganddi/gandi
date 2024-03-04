package newpackage;

import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[][] array2  = new int[5][4];
        int[][][] array3 = new int[5][4][3];
        int[][][][] array4 = new int[5][4][3][2];
        int[][][][][] array5 = new int[5][4][3][2][1];
        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        for (int j = 0; j < array2[i].length; j++) {
            array2[i][j] = i + j;
        for (int k = 0; k < array3[i][j].length; k++) {
            array3[i][j][k] = i + j + k;
        for (int l = 0; l < array4[i][j][k].length; l++) {
            array4[i][j][k][l] = i + j + k + l;
        for (int m = 0; m < array5[i][j][k][l].length; m++) {
            array5[i][j][k][l][m] = i + j + k + l + m;
        }}}}}
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(array3));
        System.out.println(Arrays.deepToString(array4));
        System.out.println(Arrays.deepToString(array5));
    
    // double
        
        double[] double1 = new double[5];
        double[][] double2  = new double[5][4];
        double[][][] double3 = new double[5][4][3];
        double[][][][] double4 = new double[5][4][3][2];
        double[][][][][] double5 = new double[5][4][3][2][1];
        
        for (int i = 0; i < double1.length; i++) {
            double1[i] = i + 1.1;
        for (int j = 0; j < double2[i].length; j++) {
           double2[i][j] = i + j + 2.2;
        for (int k = 0; k < double3[i][j].length; k++) {
            double3[i][j][k] = i + j + k + 3.3;
        for (int l = 0; l < double4[i][j][k].length; l++) {
            double4[i][j][k][l] = i + j + k + l + 4.4;
        for (int m = 0; m < double5[i][j][k][l].length; m++) {
            double5[i][j][k][l][m] = i + j + k + l + m + 5.5;
        }}}}}
        System.out.println(Arrays.toString(double1));
        System.out.println(Arrays.deepToString(double2));
        System.out.println(Arrays.deepToString(double3));
        System.out.println(Arrays.deepToString(double4));
        System.out.println(Arrays.deepToString(double5));
        
        
        
        Double[] arrayd1 = new Double[5];
        Double[][] arrayd2 = new Double[5][4];
        Double[][][] arrayd3 = new Double[5][4][3];
        Double[][][][] arrayd4 = new Double[5][4][3][2];
        Double[][][][][] arrayd5 = new Double[5][4][3][2][1];
        for (int i = 0; i < arrayd1.length; i++) {
           arrayd1[i] = 1.5 * i;
        for (int j = 0; j < arrayd2[i].length; j++) {
           arrayd2[i][j] =  2.5 * i + j;  
        for (int k = 0; k < arrayd3[i][j].length; k++) {
           arrayd3[i][j][k] = 3.5 * i + j + k;
        for (int l = 0; l < arrayd4[i][j][k].length; l++) {
           arrayd4[i][j][k][l] = 4.5 * i + j + k + l;
        for (int m = 0; m < arrayd5[i][j][k][l].length; m++) {
           arrayd5[i][j][k][l][m] = 5.5 * + i + j + k + l + m;
        }}}}}
        System.out.println(Arrays.toString(arrayd1));
        System.out.println(Arrays.deepToString(arrayd2));
        System.out.println(Arrays.deepToString(arrayd3));
        System.out.println(Arrays.deepToString(arrayd4));
        System.out.println(Arrays.deepToString(arrayd5));
        
        //Integer
        
        Integer[] Int1 = new Integer[5];
        Integer[][] Int2  = new Integer[5][4];
        Integer[][][] Int3 = new Integer[5][4][3];
        Integer[][][][] Int4 = new Integer[5][4][3][2];
        Integer[][][][][] Int5 = new Integer[5][4][3][2][1];
        
        for (int i = 0; i < Int1.length; i++) {
            Int1[i] = i + 1;
        for (int j = 0; j < Int2[i].length; j++) {
            Int2[i][j] = i + j + 2;
        for (int k = 0; k < Int3[i][j].length; k++) {
            Int3[i][j][k] = i + j + k + 3;
        for (int l = 0; l < Int4[i][j][k].length; l++) {
            Int4[i][j][k][l] = i + j + k + l + 4;
        for (int m = 0; m < Int5[i][j][k][l].length; m++) {
            Int5[i][j][k][l][m] = i + j + k + l + m + 5;
        }}}}}
        System.out.println(Arrays.toString(Int1));
        System.out.println(Arrays.deepToString(Int2));
        System.out.println(Arrays.deepToString(Int3));
        System.out.println(Arrays.deepToString(Int4));
        System.out.println(Arrays.deepToString(Int5));
        
        // String
        
        String[] string1 = new String[5];
        String[][] string2  = new String[5][4];
        String[][][] string3 = new String[5][4][3];
        String[][][][] string4 = new String[5][4][3][2];
        String[][][][][] string5 = new String[5][4][3][2][1];
        
        for (int i = 0; i < string1.length; i++) {
            string1[i] = "array" + i ;
        for (int j = 0; j < string2[i].length; j++) {
            string2[i][j] = "array" + i + j;
        for (int k = 0; k < string3[i][j].length; k++) {
            string3[i][j][k] = "array" + i + j + k;
        for (int l = 0; l < string4[i][j][k].length; l++) {
            string4[i][j][k][l] = "array" + i + j + k + l;
        for (int m = 0; m < string5[i][j][k][l].length; m++) {
            string5[i][j][k][l][m] = "array" + i + j + k + l+ m;
        }}}}}
        System.out.println(Arrays.toString(string1));
        System.out.println(Arrays.deepToString(string2));
        System.out.println(Arrays.deepToString(string3));
        System.out.println(Arrays.deepToString(string4));
        System.out.println(Arrays.deepToString(string5));
        
        //char
        
        char[] char1 = new char[5];
        char[][] char2  = new char[5][4];
        char[][][] char3 = new char[5][4][3];
        char[][][][] char4 = new char[5][4][3][2];
        char[][][][][] char5 = new char[5][4][3][2][1];
        
        for (int i = 0; i < char1.length; i++) {
            char1[i] = (char)('a' + i) ;
        for (int j = 0; j < char2[i].length; j++) {
            char2[i][j] = (char)('a' + i + j);
        for (int k = 0; k < char3[i][j].length; k++) {
            char3[i][j][k] = (char)('a' + i + j + k);
        for (int l = 0; l < char4[i][j][k].length; l++) {
            char4[i][j][k][l] = (char)('a' + i + j + k + l);
        for (int m = 0; m < char5[i][j][k][l].length; m++) {
            char5[i][j][k][l][m] = (char)('a' + i + j + k + l+ m);
        }}}}}
        System.out.println(Arrays.toString(char1));
        System.out.println(Arrays.deepToString(char2));
        System.out.println(Arrays.deepToString(char3));
        System.out.println(Arrays.deepToString(char4));
        System.out.println(Arrays.deepToString(char5));
        
        //float
        
        float[] float1 = new float[5];
        float[][] float2  = new float[5][4];
        float[][][] float3 = new float[5][4][3];
        float[][][][] float4 = new float[5][4][3][2];
        float[][][][][] float5 = new float[5][4][3][2][1];
        
        for (int i = 0; i < float1.length; i++) {
            float1[i] = (float) (1 * (i + 1));
        for (int j = 0; j < float2[i].length; j++) {
            float2[i][j] = (float) (2 * (i + j + 2.2));
        for (int k = 0; k < float3[i][j].length; k++) {
            float3[i][j][k] = (float) (3 * (i + j + k + 3.3));
        for (int l = 0; l < float4[i][j][k].length; l++) {
            float4[i][j][k][l] = (float) (4 * (i + j + k + l + 4.4));
        for (int m = 0; m < float5[i][j][k][l].length; m++) {
            float5[i][j][k][l][m] = (float) (5 * (i + j + k + l + m + 5.5));
        }}}}}
        System.out.println(Arrays.toString(float1));
        System.out.println(Arrays.deepToString(float2));
        System.out.println(Arrays.deepToString(float3));
        System.out.println(Arrays.deepToString(float4));
        System.out.println(Arrays.deepToString(float5));
}}