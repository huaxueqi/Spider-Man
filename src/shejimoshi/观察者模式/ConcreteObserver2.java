package shejimoshi.观察者模式;

class ConcreteObserver2 implements Observer
{
    private Subject subject;

    private String subjectState;

    private String name;
    public ConcreteObserver2(Subject subject,String name)
    {
        this.subject = subject;
        this.subjectState=subject.getSubjectState();
        this.name=name;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("2"+ "  "+ subject +"  " + name+ "  "+subjectState);
    }
}
