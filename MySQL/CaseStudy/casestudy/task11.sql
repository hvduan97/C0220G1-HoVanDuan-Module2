select casestudy.khachhang.IDKhachHang,casestudy.dichvudikem.TenDichVuDiKem, casestudy.loaikhach.TenLoaiKhach,casestudy.khachhang.DiaChi
from casestudy.khachhang
inner join casestudy.hopdong on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
inner join casestudy.hopdongchitiet on casestudy.hopdongchitiet.IDHopDong=casestudy.hopdong.IDHopDong
inner join casestudy.dichvudikem on casestudy.dichvudikem.IDDichVuDiKem=casestudy.hopdongchitiet.IDDichVuDiKem
inner join casestudy.loaikhach on casestudy.loaikhach.IDLoaiKhachHang=casestudy.khachhang.IDLoaiKhachHang
where casestudy.loaikhach.TenLoaiKhach='Diamond' and (DiaChi in ('Vinh','Quang Ngai'));

-- Sau update
select casestudy.dichvudikem.TenDichVuDiKem,casestudy.dichvudikem.Gia,casestudy.dichvudikem.DonVi from casestudy.hopdong
inner join casestudy.hopdongchitiet on casestudy.hopdongchitiet.IDHopDong=casestudy.hopdong.IDHopDong
inner join casestudy.dichvudikem on casestudy.dichvudikem.IDDichVuDiKem=casestudy.hopdongchitiet.IDDichVuDiKem
inner join casestudy.khachhang on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
inner join casestudy.loaikhach on casestudy.loaikhach.IDLoaiKhachHang=casestudy.khachhang.IDLoaiKhachHang
where casestudy.loaikhach.TenLoaiKhach='Diamond' and casestudy.khachhang.DiaChi in ('Vinh','Quang Ngai');