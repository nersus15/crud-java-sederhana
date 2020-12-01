/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembuatan_membercard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Implementasi implements anggotaInterface {

    private final String[] kolom = {"ID", "NAMA", "TANGGAL LAHIR", "JENIS KELAMIN", "JURUSAN", "NO TELPON"};
    private final List<Classmembercard> list = new ArrayList<>();

    @Override
    public void read(JTable jt) { //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            Object[] os = new Object[6];
            os[0] = list.get(i).getId();
            os[1] = list.get(i).getNama();
            os[2] = list.get(i).getTanggal();
            os[3] = list.get(i).getJenis_kelamin();
            os[4] = list.get(i).getJurusan();
            os[5] = list.get(i).getNo_telpon();

            dtm.addRow(os);
        }
        jt.setModel(dtm);
    }

    @Override
    public void create(Classmembercard m) {//To change body of generated methods, choose Tools | Templates.
        list.add(m);
        JOptionPane.showMessageDialog(null, "Berhasil disimpan!");
    }

    @Override
    public void update(String id, Classmembercard m) {//To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.set(i, m);
            }
        }
        JOptionPane.showMessageDialog(null, "Berhasil diubah!");
    }

    @Override
    public void delete(String id) {//To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(id);
            System.out.println(list.get(i).getId().equals(id));
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Berhasil dihapus!");
    }

    @Override
    public void search(JTable jt, String keyword) { //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().toLowerCase().contains(keyword.toLowerCase())
                    || list.get(i).getNama().toLowerCase().contains(keyword.toLowerCase())
                    || list.get(i).getJenis_kelamin().toLowerCase().contains(keyword.toLowerCase())
                    || list.get(i).getJurusan().toLowerCase().contains(keyword.toLowerCase())
                    || list.get(i).getTanggal().toLowerCase().contains(keyword.toLowerCase())
                    || list.get(i).getNo_telpon().toLowerCase().contains(keyword.toLowerCase())) {
                Object[] os = new Object[6];
                os[0] = list.get(i).getId();
                os[1] = list.get(i).getNama();
                os[2] = list.get(i).getTanggal();
                os[3] = list.get(i).getJenis_kelamin();
                os[4] = list.get(i).getJurusan();
                os[5] = list.get(i).getNo_telpon();

                dtm.addRow(os);
            }
        }
        jt.setModel(dtm);
    }

    @Override
    public boolean validasi(Classmembercard member) {
        for (int i = 0; i < list.size(); i++) {
            if (
                  list.get(i).getNama().equalsIgnoreCase(member.getNama()) ||
                   list.get(i).getId().equalsIgnoreCase(member.getId()) ||
                    list.get(i).getNo_telpon().equalsIgnoreCase(member.getNo_telpon())
                ) {
                return false;
            }
        }
        return true;
    }

}
