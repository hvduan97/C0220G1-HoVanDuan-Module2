select (month(casestudy.hopdong.NgayLamHopDong)) as MonthIn2019,count(casestudy.hopdong.IDKhachHang) as SoKhach
from casestudy.hopdong
where year(casestudy.hopdong.NgayLamHopDong)='2019'
group by (month(casestudy.hopdong.NgayLamHopDong))
order by (month(casestudy.hopdong.NgayLamHopDong)) asc;

-- Sau_update
select temp.month,count(month(casestudy.hopdong.ngaylamhopdong)) as sokhachhangdangki,sum(casestudy.hopdong.tongtien) as TongTien from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
left join casestudy.hopdong on month(casestudy.hopdong.ngaylamhopdong)=temp.month
left join casestudy.khachhang on casestudy.khachhang.IDKhachHang=casestudy.hopdong.IDKhachHang
where year(casestudy.hopdong.ngaylamhopdong)='2019' or year(casestudy.hopdong.ngaylamhopdong) is null or month(casestudy.hopdong.ngaylamhopdong) is null
group by temp.month
order by temp.month;