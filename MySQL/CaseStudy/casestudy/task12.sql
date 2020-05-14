-- Task12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, 
-- SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách 
-- hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select casestudy.hopdong.IDHopDong,casestudy.nhanvien.HoTen as TenNhanVien, casestudy.khachhang.HoTen as TenKhachHang,
casestudy.khachhang.SDT as SoDienThoaiKhachHang,casestudy.dichvu.TenDichVu,sum(casestudy.hopdongchitiet.IDHopDongChiTiet) as SoLuongDichVuDiKem,
casestudy.hopdong.TienDatCong as TienDatCoc
from casestudy.hopdong	
inner join casestudy.khachhang on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
inner join casestudy.hopdongchitiet on casestudy.hopdong.IDHopDong=casestudy.hopdongchitiet.IDHopDong
inner join casestudy.dichvu on casestudy.dichvu.IDDichVu=casestudy.hopdong.IDDichVu
inner join casestudy.nhanvien on casestudy.nhanvien.IDNhanVien=casestudy.hopdong.IDNhanVien 
where exists(select casestudy.hopdong.NgayLamHopDong from casestudy.hopdong where ((casestudy.hopdong.ngaylamhopdong) between '2019-10-1' and '2019-12-31'))
and not exists(select casestudy.hopdong.NgayLamHopDong from casestudy.hopdong where ((casestudy.hopdong.ngaylamhopdong) between '2019-1-1' and '2019-6-30'))
group by casestudy.dichvu.TenDichVu,casestudy.khachhang.HoTen;

-- Sau update
select casestudy.hopdong.IDHopDong,casestudy.hopdong.TongTien,casestudy.hopdong.TienDatCong as TienDatCoc,casestudy.nhanvien.HoTen as TenNhanVien,
casestudy.khachhang.HoTen as TenKhachHang,casestudy.khachhang.SDT as SoDienThoaiKhachHang,casestudy.dichvu.TenDichVu,count(casestudy.hopdongchitiet.IDDichVuDiKem) as solansudung
from casestudy.hopdong
inner join casestudy.nhanvien on casestudy.nhanvien.IDNhanVien=casestudy.hopdong.IDNhanVien 
inner join casestudy.khachhang on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
inner join casestudy.dichvu on casestudy.dichvu.IDDichVu=casestudy.hopdong.IDDichVu
inner join casestudy.hopdongchitiet on casestudy.hopdong.IDHopDong=casestudy.hopdongchitiet.IDHopDong
where exists(select casestudy.hopdong.IDHopDong from casestudy.hopdong where ((casestudy.hopdong.ngaylamhopdong) between '2019-10-1' and '2019-12-31'))
and not exists(select casestudy.hopdong.IDHopDong from casestudy.hopdong where ((casestudy.hopdong.ngaylamhopdong) between '2019-1-1' and '2019-6-30'))





