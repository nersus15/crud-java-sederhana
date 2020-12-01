/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembuatan_membercard;

import javax.swing.JTable;

/**
 *
 * @author k15
 */
public interface anggotaInterface {
    public void read(JTable jt);
   
   public void create(Classmembercard m);
   
   public void update(String id, Classmembercard m);
   
   public void delete(String id);
  
   public void search(JTable jt, String keyword);
   
   public boolean validasi(Classmembercard member);
}
