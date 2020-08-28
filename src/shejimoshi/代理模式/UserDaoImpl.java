package shejimoshi.代理模式;

public class UserDaoImpl implements IUserDao {
    @Override
    public void add(User user) {
        System.out.println("add a user successfully..."+user.getUsername()+"  "+user.getPassword());
    }
}