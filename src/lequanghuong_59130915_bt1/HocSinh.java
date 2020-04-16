/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lequanghuong_59130915_bt1;

/**
 *
 * @author lehuo
 */
public class HocSinh extends CaNhan{
    private String lop,nangKhieu;
    public HocSinh()
    {
        super();
        this.lop="";
        this.nangKhieu="";
    }
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt,String lop,String nangKhieu)
    {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop=lop;
        this.nangKhieu=nangKhieu;
    }

    HocSinh(String to_Hieu_Ngoi, int i, String xuan_Canh, String string, String cntT3, String aaa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
       return "Ho Ten: "+ this.hoTen
               +"\n tuoi"+this.tuoi
               +"\n Dia Chi"+this.diaChi
               +"\n sdt"+this.sdt
               +"\n lop"+this.lop
               +"\n Nang Khieu"+this.nangKhieu;
               }
}
