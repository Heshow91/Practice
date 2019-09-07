package nPackage;

public class ArrayConcept {

    public static void main(String[] args) {

        //array: to store similar data type values in a variable
        //array = list of strings
        //lower bound/index = 0
        //upper bound/index = n-1 (n is size of array)

        int i [] = new int [4];
        i[0] = 10;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[2]);
        System.out.println(i[3]);

        System.out.println(i.length); // size of array

        // print a;; the values of array: use for loop
        for(int j = 0; j<i.length; j++){  // true conditions: establish number, condition and increment/decrement

            System.out.println(i[j]);

        }

        //2. double array:
        // decimal numbers
        double d[] = new double[3];
        d[0] = 12.33;
        d[1] = 13.44;
        d[2] = 45.55;

        System.out.println(d[2]);

        System.out.println("********************");

        //3. char array:
        // char can be any character (letter, numbers, symbols)
        char c[] = new char [3];
        c[0] = 'q';
        c[1] = 2;
        c[2] = '$';

        System.out.println(c[2]);

        System.out.println("********************");

        //4. boolean array: to test for true and false
        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        System.out.println(b[1]);
        System.out.println(b[0]);

        System.out.println("*******************");

        //5.String Array:

        String s[] = new String[3];
        s[0] = "test";
        s[1] = "Hello";
        s[2] = "World";

        System.out.println(s.length);
        System.out.println(s[0]);

        System.out.println("*******************");

        //6.Object Array (Object is a class)-- is sued to store data different data type of values
        Object ob [] = new Object[6];
        ob[0] = "Hisham";
        ob[1] = "27";
        ob[2] = "12.33";
        ob[3] = "10/1/1991";
        ob[4] = "M";
        ob[5] = "Yemen";

        System.out.println(ob[5]);
        System.out.println(ob.length);







    }
}
