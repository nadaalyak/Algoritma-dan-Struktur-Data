/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorSatu;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class Lingkaran {

    public double phi = 3.14;
    public double r;

    double hitungLuas() {
        return phi * r * r;
    }

    double hitungKeliling() {
        return 2 * phi * r * r;
    }

}
