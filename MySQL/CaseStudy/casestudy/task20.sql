select casestudy.nhanvien.IDNhanVien,casestudy.nhanvien.HoTen as HoTenNhanVien,casestudy.nhanvien.Email as EmailNV, casestudy.nhanvien.SDT as SoDienThoaiNV,
casestudy.nhanvien.NgaySinh as NgaySinhNV, casestudy.nhanvien.DiaChi as DiaChiNhanVien from casestudy.nhanvien
union all
select casestudy.khachhang.IDKhachHang,casestudy.khachhang.HoTen as HoTenKH,
casestudy.khachhang.Email as EmailKH, casestudy.khachhang.SDT as SoDienThoaiKH,casestudy.khachhang.NgaySinh as NgaySinhKH,casestudy.khachhang.DiaChi as DiaChiKH from casestudy.khachhang;