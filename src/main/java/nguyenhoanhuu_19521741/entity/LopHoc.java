package nguyenhoanhuu_19521741.entity;

import javax.persistence.Table;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "lopHoc")
public class LopHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int maLopHoc;
	@Column(name = "tenLopHoc")
	private String tenLopHoc;
	@Column(name = "toaNha")
	private String toaNha;
	@Column(name = "buoiHoc")
	private String buoiHoc;

	public LopHoc(int maLopHoc, String tenLopHoc, String toaNha, String buoiHoc) {
		super();
		this.maLopHoc = maLopHoc;
		this.tenLopHoc = tenLopHoc;
		this.toaNha = toaNha;
		this.buoiHoc = buoiHoc;
	}

	public LopHoc(int maLopHoc) {
		super();
		this.maLopHoc = maLopHoc;
	}

	public LopHoc() {
		super();
	}

	public int getMaLopHoc() {
		return maLopHoc;
	}

	public void setMaLopHoc(int maLopHoc) {
		this.maLopHoc = maLopHoc;
	}

	public String getTenLopHoc() {
		return tenLopHoc;
	}

	public void setTenLopHoc(String tenLopHoc) {
		this.tenLopHoc = tenLopHoc;
	}

	public String getToaNha() {
		return toaNha;
	}

	public void setToaNha(String toaNha) {
		this.toaNha = toaNha;
	}

	public String getBuoiHoc() {
		return buoiHoc;
	}

	public void setBuoiHoc(String buoiHoc) {
		this.buoiHoc = buoiHoc;
	}

	@Override
	public String toString() {
		return "LopHoc [maLopHoc=" + maLopHoc + ", tenLopHoc=" + tenLopHoc + ", toaNha=" + toaNha + ", buoiHoc="
				+ buoiHoc + "]";
	}

}
