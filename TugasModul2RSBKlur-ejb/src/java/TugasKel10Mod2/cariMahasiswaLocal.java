/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKel10Mod2;
//interface dari cariMahasiswa.java

import javax.ejb.Local;

/**
 *
 * @author Knight-Son
 */
@Local
public interface cariMahasiswaLocal {
    String search(String param);
    void Data(String nama, String nim);
}