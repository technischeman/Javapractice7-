public class homework3 {
    public static void main(String[] args) {
        int[]elements={1,9,3};
        int[]neu=new int[2];
        for (int i = 0; i < elements.length-1 ; i++) {
           neu[i]=elements[i];

        }
        for (int i = 0; i < neu.length ; i++) {
            System.out.println("new"+neu[i]);


        }

    }
}
