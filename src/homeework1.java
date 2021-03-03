import java.util.ArrayList;

public class homeework1 {
    public static void main(String[] args) {
         int intarray[]=new int[4];

         int[] personelid=new int[6];

         int total=78;
         int[] array=new int[total];
         int[] array1={5,6,7};
         int uznunluk= intarray.length;
        System.out.println("intarray.lenght"+intarray.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("elemanöar"+array1[i]);
            String[]birinci={"a","b","c"};
            String[]ikiinci=new String[3];
            ikiinci=birinci.clone();
            for (int j = 0; j < ikiinci.length ; j++) {
                System.out.println("ikinci"+ikiinci[j]);




            }
            boolean aynimi=birinci.equals(ikiinci);
            System.out.println("dpgrumu"+aynimi);



        }






    }
}
