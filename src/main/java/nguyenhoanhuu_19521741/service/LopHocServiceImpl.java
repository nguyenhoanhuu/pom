package nguyenhoanhuu_19521741.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nguyenhoanhuu_19521741.dao.LopHocDao;
import nguyenhoanhuu_19521741.entity.LopHoc;

@Service

public class LopHocServiceImpl implements LopHocService {

	@Autowired
	private LopHocDao lopHocDao;

	@Override
	@Transactional
	public List<LopHoc> getDanhSachLopHoc() {

		return lopHocDao.getDanhSachLopHoc();
	}

	@Override
	@Transactional
	public void themLopHoc(LopHoc lopHoc) {
		lopHocDao.themLopHoc(lopHoc);

	}

	@Override
	@Transactional
	public void suaLopHoc(LopHoc lopHoc) {
		lopHocDao.suaLopHoc(lopHoc);
	}

	@Override
	@Transactional
	public LopHoc getLopHocTheoId(int maLopHoc) {
		return lopHocDao.getLopHocTheoId(maLopHoc);
	}

	@Override
	@Transactional
	public void xoaLopHoc(int maLopHoc) {
		lopHocDao.xoaLopHoc(maLopHoc);

	}

}
