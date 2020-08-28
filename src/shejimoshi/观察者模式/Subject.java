package shejimoshi.观察者模式;

public abstract class  Subject
{
    void Attach(Observer observer){

    };
    void Detach(Observer observer){

    };

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    private String subjectState;

}