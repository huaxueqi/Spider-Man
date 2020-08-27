package shejimoshi.装饰模式;


    class DecoratorForFilter1 implements Filterable {
        private Filterable filterable;

        public DecoratorForFilter1(Filterable filterable) {
            this.filterable = filterable;
        }

        private void beforeMethod() {
            System.out.println("DecoratorForFilter1 --> 核心过滤方法执行前执行");
        }

        private void afterMethod() {
            System.out.println("DecoratorForFilter1 --> 核心过滤方法执行后执行");
        }

        @Override
        public void filter() {
            beforeMethod();
            filterable.filter();
            afterMethod();
        }
    }

