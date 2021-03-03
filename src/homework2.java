public class homework2 {
    public static void main(String[] args) {
        int[]intarray=new int[]{5,6,7};
        int[]neuaarra=new int[4];
        for (int i = 0; i < intarray.length ; i++) {
            neuaarra[i]=intarray[i];

        }
        neuaarra[3]=8;
        for (int i = 0; i < neuaarra.length ; i++) {
            System.out.println("yeniler"+neuaarra[i]);


        }


    }
}
