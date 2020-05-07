-- Task6. Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực 
-- hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(8,'2017-11-11','2017-11-30',12,null,2,3,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(9,'2019-2-11','2019-11-30',10,null,1,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(10,'2019-3-11','2016-11-30',30,null,1,3,3);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(11,'2017-09-11','2017-11-30',12,null,3,3,1);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(12,'2019-1-11','2017-11-30',12,null,4,8,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(13,'2017-07-11','2017-11-30',12,null,2,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(14,'2019-3-11','2017-11-30',12,null,2,7,2);


select casestudy.dichvu.IDDichVu,casestudy.dichvu.TenDichVu,casestudy.dichvu.DienTich,casestudy.dichvu.ChiPhiThue,
casestudy.loaidichvu.TenLoaiDichVu
from casestudy.dichvu
join casestudy.loaidichvu
on casestudy.dichvu.IDDichVu=casestudy.loaidichvu.IDLoaiDichVu
join casestudy.hopdong
on casestudy.hopdong.IDDichVu=casestudy.dichvu.IDDichVu
where (year(casestudy.hopdong.NgayLamHopDong) and month(casestudy.hopdong.NgayLamHopDong)) not in ((year(casestudy.hopdong.NgayLamHopDong)=2019 and month(casestudy.hopdong.NgayLamHopDong)=1)
or (year(casestudy.hopdong.NgayLamHopDong)=2019 and month(casestudy.hopdong.NgayLamHopDong)=2)
or (year(casestudy.hopdong.NgayLamHopDong)=2019 and month(casestudy.hopdong.NgayLamHopDong)=3));




-- Sau update
select casestudy.dichvu.IDDichVu,casestudy.dichvu.TenDichVu,casestudy.dichvu.DienTich,casestudy.dichvu.ChiPhiThue,
casestudy.loaidichvu.TenLoaiDichVu
from casestudy.dichvu
inner join casestudy.loaidichvu on casestudy.dichvu.IDDichVu=casestudy.loaidichvu.IDLoaiDichVu
where not exists(select casestudy.hopdong.IDHopDong from casestudy.hopdong where(casestudy.hopdong.NgayLamHopDong between '2019-01-01' and '2019-03-31') and casestudy.hopdong.IDDichVu=casestudy.dichvu.IDDichVu);