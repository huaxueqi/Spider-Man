package shejimoshi.中介者模式;

public class MyMediator implements Mediator {
private User zhangsan;
private User lisi;

public User getZhangsan() {
        return zhangsan;
        }

public User getLisi() {
        return lisi;
        }

@Override
public void createMediator() {
        zhangsan = new ZhangSan(this);
        lisi = new LiSi(this);
        }

/**
 * 中介向要找房子的那些人推荐房子，由他们选择自己想要的房子
 */
@Override
public void recommendHouse() {
        zhangsan.selectHouse();
        lisi.selectHouse();
        }
        }
