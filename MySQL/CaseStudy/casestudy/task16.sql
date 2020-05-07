delete from casestudy.nhanvien 
where not exists(select casestudy.nhanvien.IDNhanVien from casestudy.hopdong where casestudy.hopdong.ngaylamhopdong between '2017-01-01' and '2019-12-31' and casestudy.hopdong.IDNhanVien=casestudy.nhanvien.IDNhanVien);



