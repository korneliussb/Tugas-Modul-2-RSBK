/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKel10Mod2;

import javax.ejb.Stateful;
import java.util.ArrayList;

/**
 *
 * @author Knight-Son untuk membuat array listnya
 */
@Stateful
public class cariMahasiswa implements cariMahasiswaLocal {
    
    ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
    
    @Override
    public void Data(String nama, String nim){
        mhs.add(new Mahasiswa (nama,nim));
    }
    
    public cariMahasiswa(){ //lebih dinamis, bisa menyimpan objek-> ArrayList
        Data("hilmi", "21120116120009");
        Data("rindhon", "21120116120028");
        Data("agus", "21120116120008");
        Data("satria", "21120116120007");
        Data("ali", "21120116130009");
    }
    
    private String checkNama(String param){
	for (int i = 0; i< mhs.size(); i++) {
		if (param.equals(mhs.get(i).nama)) {
			return "Nama Praktikan : "+mhs.get(i).nama+"("+mhs.get(i).nim+")";
		}
	}
	return null;
    }

    private String checkNim(String param){
            for (int i = 0; i< mhs.size(); i++) {
                    if (param.equals(mhs.get(i).nim)) {
                            return "Nama Praktikan : "+mhs.get(i).nama+"("+mhs.get(i).nim+")";
                    }
            }
            return null;
    }

    public String search(String param){
        if (checkNama(param) != null){
                return checkNama(param);
            }
            else if (checkNim(param) != null) {
                return checkNim(param);
            }
            else {
                return "No";
        }
    };

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
