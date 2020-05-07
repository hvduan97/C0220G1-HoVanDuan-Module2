-- Task3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
insert into casestudy.loaikhach(IDLoaiKhachHang,TenLoaiKhach)
values(1,'Diamond');
insert into casestudy.loaikhach(IDLoaiKhachHang,TenLoaiKhach)
values(2,'Platinium');
insert into casestudy.loaikhach(IDLoaiKhachHang,TenLoaiKhach)
values(3,'Gold');
insert into casestudy.loaikhach(IDLoaiKhachHang,TenLoaiKhach)
values(4,'Silver');
insert into casestudy.loaikhach(IDLoaiKhachHang,TenLoaiKhach)
values(5,'Member');

insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(1,2,'Tuan','1997-12-11','36183718','361837678163','ahc@dhja.com','Da Nang');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(2,5,'Khanh','2000-2-11','36176718','360980078163','ahc@djhda.com','Quang Tri');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(3,1,'Hong','2010-12-11','36196318','361864188163','aahc@dhja.com','Quang Tri');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(4,3,'Ha','2009-12-11','36190518','520764188163','aahc@djaha.com','TP HCM');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(5,3,'Ha','2008-12-11','36190128','520796188163','aahc@djaha.com','Hue');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(6,3,'Hang','1990-12-11','36106128','720796188163','aahc@agjaha.com','Quang Tri');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(7,1,'Duan','1985-12-11','36187128','520706388163','aac@djaha.com','Hue');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(8,4,'Sa','1997-12-11','36153128','520796189663','achc@djaha.com','Da Nang');

insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(9,2,'Hoang','1997-12-11','36183718','361837678163','ahc@dhja.com','Da Nang');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(10,5,'Tho','2000-2-11','36176718','360980078163','ahc@djhda.com','Vinh');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(11,1,'Dung','2010-12-11','36196318','361864188163','aahc@dhja.com','Can Tho');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(12,3,'Quy','2009-12-11','36190518','520764188163','aahc@djaha.com','Quang Ngai');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(13,3,'Quang','2008-12-11','36190128','520796188163','aahc@djaha.com','Vinh');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(14,3,'Viet','1990-12-11','36106128','720796188163','aahc@agjaha.com','Vinh');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(15,1,'Nhi','1985-12-11','36187128','520706388163','aac@djaha.com','Hue');
insert into casestudy.khachhang(IDKhachHang,IDLoaiKhachHang,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi)
values(16,4,'Phap','1997-12-11','36153128','520796189663','achc@djaha.com','Quang Ngai');

select* from casestudy.khachhang
where (year(NgaySinh) between 1970 and 2002) and ((DiaChi='Da Nang') or (DiaChi='Quang Tri'));


-- Sau Update
select* from casestudy.khachhang
where DiaChi in ('Da Nang','Quang Tri') and(curdate()-NgaySinh>(18*30*365) and curdate()-NgaySinh<(50*30*365));
