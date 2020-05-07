-- Task17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

-- Hiển thị
select casestudy.hopdong.IDKhachHang,casestudy.khachhang.HoTen as TenKhachHang, casestudy.loaikhach.TenLoaiKhach,sum(casestudy.hopdong.TongTien) as TongTien
from casestudy.hopdong
inner join casestudy.khachhang on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
inner join casestudy.loaikhach on casestudy.khachhang.IDLoaiKhachHang=casestudy.loaikhach.IDLoaiKhachHang
where (year(casestudy.hopdong.ngaylamhopdong)='2019' and casestudy.loaikhach.TenLoaiKhach='Platinium')
group by casestudy.hopdong.IDKhachHang
having sum(casestudy.hopdong.TongTien)>10000000;


-- update
update casestudy.khachhang,casestudy.hopdong
set casestudy.loaikhach.TenLoaiKhach='Diamond'
where (year(casestudy.hopdong.ngaylamhopdong)='2019' and casestudy.loaikhach.TenLoaiKhach='Platinium');

-- Sau update
update casestudy.khachhang,(select casestudy.hopdong.idkhachhang as id,sum(casestudy.hopdong.tongtien) as TongTien from casestudy.hopdong
where year(casestudy.hopdong.ngaylamhopdong)='2019'
group by casestudy.hopdong.idkhachhang
having TongTien>10000000) as temp set casestudy.khachhang.IDLoaiKhachHang=(select casestudy.loaikhach.IDLoaiKhachHang from casestudy.loaikhach where casestudy.loaikhach.TenLoaiKhach='Diamond') 
where casestudy.khachhang.IDLoaiKhachHang=(select casestudy.loaikhach.IDLoaiKhachHang from casestudy.loaikhach where casestudy.loaikhach.TenLoaiKhach='Platinium')
and casestudy.temp.id=casestudy.khachhang.IDKhachHang;

