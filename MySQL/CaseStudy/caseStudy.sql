create database casestudy;
create table casestudy.Vitri(
	IDViTri int not null primary key auto_increment,
    TenViTri varchar(45)
);

create table casestudy.TrinhDo(
	IDTrinhDo int not null primary key,
    TrinhDo varchar(45)
);

create table casestudy.BoPhan(
    IDBoPhan int not null primary key,
    TenBoPhan varchar(45)
);

create table casestudy.NhanVien(
	IDNhanVien int not null primary key,
    HoTen varchar(45),
    IDViTri int,
    IDTrinhDo int,
    IDBoPhan int,
    foreign key (IDViTri) references Vitri(IDViTri),
    foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
    foreign key (IDBoPhan) references BoPhan(IDBoPhan),
    NgaySinh date,
    SoCMND varchar(45),
    Luong varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45)
);

create table casestudy.LoaiKhach(
	IDLoaiKhachHang int not null primary key,
    TenLoaiKhach varchar(45)
);

create table casestudy.KhachHang(
	IDKhachHang int not null primary key,
    IDLoaiKhachHang int,
    HoTen varchar(45),
    NgaySinh date,
    SoCMND varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key (IDLoaiKhachHang) references LoaiKhach(IDLoaiKhachHang)
);

create table casestudy.LoaiDichVu(
	IDLoaiDichVu int not null primary key,
    TenLoaiDichVu varchar(45)
);

create table casestudy.KieuThue(
	IDKieuThue varchar(45) not null primary key,
    TenKieuThue varchar(45),
    Gia int
);

create table casestudy.DichVu(
	IDDichVu int not null primary key,
    TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa varchar(45),
    ChiPhiThue varchar(45),
    IDKieuThue varchar(45),
    IDLoaiDichVu int,
    TrangThai varchar(45),
    foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu),
    foreign key (IDKieuThue) references KieuThue(IDKieuThue)
);

create table casestudy.HopDong(
	IDHopDong int not null primary key,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCong int,
    TongTien int,
    IDNhanVien int,
    IDKhachHang int,
    IDDichVu int,
    foreign key (IDNhanVien) references NhanVien(IDNhanVien),    
    foreign key (IDKhachHang) references KhachHang(IDKhachHang),
    foreign key (IDDichVu) references DichVu(IDDichVu)    
);

create table casestudy.DichVuDiKem(
	IDDichVuDiKem int not null primary key,
    TenDichVuDiKem varchar(45),
    Gia int,
    DonVi int,
    TrangThaiKhaDung varchar(45)
);

create table casestudy.HopDongChiTiet(
	IDHopDongChiTiet int not null primary key,
    IDHopDong int,
    IDDichVuDiKem int,
    SoLuong int,
    foreign key (IDHopDong) references HopDong(IDHopDong),
    foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);




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
where (HoTen like 'K%') or (HoTen like 'H%') or (HoTen like 'T%');

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

select* from casestudy.khachhang
where (year(NgaySinh) between 1970 and 2002) and ((DiaChi='Da Nang') or (DiaChi='Quang Tri'));



-- Task4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp 
-- xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

