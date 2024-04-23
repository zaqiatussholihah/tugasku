/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daspro.antrianvaksinasi;

/**
 *
 * @author User
 */
public class DoubleLinkedLists {
    
    private Node head;
    private Node tail;
    private int count;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
        System.out.println("=====================");
        System.out.println("Nomor antrian: " + count);
        System.out.println("Nama penerima: " + data);
        System.out.println("Data telah ditambahkan ke antrian vaksinasi.");
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
        System.out.println("=====================");
        System.out.println("Nomor antrian: " + count);
        System.out.println("Nama penerima: " + data);
        System.out.println("Data telah ditambahkan ke antrian vaksinasi.");
    }

    public void addLast(String data) {
        add(data);
    }

    public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Antrian vaksinasi kosong. Tidak ada data yang dihapus.");
    } else {
        String removedData = head.data; // Simpan data dari elemen yang akan dihapus
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        count--;
        System.out.println(removedData + " telah selesai divaksinasi.");
    }
}


    
    public int size() {
        return count;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian vaksinasi kosong");
        } else {
            System.out.println("Daftar penerima vaksin:");
            System.out.println("+--------------------------------------+");
            System.out.printf("| %-5s | %-30s |\n", "No.", "Nama Penerima");
            System.out.println("+--------------------------------------+");

            Node current = head;
            int counter = 1;
            while (current != null) {
                System.out.printf("| %-5d | %-30s |\n", counter, current.data);
                current = current.next;
                counter++;
            }
            System.out.println("+--------------------------------------+");
            System.out.println("Jumlah antrian: " + count);
        }
    }
    
}
