
package com.daspro.projectpertemuan1;

public class NestedWhile {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int n = 0;
        
        while (i < n) {
            while (j < n) {
                System.out.println(i + " , " + j + " , " + n);
                j++;
            }
            j=0;
            i++;
        }
    }
}
