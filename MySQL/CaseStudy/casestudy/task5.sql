insert into casestudy.dichvudikem(IDDichVuDiKem,TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung)
values(1,'massage',100,1000,'Con');
insert into casestudy.dichvudikem(IDDichVuDiKem,TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung)
values(2,'karaoke',50,1000,'Con');
insert into casestudy.dichvudikem(IDDichVuDiKem,TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung)
values(3,'thức ăn',10,1000,'Con');
insert into casestudy.dichvudikem(IDDichVuDiKem,TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung)
values(4,'nước uống',20,1000,'Con');
insert into casestudy.dichvudikem(IDDichVuDiKem,TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung)
values(5,'thuê xe',30,1000,'Con');

insert into casestudy.hopdongchitiet(IDHopDongChiTiet,IDHopDong,IDDichVuDiKem,SoLuong)
values(1,3,5,5);
insert into casestudy.hopdongchitiet(IDHopDongChiTiet,IDHopDong,IDDichVuDiKem,SoLuong)
values(2,2,5,1);
insert into casestudy.hopdongchitiet(IDHopDongChiTiet,IDHopDong,IDDichVuDiKem,SoLuong)
values(3,5,4,2);
insert into casestudy.hopdongchitiet(IDHopDongChiTiet,IDHopDong,IDDichVuDiKem,SoLuong)
values(4,4,5,5);



SELECT casestudy.khachhang.IDKhachHang, casestudy.khachhang.HoTen,casestudy.loaikhach.TenLoaiKhach,casestudy.hopdong.IDHopDong,casestudy.dichvu.TenDichVu,
casestudy.hopdong.NgayLamHopDong,casestudy.hopdong.NgayKetThuc,(casestudy.dichvu.ChiPhiThue+casestudy.hopdongchitiet.soluong*casestudy.dichvudikem.Gia) as "TongTien"

FROM casestudy.hopdong
     JOIN casestudy.khachhang
          ON casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
     JOIN casestudy.loaikhach
          ON casestudy.khachhang.IDLoaiKhachHang=casestudy.loaikhach.IDLoaiKhachHang
	JOIN casestudy.dichvu
          ON casestudy.dichvu.IDDichVu=casestudy.hopdong.IDDichVu
	JOIN casestudy.hopdongchitiet
          ON casestudy.hopdong.IDHopDong=casestudy.hopdongchitiet.IDHopDong
	JOIN casestudy.dichvudikem
          ON casestudy.hopdongchitiet.IDDichVuDiKem=casestudy.dichvudikem.IDDichVuDiKem;


-- Sau Update
select casestudy.khachhang.IDKhachHang, casestudy.khachhang.HoTen,casestudy.loaikhach.TenLoaiKhach,casestudy.hopdong.IDHopDong,casestudy.dichvu.TenDichVu,
casestudy.hopdong.NgayLamHopDong,casestudy.hopdong.NgayKetThuc,sum(casestudy.dichvu.ChiPhiThue+casestudy.hopdongchitiet.soluong*casestudy.dichvudikem.Gia) as TongTien
from casestudy.khachhang
left join casestudy.loaikhach on casestudy.khachhang.IDLoaiKhachHang=casestudy.loaikhach.IDLoaiKhachHang
left join casestudy.hopdong on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
left join casestudy.dichvu on casestudy.dichvu.IDDichVu=casestudy.hopdong.IDDichVu
left join casestudy.hopdongchitiet on casestudy.hopdong.IDHopDong=casestudy.hopdongchitiet.IDHopDong
left join casestudy.dichvudikem on casestudy.hopdongchitiet.IDDichVuDiKem=casestudy.dichvudikem.IDDichVuDiKem
group by casestudy.hopdong.IDHopDong;







