package nguyenhoanhuu_19521741.service;

import java.util.List;

import nguyenhoanhuu_19521741.entity.LopHoc;

public interface LopHocService {

	public List<LopHoc> getDanhSachLopHoc();

	public void themLopHoc(LopHoc lopHoc);

	public void suaLopHoc(LopHoc lopHoc);

	public LopHoc getLopHocTheoId(int maLopHoc);

	public void xoaLopHoc(int maLopHoc);
}
