public class homework4 {
    public static void main(String[] args) {
        int[]x={5,6,7,9,10,11};
        int[]y={1,3,8,18,20,24};
        int[]source=x;
        int sourcepostion=3;
        int[]destinatin=y;
        int destpost=3;
        int len=3;
        System.arraycopy(source,sourcepostion,destinatin,destpost,len);
        for (int i = 0; i < y.length ; i++) {
            System.out.println(y[i]+"");

        }


    }
}
