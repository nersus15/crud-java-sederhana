/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembuatan_membercard;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Classmembercard {

    private String no_telpon;
    private String nama;
    private String tanggal;
    private String jenis_kelamin;
    private String jurusan;
    private String id;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
   
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getTanggal(){
        
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        
        this.tanggal = tanggal;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public String getNo_telpon(){
        return no_telpon;
    }
    
    public void setNo_telpon(String no_telpon){
        this.no_telpon = no_telpon;
    }
}


