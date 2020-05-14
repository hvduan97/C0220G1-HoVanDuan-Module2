-- Task2. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự. 
insert into casestudy.vitri(IDViTri,TenViTri)
values(1,'Lễ tân');
insert into casestudy.vitri(IDViTri,TenViTri)
values(2,'phục vụ');
insert into casestudy.vitri(IDViTri,TenViTri)
values(3,'chuyên viên');
insert into casestudy.vitri(IDViTri,TenViTri)
values(4,'giám sát');
insert into casestudy.vitri(IDViTri,TenViTri)
values(5,'quản lý');
insert into casestudy.vitri(IDViTri,TenViTri)
values(6,'giám đốc');

insert into casestudy.trinhdo(IDTrinhDo,TrinhDo)
values(1,'Trung cấp');
insert into casestudy.trinhdo(IDTrinhDo,TrinhDo)
values(2,'Cao đẳng');
insert into casestudy.trinhdo(IDTrinhDo,TrinhDo)
values(3,'Đại học');
insert into casestudy.trinhdo(IDTrinhDo,TrinhDo)
values(4,'sau đại học');

insert into casestudy.bophan(IDBoPhan,TenBoPhan)
values(1,'Sale – Marketing');
insert into casestudy.bophan(IDBoPhan,TenBoPhan)
values(2,'Hành Chính');
insert into casestudy.bophan(IDBoPhan,TenBoPhan)
values(3,'Phục vụ');
insert into casestudy.bophan(IDBoPhan,TenBoPhan)
values(4,'Quản lý');

insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(1,'Ho Van A',1,3,4,'1997-12-11','123376789','13','31093801','abc@abc.com','Ca Mau');
insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(2,'Tran Van A',4,2,2,'1997-11-10','123493789','45','423198739187','abdiiac@abc.com','Da Nang');
insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(3,'Khang Van A',5,1,1,'1997-11-09','063456789','35','13839173983','abc@abad.com','Hue');
insert into casestudy.nhanvien(IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values(4,'Nguyen Van A',2,4,3,'1998-10-8','123432989','46','32173917391','aabcc@abc.com','TP HCM');

update casestudy.nhanvien
set HoTen='Duan'
where IDNhanVien=1;
update casestudy.nhanvien
set HoTen='Khang'
where IDNhanVien=2;
update casestudy.nhanvien
set HoTen='Tuan'
where IDNhanVien=3;
update casestudy.nhanvien
set HoTen='Hong'
where IDNhanVien=4;

select* from casestudy.nhanvien
where ((HoTen like 'K%') or (HoTen like 'H%') or (HoTen like 'T%')) and length(HoTen)<16;