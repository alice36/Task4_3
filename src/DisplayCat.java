public class DisplayCat {
    public static void main(String[] args) {
        int remainder;
        String result ="";

        for(int x=11;x<=20;x+=4) {
            if(x==19){x++;}
            remainder = x % 27;
            result = result + (char) (remainder + 64);
        }
        System.out.println(result);
    }
}
