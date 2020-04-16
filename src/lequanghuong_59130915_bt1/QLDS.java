/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lequanghuong_59130915_bt1;

import java.util.ArrayList;

/**
 *
 * @author lehuo
 */
public class QLDS implements IQLDS{
    ArrayList<CaNhan> DSCaNhan =new ArrayList<>();
    
    @Override
    public int them(CaNhan p) {
       DSCaNhan.add(p);
       return 1;
    }

    @Override
    public int xoa(String ten) {
       boolean isRemoved = DSCaNhan.removeIf((CaNhan p)->p.getHoTen().equals(ten));
       if(isRemoved) return 1;
       return 0;
    }

    @Override
    public void inDS() {
        DSCaNhan.stream().forEach((DSCaNhan1) -> {
            System.out.println(DSCaNhan1.HienThiTT());
        });
    }
}
