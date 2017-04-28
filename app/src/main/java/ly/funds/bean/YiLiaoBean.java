package ly.funds.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
public class YiLiaoBean {
    public static final String FUND_URL = "http://www.sjzgjj.cn/";
    public static final String FUND_CODE_URL = FUND_URL +"wsyyt/vericode.jsp";    //石家庄公积金验证码Api
    public static final String FUND_LOGIN_URL = FUND_URL +"wsyyt/per.login";    //登录Api


    public static final String SOCIAL_URL = "http://222.222.46.98:8001/";   //石家庄保险
    public static final String SOCIAL_LOGIN_URL = SOCIAL_URL +"ggfwserver/user/login.action";    //登录Api
    public static final String SOCIAL_YILIAO_URL = SOCIAL_URL +"ggfwserver/k/grzh.do";

    /**
     * infocode : 1
     * infomessage :
     * data : {"total":1,"data":[{"baz001":"201311220000000018552017","aac001":"20131122000000001855","aae001":"2017","aae200":"0","aae201":"0","bkc010":"555.62","bkc020":"168.26","bkc021":"0","bkc022":"0.0","bkc030":"433.36","bkc031":"0.0","bkc032":"0.0","bkc033":"46.0","bkc034":"0.0","bkc035":"0.0"}],"pagesize":0,"pageno":0}
     */

    private int infocode;
    private String infomessage;
    private DataBeanX data;

    public int getInfocode() {
        return infocode;
    }

    public void setInfocode(int infocode) {
        this.infocode = infocode;
    }

    public String getInfomessage() {
        return infomessage;
    }

    public void setInfomessage(String infomessage) {
        this.infomessage = infomessage;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * total : 1
         * data : [{"baz001":"201311220000000018552017","aac001":"20131122000000001855","aae001":"2017","aae200":"0","aae201":"0","bkc010":"555.62","bkc020":"168.26","bkc021":"0","bkc022":"0.0","bkc030":"433.36","bkc031":"0.0","bkc032":"0.0","bkc033":"46.0","bkc034":"0.0","bkc035":"0.0"}]
         * pagesize : 0
         * pageno : 0
         */

        private int total;
        private int pagesize;
        private int pageno;
        private List<DataBean> data;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getPageno() {
            return pageno;
        }

        public void setPageno(int pageno) {
            this.pageno = pageno;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * baz001 : 201311220000000018552017
             * aac001 : 20131122000000001855
             * aae001 : 2017
             * aae200 : 0
             * aae201 : 0
             * bkc010 : 555.62
             * bkc020 : 168.26
             * bkc021 : 0
             * bkc022 : 0.0
             * bkc030 : 433.36
             * bkc031 : 0.0
             * bkc032 : 0.0
             * bkc033 : 46.0
             * bkc034 : 0.0
             * bkc035 : 0.0
             */

            private String baz001;
            private String aac001;
            private String aae001;
            private String aae200;
            private String aae201;
            private String bkc010;
            private String bkc020;
            private String bkc021;
            private String bkc022;
            private String bkc030;
            private String bkc031;
            private String bkc032;
            private String bkc033;
            private String bkc034;
            private String bkc035;

            public String getBaz001() {
                return baz001;
            }

            public void setBaz001(String baz001) {
                this.baz001 = baz001;
            }

            public String getAac001() {
                return aac001;
            }

            public void setAac001(String aac001) {
                this.aac001 = aac001;
            }

            public String getAae001() {
                return aae001;
            }

            public void setAae001(String aae001) {
                this.aae001 = aae001;
            }

            public String getAae200() {
                return aae200;
            }

            public void setAae200(String aae200) {
                this.aae200 = aae200;
            }

            public String getAae201() {
                return aae201;
            }

            public void setAae201(String aae201) {
                this.aae201 = aae201;
            }

            public String getBkc010() {
                return bkc010;
            }

            public void setBkc010(String bkc010) {
                this.bkc010 = bkc010;
            }

            public String getBkc020() {
                return bkc020;
            }

            public void setBkc020(String bkc020) {
                this.bkc020 = bkc020;
            }

            public String getBkc021() {
                return bkc021;
            }

            public void setBkc021(String bkc021) {
                this.bkc021 = bkc021;
            }

            public String getBkc022() {
                return bkc022;
            }

            public void setBkc022(String bkc022) {
                this.bkc022 = bkc022;
            }

            public String getBkc030() {
                return bkc030;
            }

            public void setBkc030(String bkc030) {
                this.bkc030 = bkc030;
            }

            public String getBkc031() {
                return bkc031;
            }

            public void setBkc031(String bkc031) {
                this.bkc031 = bkc031;
            }

            public String getBkc032() {
                return bkc032;
            }

            public void setBkc032(String bkc032) {
                this.bkc032 = bkc032;
            }

            public String getBkc033() {
                return bkc033;
            }

            public void setBkc033(String bkc033) {
                this.bkc033 = bkc033;
            }

            public String getBkc034() {
                return bkc034;
            }

            public void setBkc034(String bkc034) {
                this.bkc034 = bkc034;
            }

            public String getBkc035() {
                return bkc035;
            }

            public void setBkc035(String bkc035) {
                this.bkc035 = bkc035;
            }
        }
    }
}
