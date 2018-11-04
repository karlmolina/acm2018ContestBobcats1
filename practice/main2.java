import java.util.*;

class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] array = {a,b,c};
        Arrays.sort(array);

        int firstDiff = array[1] - array[0];
        int secDiff = array[2] - array[1];
        //System.out.println(firstDiff + ", " + secDiff);
        if (firstDiff > secDiff) {
            System.out.println(array[1] - secDiff);
        }
        else if(firstDiff < secDiff) {
System.out.println(array[2] - firstDiff);
        } else {
            System.out.println(array[2]+firstDiff);
        }
    }
}
