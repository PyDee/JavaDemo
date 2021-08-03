package TestFactory;

/**
 * 测试工厂模式，解耦 UserService 和 UserDao
 */

public class UserService {
    public static void main(String[] args) {
        UserDao dao = UserFactory.getDao();
        dao.add();
    }
}
