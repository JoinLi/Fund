package ly.funds.bean;

/**
 * Created by Administrator on 2016/11/17.
 */
public class SocialLoginBean {


    /**
     * infocode : 1
     * infomessage :
     * data : {"uid":"1111","un":"130626199412155831","idno":"A60391407","rid":"{\"code\":\"71026e4457de4d7a8c4a94681cd659a0\",\"userid\":\"4E30A062E966A87CE0531900240ADAF2\",\"account\":\"130626199412155831\",\"idcard\":\"130626199412155831\",\"sid\":\"130108000406449\",\"name\":\"李颖\",\"userinfo\":{\"userid\":\"4E30A062E966A87CE0531900240ADAF2\",\"account\":\"130626199412155831\",\"name\":\"李颖\",\"idcard\":\"130626199412155831\",\"sid\":\"130108000406449\",\"sbkh\":\"A60391407\",\"utype\":\"0\",\"ustatus\":\"0\"},\"userbussList\":[{\"lsh\":\"1110164191\",\"bussbh\":\"ie0001\",\"idcard\":\"130626199412155831\",\"grbh\":\"10164191\",\"bstatus\":\"1\"},{\"lsh\":\"211301042014443\",\"bussbh\":\"j0001\",\"idcard\":\"130626199412155831\",\"grbh\":\"1301042014443\",\"bstatus\":\"1\"},{\"lsh\":\"3120131122000000001855\",\"bussbh\":\"k0001\",\"idcard\":\"130626199412155831\",\"grbh\":\"20131122000000001855\",\"bstatus\":\"KB_1\"}],\"bindUserName\":\"李颖\",\"bindUseridcard\":\"130626199412155831\",\"bindUserbussList\":[{\"lsh\":\"1110164191\",\"bussbh\":\"ie0001\",\"idcard\":\"130626199412155831\",\"grbh\":\"10164191\",\"bstatus\":\"1\"},{\"lsh\":\"211301042014443\",\"bussbh\":\"j0001\",\"idcard\":\"130626199412155831\",\"grbh\":\"1301042014443\",\"bstatus\":\"1\"},{\"lsh\":\"3120131122000000001855\",\"bussbh\":\"k0001\",\"idcard\":\"130626199412155831\",\"grbh\":\"20131122000000001855\",\"bstatus\":\"KB_1\"}]}","name":"李颖","act":true,"sino":"130108000406449","stat":"正常"}
     */

    private int infocode;
    private String infomessage;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * uid : 1111
         * un : 130626199412155831
         * idno : A60391407
         * rid : {"code":"71026e4457de4d7a8c4a94681cd659a0","userid":"4E30A062E966A87CE0531900240ADAF2","account":"130626199412155831","idcard":"130626199412155831","sid":"130108000406449","name":"李颖","userinfo":{"userid":"4E30A062E966A87CE0531900240ADAF2","account":"130626199412155831","name":"李颖","idcard":"130626199412155831","sid":"130108000406449","sbkh":"A60391407","utype":"0","ustatus":"0"},"userbussList":[{"lsh":"1110164191","bussbh":"ie0001","idcard":"130626199412155831","grbh":"10164191","bstatus":"1"},{"lsh":"211301042014443","bussbh":"j0001","idcard":"130626199412155831","grbh":"1301042014443","bstatus":"1"},{"lsh":"3120131122000000001855","bussbh":"k0001","idcard":"130626199412155831","grbh":"20131122000000001855","bstatus":"KB_1"}],"bindUserName":"李颖","bindUseridcard":"130626199412155831","bindUserbussList":[{"lsh":"1110164191","bussbh":"ie0001","idcard":"130626199412155831","grbh":"10164191","bstatus":"1"},{"lsh":"211301042014443","bussbh":"j0001","idcard":"130626199412155831","grbh":"1301042014443","bstatus":"1"},{"lsh":"3120131122000000001855","bussbh":"k0001","idcard":"130626199412155831","grbh":"20131122000000001855","bstatus":"KB_1"}]}
         * name : 李颖
         * act : true
         * sino : 130108000406449
         * stat : 正常
         */

        private String uid;
        private String un;
        private String idno;
        private String rid;
        private String name;
        private boolean act;
        private String sino;
        private String stat;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUn() {
            return un;
        }

        public void setUn(String un) {
            this.un = un;
        }

        public String getIdno() {
            return idno;
        }

        public void setIdno(String idno) {
            this.idno = idno;
        }

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isAct() {
            return act;
        }

        public void setAct(boolean act) {
            this.act = act;
        }

        public String getSino() {
            return sino;
        }

        public void setSino(String sino) {
            this.sino = sino;
        }

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }
    }
}
