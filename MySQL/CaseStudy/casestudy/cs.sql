create database casestudy;
create table casestudy.Vitri(
	IDViTri int not null primary key,
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
	IDKieuThue int not null primary key,
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
    IDKieuThue int,
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