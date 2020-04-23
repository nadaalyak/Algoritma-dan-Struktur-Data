/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Nada Alya
 */
public class LinkList {

    Node head, tail;

    public LinkList() {
        head = null;
        tail = null;
    }

    public void enque() {
        Node baru = new Node();
        baru.input();
        if (head == null) {
            head = baru;
        } else {
            tail.next = baru;
        }
        tail = baru;
    }

    public void deque() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Data Keluar : ");
            head = head.next;
        }
    }

    public void view() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Bulan ke-\t|| 2018 \t|| 2019 \t|| 2020 \t||");
            System.out.println("============================================||");
            for (Node a = head; a != null; a = a.next) {
                a.read();
            }
        }
    }
}
