package nguyenhoanhuu_19521741.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nguyenhoanhuu_19521741.entity.LopHoc;

@Repository
public class LopHocDaoImpl implements LopHocDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<LopHoc> getDanhSachLopHoc() {
		Session currentsession = sessionFactory.getCurrentSession();
		Query<LopHoc> theQuery = currentsession.createQuery("from LopHoc", LopHoc.class);
		List<LopHoc> danhSachLopHoc = theQuery.getResultList();
		return danhSachLopHoc;
	}

	@Override
	public void themLopHoc(LopHoc lopHoc) {
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(lopHoc);

	}

	@Override
	public void suaLopHoc(LopHoc lopHoc) {
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(lopHoc);
	}

	@Override
	public LopHoc getLopHocTheoId(int maLopHoc) {
		Session currentsession = sessionFactory.getCurrentSession();
		LopHoc lopHoc = currentsession.get(LopHoc.class, maLopHoc);
		return lopHoc;
	}

	@Override
	public void xoaLopHoc(int maLopHoc) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LopHoc> theQuery = currentSession.createQuery("delete from LopHoc where id=:maLopHoc");
		theQuery.setParameter("maLopHoc", maLopHoc);
		theQuery.executeUpdate();
	}

}
