package JSP;

public class calculate {
    public static float calculator(float fo,char op,float so){
        switch (op){
            case 'a':{
                return fo+so;
            }

            case 's':{
                return fo-so;
            }

            case 'm':{
                return fo*so;
            }

            case 'd': {
                if (so != 0) {
                    return fo / so;
                } else {
                    throw new RuntimeException("Khong the chia");
                }
            }
            default:throw new RuntimeException("Nhan");
        }
    }
}
