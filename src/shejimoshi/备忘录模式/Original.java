package shejimoshi.备忘录模式;

public class Original {
    private String state;

    public Original(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建备忘录
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录
     */
    public void recoverMemento(Memento memento) {
        this.state = memento.getState();
    }
}