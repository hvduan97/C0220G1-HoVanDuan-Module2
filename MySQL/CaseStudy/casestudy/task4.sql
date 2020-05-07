-- Task4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp 
-- xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
insert into casestudy.loaidichvu(IDLoaiDichVu,TenLoaiDichVu)
values(1,'Villa');
insert into casestudy.loaidichvu(IDLoaiDichVu,TenLoaiDichVu)
values(2,'House');
insert into casestudy.loaidichvu(IDLoaiDichVu,TenLoaiDichVu)
values(3,'Room');

insert into casestudy.kieuthue(IDKieuThue,TenKieuThue,Gia)
values(1,'Nam',8760);
insert into casestudy.kieuthue(IDKieuThue,TenKieuThue,Gia)
values(2,'Thang',720);
insert into casestudy.kieuthue(IDKieuThue,TenKieuThue,Gia)
values(3,'Ngay',24);
insert into casestudy.kieuthue(IDKieuThue,TenKieuThue,Gia)
values(4,'Gio',1);

insert into casestudy.dichvu(IDDichVu,TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu,TrangThai)
values(1,'Villa',50,5,'50',15,2,1,'Con Phong');
insert into casestudy.dichvu(IDDichVu,TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu,TrangThai)
values(2,'House',40,4,'40',10,1,2,'Con Phong');
insert into casestudy.dichvu(IDDichVu,TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu,TrangThai)
values(3,'Room',30,3,'30',5,4,3,'Con Phong');

ALTER TABLE casestudy.dichvu
MODIFY COLUMN ChiPhiThue int;

insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(1,'2017-11-11','2017-11-30',12,null,2,3,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(2,'2019-11-11','2019-11-30',10,null,1,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(3,'2016-11-11','2016-11-30',30,null,1,3,3);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(4,'2017-09-11','2017-11-30',12,null,3,3,1);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(5,'2016-12-11','2017-11-30',12,null,4,8,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(6,'2017-07-11','2017-11-30',12,null,2,4,2);
insert into casestudy.hopdong(IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCong,TongTien,IDNhanVien,IDKhachHang,IDDichVu)
values(7,'2017-11-11','2017-11-30',12,null,2,7,2);



SELECT IDKhachHang, COUNT(IDKhachHang) AS "So luong"
FROM casestudy.hopdong
GROUP BY IDKhachHang;



SELECT casestudy.khachhang.IDLoaiKhachHang,casestudy.hopdong.IDKhachHang,COUNT(casestudy.hopdong.IDKhachHang)
FROM casestudy.hopdong
INNER JOIN casestudy.khachhang
ON casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
where IDLoaiKhachHang=1
group by casestudy.hopdong.IDKhachHang
order by COUNT(casestudy.hopdong.IDKhachHang) Asc;

-- Sau update
select casestudy.khachhang.HoTen,count(casestudy.hopdong.IDHopDong) as solandatphong
from casestudy.khachhang
inner join casestudy.hopdong
on casestudy.hopdong.IDKhachHang=casestudy.khachhang.IDKhachHang
inner join casestudy.loaikhach
on casestudy.khachhang.IDLoaiKhachHang=casestudy.loaikhach.IDLoaiKhachHang
where casestudy.loaikhach.TenLoaiKhach='Diamond'
group by casestudy.khachhang.IDKhachHang
order by solandatphong asc;


