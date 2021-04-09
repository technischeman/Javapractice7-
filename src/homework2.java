public class homework2 {
    public static void main(String[] args) {
        int[]intarray=new int[]{5,6,7};
        int[]newArray=new int[4];
        for (int i = 0; i < intarray.length ; i++) {
            newArray[i]=intarray[i];

        }
        newArray[3]=8;
        for (int i = 0; i < newArray.length ; i++) {
            System.out.println("yeniler"+newArray[i]);


        }


    }
}
