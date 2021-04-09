import java.util.ArrayList;

public class homeework1 {
    public static void main(String[] args) {
         int intarray[]=new int[4];

         int[] personelid=new int[6];

         int total=78;
         int[] array=new int[total];
         int[] array1={5,6,7};
         int lengthOf= intarray.length;
        System.out.println("intarray.lenght"+intarray.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("elemanöar"+array1[i]);
            String[]first={"a","b","c"};
            String[]second=new String[3];
            second=first.clone();
            for (int j = 0; j < second.length ; j++) {
                System.out.println("second"+second[j]);




            }
            boolean isEqual=first.equals(second);
            System.out.println("is Right"+isEqual);



        }






    }
}
