package nguyenhoanhuu_19521741.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nguyenhoanhuu_19521741.entity.LopHoc;
import nguyenhoanhuu_19521741.service.LopHocService;

@RestController
@RequestMapping("/api")
public class LopHocController {

	@Autowired
	private LopHocService lopHocService;

	@GetMapping("/danhsachlophoc")
	public List<LopHoc> getDanhSachLopHoc() {
		return lopHocService.getDanhSachLopHoc();
	}

	@PostMapping("/danhsachlophoc")
	public LopHoc themLopHoc(@RequestBody LopHoc lopHoc) {
		lopHoc.setMaLopHoc(0);
		lopHocService.themLopHoc(lopHoc);
		return lopHoc;
	}

	@PutMapping("/danhsachlophoc")
	public LopHoc suaLopHoc(@RequestBody LopHoc lopHoc) {
		lopHocService.suaLopHoc(lopHoc);
		return lopHoc;
	}

	@GetMapping("/danhsachlophoc/{maLopHoc}")
	public LopHoc getLopHocTheoId(@PathVariable int maLopHoc) {
		return lopHocService.getLopHocTheoId(maLopHoc);
	}

	@DeleteMapping("/danhsachlophoc/{maLopHoc}")
	public void xoaLopHoc(@PathVariable int maLopHoc) {
		lopHocService.xoaLopHoc(maLopHoc);
	}

}
