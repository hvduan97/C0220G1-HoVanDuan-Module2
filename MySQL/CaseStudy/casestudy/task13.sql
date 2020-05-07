-- select casestudy.hopdong.IDKhachHang,casestudy.khachhang.HoTen as TenKhachHang, casestudy.dichvudikem.TenDichVuDiKem,count(casestudy.dichvudikem.IDDichVuDiKem) as soluong
-- from casestudy.hopdong
-- inner join casestudy.khachhang on casestudy.hopdong.IDKhachHang=casestudy.hopdong.IDKhachHang
-- inner join casestudy.hopdongchitiet on casestudy.hopdong.IDHopDong=casestudy.hopdongchitiet.IDHopDong
-- inner join casestudy.dichvudikem on casestudy.dichvudikem.IDDichVuDiKem=casestudy.hopdongchitiet.IDDichVuDiKem
-- group by casestudy.dichvudikem.TenDichVuDiKem;

-- Sau Update

create temporary table casestudy.temp
select casestudy.dichvudikem.TenDichVuDiKem as ten_dich_vu_di_kem,count(casestudy.hopdongchitiet.IDDichVuDiKem) as so_lan_su_dung 
from casestudy.hopdongchitiet
inner join casestudy.dichvudikem on casestudy.dichvudikem.IDDichVuDiKem=casestudy.hopdongchitiet.IDDichVuDiKem
group by casestudy.dichvudikem.TenDichVuDiKem;
select* from casestudy.temp;

create temporary table casestudy.temp1
select max(casestudy.temp.so_lan_su_dung) as max_so_lan_su_dung from casestudy.temp;
select*from casestudy.temp1;

select temp.ten_dich_vu_di_kem,temp.so_lan_su_dung from casestudy.temp
inner join casestudy.temp1 on casestudy.temp.so_lan_su_dung=casestudy.temp1.max_so_lan_su_dung;
drop temporary table casestudy.temp;
drop temporary table casestudy.temp1;
