/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.daspro.antrianvaksinasi;

/**
 *
 * @author User
 */
public class Node {

    String data;
    Node prev;
    Node next;
     public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
