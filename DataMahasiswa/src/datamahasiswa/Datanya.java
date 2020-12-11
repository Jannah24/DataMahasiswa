/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Datanya {
    
    ArrayList<String> nim = new ArrayList<String>();
    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<String> tglLahir = new ArrayList<String>();
    ArrayList<Integer> gender = new ArrayList<Integer>();
    
    
    Scanner m = new Scanner(System.in);
    
    void tambahdata(){
            System.out.println("Masukkan nim mahasiswa: ");
            String nimMhs = m.next();
            System.out.println("Masukkan nama mahasiswa: ");
            String namaMhs = m.next();
            System.out.println("Masukkan tanggal lahir (dd/mm/yyy): ");
            String lahirMhs = m.next();
            System.out.println("Jenis kelamin (0: Laki-laki atau 1: Perempuan): ");
            int genderMhs = m.nextInt();
            nim.add(nimMhs);
            nama.add(namaMhs);
            tglLahir.add(lahirMhs);
            gender.add(genderMhs);
            System.out.println("DATA BERHASIL DITAMBAHKAN !!");
    }
    
    void caridata(){
        System.out.println("1. Berdasarkan nim");
        System.out.println("2. Berdasarkan jenis kelamin");
        System.out.println("Pilihan (0: Laki-laki atau 1: Perempuan): ");
        int pilihan = m.nextInt();
        if(pilihan == 1){
            System.out.println("Masukkan NIM mahasiswa: ");
            String nimMhs = m.next();
            
            int mhs = Collections.binarySearch(nim, nimMhs);
            String cariNim = nim.get(mhs);
            String cariNama = nama.get(mhs);
            String cariLahir = tglLahir.get(mhs);
            int cariJenis = gender.get(mhs);
            
            System.out.println("NIM: " + cariNim);
            System.out.println("Nama: " + cariNama);
            System.out.println("Tanggal Lahir: " + cariLahir);
            System.out.println("Jenis Kelamin: " + cariJenis);
        }else if(pilihan == 2){
            System.out.println("Jenis Kelamin(0:Laki-laki atau 1:Perempuan): ");
            int genderMhs = m.nextInt();
            
            for(int a = 0; a < nama.size(); a++){
                if (gender.get(a)==0){
                    System.out.println("NIM: " + nim.get(a));
                    System.out.println("Nama: " + nama.get(a));
                    System.out.println("Tanggal Lahir: " + tglLahir.get(a));
                    System.out.println("Jenis Kelamin: " + gender.get(a));
                }else if (gender.get(a)==1){
                    System.out.println("NIM: " + nim.get(a));
                    System.out.println("Nama: " + nama.get(a));
                    System.out.println("Tanggal Lahir: " + tglLahir.get(a));
                    System.out.println("Jenis Kelamin: " + gender.get(a));
                }
            }
        }
    }
    
    void hapusdata(){
        System.out.println("Masukkan nim yang akan dihapus: ");
        String nimMhs = m.next();
        int mhs = Collections.binarySearch(nim, nimMhs);
        nim.remove(mhs);
        nama.remove(mhs);
        tglLahir.remove(mhs);
        gender.remove(mhs);
        System.out.println("DATA BERHASIL DIHAPUS !!");
    }
    
    void tampildata(){
        for (int a = 0; a < nama.size(); a++){
            System.out.println("NIM: " + nim.get(a));
            System.out.println("Nama: " + nama.get(a));
            System.out.println("Tanggal Lahir: " + tglLahir.get(a));
            System.out.println("Jenis Kelamin: " + gender.get(a));
            System.out.println("-------------------------");
        }
    }
    
    void menu(){        
        System.out.println("****************");
        System.out.println("      MENU      ");
        System.out.println("****************");
        System.out.println("1. Tambah data");
        System.out.println("2. Cari data");
        System.out.println("3. Hapus data");
        System.out.println("4. Tampil data");
        System.out.println("5. Keluar");
        System.out.println("Pilihan anda: ");
        int pilihan = m.nextInt();
        
        if(pilihan == 1){
            System.out.println("========== Tambah Data Mahasiswa ==========");
            tambahdata();
        }
        
        if(pilihan == 2){
            System.out.println("========== Cari Data Mahasiswa ==========");
            caridata();
        }
        
        if(pilihan == 3){
            System.out.println("========== Hapus Data Mahasiswa ==========");
            hapusdata();
        }
        
        if(pilihan == 4){
            System.out.println("========== Data Mahasiswa ==========");
            tampildata();
            System.out.println("********************************");
            System.out.println("Total Mahasiswa: " + nama.size());
            System.out.println("********************************");
        }
        
        if (pilihan == 5){
            System.out.println("========== Keluar ==========");
            System.exit(0);
        } else {
            do {
                menu();
            } while (pilihan!=1 && pilihan !=2 && pilihan!=3 && pilihan!=4);
        }
    }
}
