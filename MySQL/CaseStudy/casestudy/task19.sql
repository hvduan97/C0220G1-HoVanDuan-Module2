update casestudy.dichvudikem inner join(select casestudy.dichvudikem.TenDichVuDiKem as ten_dich_vu_di_kem
from casestudy.hopdongchitiet inner join casestudy.dichvudikem on casestudy.dichvudikem.IDDichVuDiKem=casestudy.hopdongchitiet.IDDichVuDiKem
group by casestudy.dichvudikem.IDDichVuDiKem
having count(casestudy.hopdongchitiet.IDDichVuDiKem)>3) as temp set casestudy.dichvudikem.Gia=casestudy.dichvudikem.Gia*2 where casestudy.dichvudikem.TenDichVuDiKem=casestudy.temp.ten_dich_vu_di_kem;