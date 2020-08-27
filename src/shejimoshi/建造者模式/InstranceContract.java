package shejimoshi.建造者模式;

/**
 * 保险合同编号
 */
public class InstranceContract {
    /**
     * 保险合同编号
     */
    private String contractId;
    /**
     * 受保人名称，此处因为有限制条件：要么同个人签订，要么同公司签订
     * 也就是说，受保人名称属性同受保公司名称属性不能同时有值。
     */
    private String personName;
    /**
     * 受保公司名称
     */
    private String companyName;
    /**
     * 开始时间
     */
    private long beginDate;
    /**
     * 结束时间，需要大于开始时间
     */
    private long endDate;
    /**
     * 其他数据
     */
    private String otherData;

    private InstranceContract(ConcreteBuilder builder){
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
    }

    /**
     * 保险合同的一些操作
     */
    public void someOperation(){
        System.out.println("当前正在操作的保险合同编号为【"+this.contractId+"】");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "InstranceContract [contractId=" + contractId +
                ", personName=" + personName +
                ", companyName="+ companyName +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", otherData=" + otherData +
                "]";
    }

    public static class ConcreteBuilder {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        /**
         * 构造方法
         * @param contractId 保险合同编号
         * @param beginDate 生效时间
         * @param endDate 失效时间
         */
        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        public InstranceContract build() {
            if (contractId == null || contractId.trim().length() == 0) {
                throw new IllegalArgumentException("合同编号不能为空");
            }

            boolean signPerson = (personName != null && personName.trim().length() > 0);
            boolean signCompany = (companyName != null && companyName.trim().length() > 0);

            if (signPerson && signCompany) {
                throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");
            }

            if (!signPerson && !signCompany) {
                throw new IllegalArgumentException("一份保险合同不能没有签订对象");
            }

            if (beginDate <= 0) {
                throw new IllegalArgumentException("一份保险合同必须有生效的日期");
            }

            if (endDate <= 0) {
                throw new IllegalArgumentException("一份保险合同必须有失效的日期");
            }

            if (endDate <= beginDate) {
                throw new IllegalArgumentException("一份保险合同的失效日期必须要大于生效的日期");
            }

            return new InstranceContract(this);
        }
    }
}