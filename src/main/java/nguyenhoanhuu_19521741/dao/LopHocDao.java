package nguyenhoanhuu_19521741.dao;

import java.util.List;

import nguyenhoanhuu_19521741.entity.LopHoc;

public interface LopHocDao {

	public List<LopHoc> getDanhSachLopHoc();

	public void themLopHoc(LopHoc lopHoc);

	public void suaLopHoc(LopHoc lopHoc);

	public LopHoc getLopHocTheoId(int maLopHoc);

	public void xoaLopHoc(int maLopHoc);
}
