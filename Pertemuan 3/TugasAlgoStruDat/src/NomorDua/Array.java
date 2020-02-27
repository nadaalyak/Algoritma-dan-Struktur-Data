/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorDua;

/**
 *
 * @author Nada Alya
 */
public class Array {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
    
    public double hitungTotalNilai(){
        return (nilaiTugas*30/100) + (nilaiKuis*20/100) + (nilaiUts*20/100) + (nilaiUas*30/100);
}
}
