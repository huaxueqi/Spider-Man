package 语法;

public class qwer {
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    private String userid;
    private Integer cid;

    public static void main(String[] args) {
        qwer q=new qwer();
        q.setCid(1);
        q.setUserid("1");
        q.syso(q);

    }
    public void syso(qwer w){
        System.out.println(w);

    }


}
