public class UserUnderAgeException extends RuntimeException {
    public UserUnderAgeException(int age) {
        super("User is underage. Has age " + age);
    }
    public UserUnderAgeException(String string) {
        super(string);
    }
}
