-- task7. Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng 
-- được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select casestudy.dichvu.IDDichVu,casestudy.dichvu.TenDichVu,casestudy.dichvu.DienTich,casestudy.dichvu.SoNguoiToiDa,
casestudy.dichvu.ChiPhiThue,casestudy.loaidichvu.TenLoaiDichVu
from casestudy.dichvu
inner join casestudy.loaidichvu
on casestudy.dichvu.IDLoaiDichVu=casestudy.loaidichvu.IDLoaiDichVu
where exists(select casestudy.hopdong.IDHopDong from casestudy.hopdong where year(casestudy.hopdong.ngaylamhopdong)='2018' and casestudy.hopdong.IDDichVu=casestudy.dichvu.IDDichVu)
and not exists(select casestudy.hopdong.IDHopDong from casestudy.hopdong where year(casestudy.hopdong.ngaylamhopdong)='2019' and casestudy.hopdong.IDDichVu=casestudy.dichvu.IDDichVu);




insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(100,'2018-11-11','2018-11-30',12,null,2,3,1);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(16,'2018-2-11','2019-11-30',10,null,1,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(17,'2019-3-11','2020-11-30',30,null,1,3,3);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(18,'2017-09-11','2017-11-30',12,null,3,3,1);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(19,'2018-1-11','2018-11-30',12,null,4,8,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(20,'2017-07-11','2017-11-30',12,null,2,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(21,'2018-3-11','2019-11-30',12,null,2,7,2);

insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(22,'2017-11-11','2017-11-30',12,null,2,3,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(23,'2018-2-11','2019-11-30',10,null,1,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(24,'2019-3-11','2020-11-30',30,null,1,4,3);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(25,'2017-09-11','2017-11-30',12,null,3,3,1);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(26,'2018-1-11','2018-11-30',12,null,4,8,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(27,'2019-07-11','2019-11-30',12,null,2,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(28,'2018-3-11','2019-11-30',12,null,2,7,2);