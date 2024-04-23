
package com.daspro.projectpertemuan1;

/**
 *
 * @author User
 */
public class Varargs {
        static void tampil (String str, int... a){
            System.out.println("parameter string: " + str);
            System.out.println("jumlah parameter: " + a.length);
            
            for (int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        public static void main(String[] args) {
        tampil("daspro", 100,200);
        tampil("daspro2", 1, 2, 3, 4, 5);
        tampil("daspro3");
    }
    }
    

