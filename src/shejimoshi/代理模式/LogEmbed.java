package shejimoshi.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogEmbed implements InvocationHandler {
    private IUserDao target;

    /**
     * 对target进行封装
     */
    public IUserDao getTarget() {
        return target;
    }

    public void setTarget(IUserDao target) {
        this.target = target;
    }

    private void beforeMethod() {
        System.out.println("add start...");
    }

    private void afterMethod() {
        System.out.println("add end...");
    }

    /**
     * 这里用到了反射
     *
     * proxy 代理对象
     *
     * method 目标方法
     *
     * args 目标方法里面参数列表
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        beforeMethod();
        // 回调目标对象的方法
        method.invoke(target, args);
        System.out.println("LogEmbed --invoke-> method = " + method.getName());
        afterMethod();
        return null;
    }
}