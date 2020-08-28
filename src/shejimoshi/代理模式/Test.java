package shejimoshi.代理模式;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        LogEmbed log = new LogEmbed();
        log.setTarget(userDao);
        /**
         * 根据实现的接口产生代理
         */
        IUserDao userDaoProxy = (IUserDao) Proxy.newProxyInstance(userDao
                .getClass().getClassLoader(), userDao.getClass()
                .getInterfaces(), log);
        /**
         * 注意：这里在调用IUserDao接口里的add方法时，
         * 代理对象会帮我们调用实现了InvocationHandler接口的LogEmbed类的invoke方法。
         *
         * 这样做，是不是有点像Spring里面的拦截器呢？
         */
        userDaoProxy.add(new User("张三", "123"));
    }
}