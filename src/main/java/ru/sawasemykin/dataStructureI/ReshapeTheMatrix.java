package ru.sawasemykin.dataStructureI;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c)
            return mat;
        else {
            int[][] reshapedMat = new int[r][c];
            int currR, currC;
            currR = currC = 0;
            for (int i = 0; i < mat.length; i++)
                for (int j = 0; j < mat[0].length; j++) {
                    if (currC == c) {
                        currR++;
                        currC = 0;
                    }
                    reshapedMat[currR][currC] = mat[i][j];
                    currC++;
                }
            return reshapedMat;
        }
    }
}
