import java.util.*;

class toilet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h = sc.next();
        char[] l = h.toCharArray();
        int a = 0, b = 0, d= 0;

        char first = l[0],
        second = l[1];

    char last = first;

        for (int i = 1; i < h.length(); i++) {
            char c = h.toCharArray()[i];
            //System.out.print(c);
            if (c == 'D') {
                if (i == 1 && c == first) {
                    a++;
                    //System.out.println("x");
                } else {
		            a +=2;
                }
            }
            if (c == 'U') {
	    	    if (i == 1 && c == first) {
                    b++;
                } else {
		            b +=2;
                }
            }
            if (c != last) {
                d++;
            }
            last = c;


	}    
	System.out.println(a+"\n"+b+"\n"+d);
    }
}
