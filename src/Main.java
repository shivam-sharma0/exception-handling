import java.io.IOException;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void func() throws ArithmeticException {
        int b=0;
        int[] arr = {1,2,3};
        System.out.println("D");
        System.out.println(arr[5]);  // throw new ArrayIndexOutOfBound();
        int a = 5 / b; // ArithmeticException
        System.out.println("E");
        System.out.println("E");
        System.out.println("E");
        System.out.println("E");
    }

    public static class A {
        public static void getInfo(int age) throws UserUnderAgeException{
            if(age<18) {
                throw new UserUnderAgeException(age);
            }
        }

        //throws compulsory for checked Exceptions
        public static void getInfo2(int age) throws IOException{
            if(age<18) {
                throw new IOException("user underage"); // CHECKED EXCEPTIONS
            }
        }

        public static String method1() {
            System.out.println("A");
            int c = 1;
            try {
                int b = 5/c; //arithemetic
                return "try";
            } catch(UserUnderAgeException ex) {
                System.out.println("F");
            } finally {
                System.out.println("P");
                return "finally";
            }
        }
    }

    public static void main(String[] args) {
       A a = new A();
       //try catch compulsory for checked exception
       try {
           a.getInfo2(15);
       } catch(IOException ex) {
       }
    }
}