package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GUI_admin extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pn_north = new JPanel();
	private JLabel lab_tieu_de_admin = new JLabel("Admin");
	
	private JPanel pn_center = new JPanel();
	private JTabbedPane tp_admin = new JTabbedPane();
	
	private JPanel pn_quan_li_tai_khoan = new JPanel();
	private String[] cols_tai_khoan = {"Tên tài khoản", "Mật khẩu"};
	private DefaultTableModel dtm_tai_khoan = new DefaultTableModel(cols_tai_khoan, 0);
	private JTable tb_tai_khoan = new JTable(dtm_tai_khoan);
	private JScrollPane sc_tai_khoan = new JScrollPane(tb_tai_khoan);
	
	private JPanel pn_tai_khoan_trai = new JPanel();
	private JPanel pn_tmp_ten_tai_khoan = new JPanel();
	private JLabel lab_ten_tai_khoan = new JLabel("Tên tài khoản:");
	private JTextField txt_ten_tai_khoan = new JTextField(30);
	private JPanel pn_tmp_mat_khau = new JPanel();
	private JLabel lab_mat_khau = new JLabel("Mật khẩu:");
	private JTextField txt_mat_khau = new JTextField(30);
	
	private JPanel pn_tai_khoan_phai = new JPanel();
	private JButton btn_them_tai_khoan = new JButton("Thêm");
	private JButton btn_xoa_tai_khoan = new JButton("Xóa");
	private JButton btn_sua_tai_khoan = new JButton("Sửa");
	private JTextField txt_tim_kiem_tai_khoan = new JTextField(20);
	private JButton btn_tim_kiem_tai_khoan = new JButton("Tìm kiếm");
	
	private JPanel pn_quan_li_benh_nhan = new JPanel();
	private String[] cols_benh_nhan = {"Mã bệnh nhân", "Tên bệnh nhân", "Giới tính", "Ngày sinh", "Địa chỉ"};
	private DefaultTableModel dtm_benh_nhan = new DefaultTableModel(cols_benh_nhan, 0);
	private JTable tb_benh_nhan = new JTable(dtm_benh_nhan);
	private JScrollPane sc_benh_nhan = new JScrollPane(tb_benh_nhan);
	
	private JPanel pn_benh_nhan_duoi = new JPanel();
	private JButton btn_xoa_benh_nhan = new JButton("Xóa");
	private JTextField txt_tim_kiem_benh_nhan = new JTextField(20);
	private JButton btn_tim_kiem_benh_nhan = new JButton("Tìm kiếm");
	
	private JPanel pn_quan_li_toa_thuoc = new JPanel();
	private String[] cols_toa_thuoc = {"Mã toa thuốc", "Bệnh", "Phân tích"};
	private DefaultTableModel dtm_toa_thuoc = new DefaultTableModel(cols_toa_thuoc, 0);
	private JTable tb_toa_thuoc = new JTable(dtm_toa_thuoc);
	private JScrollPane sc_toa_thuoc = new JScrollPane(tb_toa_thuoc);
	
	private JPanel pn_toa_thuoc_duoi = new JPanel();
	private JButton btn_xoa_toa_thuoc = new JButton("Xóa");
	private JTextField txt_tim_kiem_toa_thuoc = new JTextField(20);
	private JButton btn_tim_kiem_toa_thuoc = new JButton("Tìm kiếm");
	
	
	private JPanel pn_quan_li_thuoc = new JPanel();
	private String[] cols_thuoc = {"Mã thuốc", "Tên thuốc", "Hạn sử dụng", "Giá tiền"};
	private DefaultTableModel dtm_thuoc = new DefaultTableModel(cols_thuoc, 0);
	private JTable tb_thuoc = new JTable();
	private JScrollPane sc_thuoc = new JScrollPane(tb_thuoc);
	
	private JPanel pn_thuoc_trai = new JPanel();
	private JPanel pn_tmp1_thuoc = new JPanel();
	private JLabel lab_ma_thuoc = new JLabel("Mã thuốc:");
	private JTextField txt_ma_thuoc = new JTextField(20);
	private JPanel pn_tmp2_thuoc = new JPanel();
	private JLabel lab_ten_thuoc = new JLabel("Tên thuốc:");
	private JTextField txt_ten_thuoc = new JTextField(20);
	private JPanel pn_tmp3_thuoc = new JPanel();
	private JLabel lab_han_su_dung = new  JLabel("Hạn sử dụng:");
	private JTextField txt_han_su_dung = new JTextField(20);
	private JPanel pn_tmp4_thuoc = new JPanel();
	private JLabel lab_gia_tien = new JLabel("Giá tiền:");
	private JTextField txt_gia_tien = new JTextField(20);
	
	private JPanel pn_thuoc_phai = new JPanel();
	private JButton btn_them_thuoc = new JButton("Thêm");
	private JButton btn_xoa_thuoc = new JButton("Xóa");
	private JButton btn_sua_thuoc = new JButton("Sửa");
	private JTextField txt_tim_kiem_thuoc = new JTextField(20);
	private JButton btn_tim_kiem_thuoc = new JButton("Tìm kiếm");
	

	public GUI_admin() {
		setTitle("Admin");
		setSize(1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		pn_north.add(lab_tieu_de_admin);
		pn_north.add(Box.createHorizontalStrut(1100));
		add(pn_north, BorderLayout.NORTH);
		
		
		
		//Bảng tài khoản
		sc_tai_khoan.setMaximumSize(new Dimension(1140, 410));
		sc_tai_khoan.setPreferredSize(new Dimension(1140, 410));
		pn_quan_li_tai_khoan.add(sc_tai_khoan);
		
		//Tài khoản trái
		pn_tai_khoan_trai.setLayout(new GridLayout(2, 1));
		pn_tmp_ten_tai_khoan.add(lab_ten_tai_khoan);
		pn_tmp_ten_tai_khoan.add(txt_ten_tai_khoan);
		pn_tmp_mat_khau.add(lab_mat_khau);
		pn_tmp_mat_khau.add(txt_mat_khau);
		pn_tai_khoan_trai.add(pn_tmp_ten_tai_khoan);
		pn_tai_khoan_trai.add(pn_tmp_mat_khau);
		pn_quan_li_tai_khoan.add(pn_tai_khoan_trai);
		
		lab_mat_khau.setPreferredSize(lab_ten_tai_khoan.getPreferredSize());
		
		//Tài khoản phải
		pn_tai_khoan_phai.add(Box.createHorizontalStrut(100));
		pn_tai_khoan_phai.add(btn_them_tai_khoan);
		pn_tai_khoan_phai.add(btn_xoa_tai_khoan);
		pn_tai_khoan_phai.add(btn_sua_tai_khoan);
		pn_tai_khoan_phai.add(txt_tim_kiem_tai_khoan);
		pn_tai_khoan_phai.add(btn_tim_kiem_tai_khoan);
		pn_tai_khoan_phai.add(Box.createHorizontalStrut(100));
		pn_quan_li_tai_khoan.add(pn_tai_khoan_phai);
		
		tp_admin.add("Quản lí tài khoản", pn_quan_li_tai_khoan);
		
		//Bảng bệnh nhân
		sc_benh_nhan.setMaximumSize(new Dimension(1140, 410));
		sc_benh_nhan.setPreferredSize(new Dimension(1140, 410));
		pn_quan_li_benh_nhan.add(sc_benh_nhan);
		
		//Bệnh nhân dưới
		pn_benh_nhan_duoi.add(btn_xoa_benh_nhan);
		pn_benh_nhan_duoi.add(txt_tim_kiem_benh_nhan);
		pn_benh_nhan_duoi.add(btn_tim_kiem_benh_nhan);
		pn_quan_li_benh_nhan.add(pn_benh_nhan_duoi);
		
		tp_admin.add("Quản lí bệnh nhân", pn_quan_li_benh_nhan);
		
		//Bảng toa thuốc
		sc_toa_thuoc.setMaximumSize(new Dimension(1140, 410));
		sc_toa_thuoc.setPreferredSize(new Dimension(1140, 410));
		pn_quan_li_toa_thuoc.add(sc_toa_thuoc);
		
		//Toa thuốc dưới
		pn_toa_thuoc_duoi.add(btn_xoa_toa_thuoc);
		pn_toa_thuoc_duoi.add(txt_tim_kiem_toa_thuoc);
		pn_toa_thuoc_duoi.add(btn_tim_kiem_toa_thuoc);
		pn_quan_li_toa_thuoc.add(pn_toa_thuoc_duoi);
		
		tp_admin.add("Quản lí toa thuốc", pn_quan_li_toa_thuoc);
		
		//Bảng thuốc
		sc_thuoc.setMaximumSize(new Dimension(1140, 410));
		sc_thuoc.setPreferredSize(new Dimension(1140, 410));
		pn_quan_li_thuoc.add(sc_thuoc);
		
		//Thuốc trái
		pn_thuoc_trai.setLayout(new GridLayout(2, 2));
		pn_tmp1_thuoc.add(lab_ma_thuoc);
		pn_tmp1_thuoc.add(txt_ma_thuoc);
		pn_thuoc_trai.add(pn_tmp1_thuoc);
		pn_tmp2_thuoc.add(lab_ten_thuoc);
		pn_tmp2_thuoc.add(txt_ten_thuoc);
		pn_thuoc_trai.add(pn_tmp2_thuoc);
		pn_tmp3_thuoc.add(lab_han_su_dung);
		pn_tmp3_thuoc.add(txt_han_su_dung);
		pn_thuoc_trai.add(pn_tmp3_thuoc);
		pn_tmp4_thuoc.add(lab_gia_tien);
		pn_tmp4_thuoc.add(txt_gia_tien);
		pn_thuoc_trai.add(pn_tmp4_thuoc);
		
		pn_quan_li_thuoc.add(pn_thuoc_trai);
		
		lab_ma_thuoc.setPreferredSize(lab_han_su_dung.getPreferredSize());
		lab_gia_tien.setPreferredSize(lab_ten_thuoc.getPreferredSize());
		
		//Thuốc phải
		pn_thuoc_phai.add(btn_them_thuoc);
		pn_thuoc_phai.add(btn_xoa_thuoc);
		pn_thuoc_phai.add(btn_sua_thuoc);
		pn_thuoc_phai.add(txt_tim_kiem_thuoc);
		pn_thuoc_phai.add(btn_tim_kiem_thuoc);
		pn_quan_li_thuoc.add(pn_thuoc_phai);
		
		tp_admin.add("Quản lí thuốc", pn_quan_li_thuoc);
		tp_admin.setPreferredSize(new Dimension(1160, 520));
		pn_center.add(tp_admin);
		add(pn_center, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new GUI_admin().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
