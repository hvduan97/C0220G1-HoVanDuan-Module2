select casestudy.hopdong.IDHopDong,casestudy.loaidichvu.TenLoaiDichVu,casestudy.dichvudikem.TenDichVuDiKem,count(casestudy.hopdongchitiet.IDDichVuDiKem) as solansudung
from casestudy.hopdong
inner join casestudy.dichvu on casestudy.dichvu.IDDichVu=casestudy.hopdong.IDDichVu
inner join casestudy.hopdongchitiet on casestudy.hopdongchitiet.IDHopDong=casestudy.hopdong.IDHopDong
inner join casestudy.dichvudikem on casestudy.dichvudikem.IDDichVuDiKem=casestudy.hopdongchitiet.IDDichVuDiKem
inner join casestudy.loaidichvu on casestudy.dichvu.IDLoaiDichVu=casestudy.loaidichvu.IDLoaiDichVu
group by casestudy.dichvudikem.TenDichVuDiKem
having count(casestudy.hopdongchitiet.IDDichVuDiKem)=1;

-- Sau update