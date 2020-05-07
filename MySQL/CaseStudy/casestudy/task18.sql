delete casestudy.khachhang,casestudy.hopdong,casestudy.hopdongchitiet from casestudy.khachhang
inner join casestudy.hopdong on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
inner join casestudy.hopdongchitiet on casestudy.hopdong.IDHopDong=casestudy.hopdongchitiet.IDHopDong
where not exists(select casestudy.hopdong.IDHopDong where year(casestudy.hopdong.ngaylamhopdong)>2016 and casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang)