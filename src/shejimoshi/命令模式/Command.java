package shejimoshi.命令模式;

public interface Command {
    /**
     * 口令执行
     */
    public void execute();

    /**
     * 口令撤销
     */
    public void undo();
}