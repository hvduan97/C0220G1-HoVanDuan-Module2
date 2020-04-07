package ngonngulaptrinh.baitap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int i=2;i<100;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int num){
        int dem=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                dem++;
            }
        }
        if (dem==2){
            return true;
        }
        else {
            return false;
        }
    }
}
