-- Task15. Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select casestudy.nhanvien.IDNhanVien, casestudy.nhanvien.HoTen as HoTenNhanVien, casestudy.trinhdo.TrinhDo,casestudy.bophan.TenBoPhan,
casestudy.nhanvien.SDT as SoDienThoaiNhanVien, casestudy.nhanvien.DiaChi,casestudy.hopdong.NgayLamHopDong, count(casestudy.hopdong.IDNhanVien) as SoLuongHopDong
from casestudy.hopdong
inner join casestudy.nhanvien on casestudy.hopdong.IDNhanVien=casestudy.nhanvien.IDNhanVien
inner join casestudy.trinhdo on casestudy.nhanvien.IDTrinhDo=casestudy.trinhdo.IDTrinhDo
inner join casestudy.bophan on casestudy.bophan.IDBoPhan=casestudy.nhanvien.IDBoPhan
where (year(casestudy.hopdong.ngaylamhopdong) between '2018' and '2019')
group by casestudy.nhanvien.HoTen
having count(casestudy.hopdong.IDNhanVien) in (1,2,3);



insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(5,'Quy',1,3,4,'1997-12-11','123356789','13','31593801','abhc@abc.com','Ba Ria');
insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(6,'Binh',4,2,2,'1997-11-10','123493789','45','423198739187','abdsiiac@abc.com','Quang Nam');
insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(7,'Thoai',5,1,1,'1997-11-09','063256789','35','63839173983','absc@abad.com','Hue');
insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(8,'My',2,4,3,'1998-10-8','113432989','46','32175917391','aabcca@abc.com','TP HCM');

insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(29,'2017-11-11','2017-11-30',12,null,2,3,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(30,'2019-11-11','2019-11-30',10,null,5,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(31,'2016-11-11','2016-11-30',30,null,1,3,3);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(32,'2017-09-11','2017-11-30',12,null,3,3,1);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(33,'2018-12-11','2018-11-30',12,null,5,8,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(34,'2019-07-11','2019-11-30',12,null,6,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(35,'2018-11-11','2018-11-30',12,null,5,7,2);