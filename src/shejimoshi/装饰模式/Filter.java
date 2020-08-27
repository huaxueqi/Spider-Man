package shejimoshi.装饰模式;

class Filter implements Filterable {

    @Override
    public void filter() {
        System.out.println("目标类的核心过滤方法...");
    }
}

