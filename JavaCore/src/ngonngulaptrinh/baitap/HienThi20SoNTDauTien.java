package ngonngulaptrinh.baitap;

public class HienThi20SoNTDauTien {
    public static void main(String[] args) {
    int dem=1;
    int k=0;
    while (dem<=20){
        if (isPrime(k)){
            System.out.println(k);
            dem++;
        }
        k++;
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
