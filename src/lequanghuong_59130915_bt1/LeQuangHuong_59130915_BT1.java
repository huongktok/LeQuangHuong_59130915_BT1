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
public class LeQuangHuong_59130915_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GiaoVien GVCN = new GiaoVien("Bui Chi Thanh",40,"Nha Trang","12345678","Phat Trien UD Web","CNPM");
        LopHoc lop59CNTT3=new LopHoc(GVCN);
        //
        
        HocSinh hs0 = new HocSinh("Le Quang Huong",21,"Xuan Canh","0344683323","59CNTT3","AAA");
        HocSinh hs1 = new HocSinh("Vo Trung Ha",21,"Thap Ba","1111111","59CNTT3","BBB");
        HocSinh hs2 = new HocSinh("Nguyen Song Thanh",21,"Dien Khanh","222222","59CNTT3","ABAB");
        HocSinh hs3 = new HocSinh("Ho Nguyen Thanh Thien",21,"Dien Khanh","3333","59CNTT3","AABB");
        lop59CNTT3.themHocSinh(hs0);
        lop59CNTT3.themHocSinh(hs1);
        lop59CNTT3.themHocSinh(hs2);
        lop59CNTT3.themHocSinh(hs3);
        //
        
        GiaoVien GVDD0 = new GiaoVien("Huynh Tuan Anh",42,"Bong Son - Binh Dinh","0945505449","Mau Thiet Ke","HTTT");
        GiaoVien GVDD1 = new GiaoVien("Le Thi Bich Hang",35,"Nha Trang","87654321","Cong Nghe Phan Mem","CNPM");
        lop59CNTT3.themGVGD(GVDD0);
        lop59CNTT3.themGVGD(GVDD1);
        
        System.out.println("Danh Sach Hoc Sinh");
        lop59CNTT3.inDSHS();
        System.out.println("Danh Sach Giao Vien Giang Day");
        lop59CNTT3.inDSGVGD();
    }
    
}
