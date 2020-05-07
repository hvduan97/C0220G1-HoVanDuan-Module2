-- Task10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).

select casestudy.hopdong.IDHopDong,casestudy.hopdong.NgayLamHopDong,casestudy.hopdong.NgayKetThuc,casestudy.hopdong.TienDatCong,count(casestudy.hopdongchitiet.IDHopDongChiTiet) as SoLuongDichVuDiKem
from casestudy.hopdong
inner join casestudy.hopdongchitiet on casestudy.hopdongchitiet.IDHopDong=casestudy.hopdong.IDHopDong
group by casestudy.hopdong.IDHopDong;

-- Sau update
select distinct casestudy.hopdong.IDHopDong,casestudy.hopdong.NgayLamHopDong,casestudy.hopdong.NgayKetThuc,casestudy.hopdong.TienDatCong,count(casestudy.hopdongchitiet.IDDichVuDiKem) as SoLuongDichVuDiKem
from casestudy.hopdong
inner join casestudy.hopdongchitiet on casestudy.hopdongchitiet.IDHopDong=casestudy.hopdong.IDHopDong
group by casestudy.hopdong.IDHopDong;