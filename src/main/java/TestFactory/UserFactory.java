package TestFactory;

public class UserFactory {
    public static UserDao getDao() {
        return new UserDao();
    }
}
