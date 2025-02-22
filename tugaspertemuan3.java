/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.pertemuan3;

 import java.util.Scanner;
 
 /**
  *
  * @author Acer Nitro 5
  */
 public class tugaspertemuan3 {
 
     public static void main(String[] args) {
         Scanner Input = new Scanner(System.in);
         Scanner InputNama = new Scanner(System.in);
         
         System.out.println("Soal Pertama");
         int number1, number2, hasil;
         System.out.println("Masukan Bilangan Pertama : ");
         number1 = Input.nextInt();
         System.out.println("Masukan Bilangan Kedua : ");
         number2 = Input.nextInt();
         hasil = 0;
         
         if((number1 % 2 == 0) && (number2 % 2 == 0)){
             hasil = number1 + number2;
             System.out.println("Kedua bilangan adalah genap dan hasil penjumlahannya adalah : " + hasil);
         }
         if((number1 % 2 != 0) && (number2 % 2 != 0)){
             hasil = number1 * number2;
             System.out.println("Kedua bilangan adalah ganjil dan hasil perkaliannya adalah : " + hasil);
         }
         
         System.out.println("Soal Kedua");
         float nilaiUTS, nilaiUAS, nilaiTugas, nilaiAkhir;
         String namaMhs;
         System.out.print("Masukan Nama Mahasiswa : ");
         namaMhs = InputNama.nextLine();
         System.out.print("Masukan Nilai Tugas Mahasiswa : ");
         nilaiTugas = Input.nextFloat();
         System.out.print("Masukan Nilai UTS Mahasiswa : ");
         nilaiUTS = Input.nextFloat();
         System.out.print("Masukan Nilai UAS Mahasiswa : ");
         nilaiUAS = Input.nextFloat();
         
         nilaiAkhir = ((nilaiTugas * 20)/100) + ((nilaiUTS * 35) / 100) + ((nilaiUAS * 45) / 100);
         if((nilaiAkhir >= 80) && (nilaiAkhir <= 100)){
             System.out.println("Nilai Indeks Mahasiswa adalah A dengan Score " + nilaiAkhir);
         }else if((nilaiAkhir < 80) && (nilaiAkhir >= 70)){
             System.out.println("Nilai Indeks Mahasiswa adalah B dengan Score " + nilaiAkhir);
         }else if((nilaiAkhir < 70) && (nilaiAkhir >= 50)){
             System.out.println("Nilai Indeks Mahasiswa adalah C dengan Score " + nilaiAkhir);
         }
         
         System.out.println("Soal Ketiga");
         int penumpang, mobil;
         System.out.print("Masukan Jumlah Penumpang : ");
         penumpang = Input.nextInt();
         if(penumpang % 7 == 0){
             mobil = penumpang / 7;
             System.out.println("Jumlah Mobil yang dibutuhkan adalah : " + mobil);
         }else if(penumpang % 7 != 0){
             mobil = (penumpang / 7) + 1;
             System.out.println("Jumlah Mobil yang dibutuhkan adalah : " + mobil);
         }
     }
 }
 