package ly.funds.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/11/17.
 */
public class FundResultBean {


    /**
     * data : {"loancontrstate":"","UnitAccNum":"2016066823","_PAGEID":"step1","enddate":"","payeebankname":"","NoteMsg":"","_SENDOPERID":"130626199412155831","_PROCID":"60020007","houseaddr":"","TranSeq":"6930045","_TYPE":"init","temp_.itemval[4]":"销户","indiaccstate":"0","loanbal":"0.00","temp__rownum":"4","fundsouflag":"","linkman":"","zip":"","accname2":"query1","MTimeStamp":"2017-04-25 09:45:04","bankcode":"","_ACCNAME":"李颖","unitcustid":"","instcode":"","unitacctype":"","OpenDate":"","TranChannel":"4","type":"","temp_._xh[1]":"1","date1":"","clsaccdate":"","_LOGIP":"123.182.226.132","isSamePer":"true","AuthFlag":"1231","loanaccnum":"","transdate":"2016-09-26","_PORCNAME":"个人明细账查询","temp_._xh[2]":"2","loanterm":"0","TellCode":"0000","AccNum":"113170198675","accnum":"113170198675","UnitAccName":"河北学步桥人才交流服务有限公司","amt1":"4533.76","url":"/ydpx/60020007/602007_01.ydpx","apprnum":"","intamt":"647.68","temp_._xh[3]":"3","_WITHKEY":"0","ChannelSeq":"-241483","certitype":"","BrcCode":"00000000","_ACCNUM":"113170198675","unitaccname":"","_UNITACCNUM":"2016066823","AccName":"李颖","accname":"201703","ChkCode":"1231","_SENDDATE":"2017-04-25","temp_.itemid[1]":"0","BusiSeq":"6930045","peoplenum":"0","trancode":"118898","temp_._xh[4]":"4","TranDate":"2017-04-25","day":"","powdept":"","loandate":"","CertiNum":"130626199412155831","certinum":"130626199412155831","prin":"2944.00","_UNITACCNAME":"河北学步桥人才交流服务有限公司","accbankcode":"","custid":"","_DEPUTYIDCARDNUM":"130626199412155831","TranIP":"123.182.226.132","$page":"/ydpx/60020007/602007_01.ydpx","_SENDTIME":"2017-04-25","linkphone":"","temp_.itemid[2]":"1","uuid":"1493084822526","Balance":"","temp_.itemval[1]":"正常","RspCode":"000000","_IS":"-241483","loanrate":"0.000000","orgcode":"","RspMsg":"交易处理成功...","temp_.itemid[3]":"2","_BRANCHKIND":"0","CURRENT_SYSTEM_DATE":"2017-04-25","TranCode":"118898","_ISCROP":"0","temp_.itemval[2]":"封存","STimeStamp":"2017-04-25 09:45:04","payeebankaccnum":"","temp_.itemid[4]":"9","loancontrnum":"","cenbankacc":"","temp_.itemval[3]":"空账","AuthCode1":"1231","payeebankaccnm":"","AuthCode2":"1231","AuthCode3":"1231"}
     * returnCode : 0
     */

    private DataBean data;
    private String returnCode;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public static class DataBean {
        /**
         * loancontrstate :
         * UnitAccNum : 2016066823
         * _PAGEID : step1
         * enddate :
         * payeebankname :
         * NoteMsg :
         * _SENDOPERID : 130626199412155831
         * _PROCID : 60020007
         * houseaddr :
         * TranSeq : 6930045
         * _TYPE : init
         * temp_.itemval[4] : 销户
         * indiaccstate : 0
         * loanbal : 0.00
         * temp__rownum : 4
         * fundsouflag :
         * linkman :
         * zip :
         * accname2 : query1
         * MTimeStamp : 2017-04-25 09:45:04
         * bankcode :
         * _ACCNAME : 李颖
         * unitcustid :
         * instcode :
         * unitacctype :
         * OpenDate :
         * TranChannel : 4
         * type :
         * temp_._xh[1] : 1
         * date1 :
         * clsaccdate :
         * _LOGIP : 123.182.226.132
         * isSamePer : true
         * AuthFlag : 1231
         * loanaccnum :
         * transdate : 2016-09-26
         * _PORCNAME : 个人明细账查询
         * temp_._xh[2] : 2
         * loanterm : 0
         * TellCode : 0000
         * AccNum : 113170198675
         * accnum : 113170198675
         * UnitAccName : 河北学步桥人才交流服务有限公司
         * amt1 : 4533.76
         * url : /ydpx/60020007/602007_01.ydpx
         * apprnum :
         * intamt : 647.68
         * temp_._xh[3] : 3
         * _WITHKEY : 0
         * ChannelSeq : -241483
         * certitype :
         * BrcCode : 00000000
         * _ACCNUM : 113170198675
         * unitaccname :
         * _UNITACCNUM : 2016066823
         * AccName : 李颖
         * accname : 201703
         * ChkCode : 1231
         * _SENDDATE : 2017-04-25
         * temp_.itemid[1] : 0
         * BusiSeq : 6930045
         * peoplenum : 0
         * trancode : 118898
         * temp_._xh[4] : 4
         * TranDate : 2017-04-25
         * day :
         * powdept :
         * loandate :
         * CertiNum : 130626199412155831
         * certinum : 130626199412155831
         * prin : 2944.00
         * _UNITACCNAME : 河北学步桥人才交流服务有限公司
         * accbankcode :
         * custid :
         * _DEPUTYIDCARDNUM : 130626199412155831
         * TranIP : 123.182.226.132
         * $page : /ydpx/60020007/602007_01.ydpx
         * _SENDTIME : 2017-04-25
         * linkphone :
         * temp_.itemid[2] : 1
         * uuid : 1493084822526
         * Balance :
         * temp_.itemval[1] : 正常
         * RspCode : 000000
         * _IS : -241483
         * loanrate : 0.000000
         * orgcode :
         * RspMsg : 交易处理成功...
         * temp_.itemid[3] : 2
         * _BRANCHKIND : 0
         * CURRENT_SYSTEM_DATE : 2017-04-25
         * TranCode : 118898
         * _ISCROP : 0
         * temp_.itemval[2] : 封存
         * STimeStamp : 2017-04-25 09:45:04
         * payeebankaccnum :
         * temp_.itemid[4] : 9
         * loancontrnum :
         * cenbankacc :
         * temp_.itemval[3] : 空账
         * AuthCode1 : 1231
         * payeebankaccnm :
         * AuthCode2 : 1231
         * AuthCode3 : 1231
         */

        private String loancontrstate;
        private String UnitAccNum;
        private String _PAGEID;
        private String enddate;
        private String payeebankname;
        private String NoteMsg;
        private String _SENDOPERID;
        private String _PROCID;
        private String houseaddr;
        private String TranSeq;
        private String _TYPE;
        @SerializedName("temp_.itemval[4]")
        private String _$Temp_Itemval436; // FIXME check this code
        private String indiaccstate;
        private String loanbal;
        private String temp__rownum;
        private String fundsouflag;
        private String linkman;
        private String zip;
        private String accname2;
        private String MTimeStamp;
        private String bankcode;
        private String _ACCNAME;
        private String unitcustid;
        private String instcode;
        private String unitacctype;
        private String OpenDate;
        private String TranChannel;
        private String type;
        @SerializedName("temp_._xh[1]")
        private String _$Temp__xh1257; // FIXME check this code
        private String date1;
        private String clsaccdate;
        private String _LOGIP;
        private String isSamePer;
        private String AuthFlag;
        private String loanaccnum;
        private String transdate;
        private String _PORCNAME;
        @SerializedName("temp_._xh[2]")
        private String _$Temp__xh2276; // FIXME check this code
        private String loanterm;
        private String TellCode;
        private String AccNum;
        private String accnum;
        private String UnitAccName;
        private String amt1;
        private String url;
        private String apprnum;
        private String intamt;
        @SerializedName("temp_._xh[3]")
        private String _$Temp__xh368; // FIXME check this code
        private String _WITHKEY;
        private String ChannelSeq;
        private String certitype;
        private String BrcCode;
        private String _ACCNUM;
        private String unitaccname;
        private String _UNITACCNUM;
        private String AccName;
        private String accname;
        private String ChkCode;
        private String _SENDDATE;
        @SerializedName("temp_.itemid[1]")
        private String _$Temp_Itemid1283; // FIXME check this code
        private String BusiSeq;
        private String peoplenum;
        private String trancode;
        @SerializedName("temp_._xh[4]")
        private String _$Temp__xh4182; // FIXME check this code
        private String TranDate;
        private String day;
        private String powdept;
        private String loandate;
        private String CertiNum;
        private String certinum;
        private String prin;
        private String _UNITACCNAME;
        private String accbankcode;
        private String custid;
        private String _DEPUTYIDCARDNUM;
        private String TranIP;
        private String $page;
        private String _SENDTIME;
        private String linkphone;
        @SerializedName("temp_.itemid[2]")
        private String _$Temp_Itemid247; // FIXME check this code
        private String uuid;
        private String Balance;
        @SerializedName("temp_.itemval[1]")
        private String _$Temp_Itemval121; // FIXME check this code
        private String RspCode;
        private String _IS;
        private String loanrate;
        private String orgcode;
        private String RspMsg;
        @SerializedName("temp_.itemid[3]")
        private String _$Temp_Itemid3124; // FIXME check this code
        private String _BRANCHKIND;
        private String CURRENT_SYSTEM_DATE;
        private String TranCode;
        private String _ISCROP;
        @SerializedName("temp_.itemval[2]")
        private String _$Temp_Itemval2164; // FIXME check this code
        private String STimeStamp;
        private String payeebankaccnum;
        @SerializedName("temp_.itemid[4]")
        private String _$Temp_Itemid4199; // FIXME check this code
        private String loancontrnum;
        private String cenbankacc;
        @SerializedName("temp_.itemval[3]")
        private String _$Temp_Itemval3190; // FIXME check this code
        private String AuthCode1;
        private String payeebankaccnm;
        private String AuthCode2;
        private String AuthCode3;

        public String getLoancontrstate() {
            return loancontrstate;
        }

        public void setLoancontrstate(String loancontrstate) {
            this.loancontrstate = loancontrstate;
        }

        public String getUnitAccNum() {
            return UnitAccNum;
        }

        public void setUnitAccNum(String UnitAccNum) {
            this.UnitAccNum = UnitAccNum;
        }

        public String get_PAGEID() {
            return _PAGEID;
        }

        public void set_PAGEID(String _PAGEID) {
            this._PAGEID = _PAGEID;
        }

        public String getEnddate() {
            return enddate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public String getPayeebankname() {
            return payeebankname;
        }

        public void setPayeebankname(String payeebankname) {
            this.payeebankname = payeebankname;
        }

        public String getNoteMsg() {
            return NoteMsg;
        }

        public void setNoteMsg(String NoteMsg) {
            this.NoteMsg = NoteMsg;
        }

        public String get_SENDOPERID() {
            return _SENDOPERID;
        }

        public void set_SENDOPERID(String _SENDOPERID) {
            this._SENDOPERID = _SENDOPERID;
        }

        public String get_PROCID() {
            return _PROCID;
        }

        public void set_PROCID(String _PROCID) {
            this._PROCID = _PROCID;
        }

        public String getHouseaddr() {
            return houseaddr;
        }

        public void setHouseaddr(String houseaddr) {
            this.houseaddr = houseaddr;
        }

        public String getTranSeq() {
            return TranSeq;
        }

        public void setTranSeq(String TranSeq) {
            this.TranSeq = TranSeq;
        }

        public String get_TYPE() {
            return _TYPE;
        }

        public void set_TYPE(String _TYPE) {
            this._TYPE = _TYPE;
        }

        public String get_$Temp_Itemval436() {
            return _$Temp_Itemval436;
        }

        public void set_$Temp_Itemval436(String _$Temp_Itemval436) {
            this._$Temp_Itemval436 = _$Temp_Itemval436;
        }

        public String getIndiaccstate() {
            return indiaccstate;
        }

        public void setIndiaccstate(String indiaccstate) {
            this.indiaccstate = indiaccstate;
        }

        public String getLoanbal() {
            return loanbal;
        }

        public void setLoanbal(String loanbal) {
            this.loanbal = loanbal;
        }

        public String getTemp__rownum() {
            return temp__rownum;
        }

        public void setTemp__rownum(String temp__rownum) {
            this.temp__rownum = temp__rownum;
        }

        public String getFundsouflag() {
            return fundsouflag;
        }

        public void setFundsouflag(String fundsouflag) {
            this.fundsouflag = fundsouflag;
        }

        public String getLinkman() {
            return linkman;
        }

        public void setLinkman(String linkman) {
            this.linkman = linkman;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public String getAccname2() {
            return accname2;
        }

        public void setAccname2(String accname2) {
            this.accname2 = accname2;
        }

        public String getMTimeStamp() {
            return MTimeStamp;
        }

        public void setMTimeStamp(String MTimeStamp) {
            this.MTimeStamp = MTimeStamp;
        }

        public String getBankcode() {
            return bankcode;
        }

        public void setBankcode(String bankcode) {
            this.bankcode = bankcode;
        }

        public String get_ACCNAME() {
            return _ACCNAME;
        }

        public void set_ACCNAME(String _ACCNAME) {
            this._ACCNAME = _ACCNAME;
        }

        public String getUnitcustid() {
            return unitcustid;
        }

        public void setUnitcustid(String unitcustid) {
            this.unitcustid = unitcustid;
        }

        public String getInstcode() {
            return instcode;
        }

        public void setInstcode(String instcode) {
            this.instcode = instcode;
        }

        public String getUnitacctype() {
            return unitacctype;
        }

        public void setUnitacctype(String unitacctype) {
            this.unitacctype = unitacctype;
        }

        public String getOpenDate() {
            return OpenDate;
        }

        public void setOpenDate(String OpenDate) {
            this.OpenDate = OpenDate;
        }

        public String getTranChannel() {
            return TranChannel;
        }

        public void setTranChannel(String TranChannel) {
            this.TranChannel = TranChannel;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String get_$Temp__xh1257() {
            return _$Temp__xh1257;
        }

        public void set_$Temp__xh1257(String _$Temp__xh1257) {
            this._$Temp__xh1257 = _$Temp__xh1257;
        }

        public String getDate1() {
            return date1;
        }

        public void setDate1(String date1) {
            this.date1 = date1;
        }

        public String getClsaccdate() {
            return clsaccdate;
        }

        public void setClsaccdate(String clsaccdate) {
            this.clsaccdate = clsaccdate;
        }

        public String get_LOGIP() {
            return _LOGIP;
        }

        public void set_LOGIP(String _LOGIP) {
            this._LOGIP = _LOGIP;
        }

        public String getIsSamePer() {
            return isSamePer;
        }

        public void setIsSamePer(String isSamePer) {
            this.isSamePer = isSamePer;
        }

        public String getAuthFlag() {
            return AuthFlag;
        }

        public void setAuthFlag(String AuthFlag) {
            this.AuthFlag = AuthFlag;
        }

        public String getLoanaccnum() {
            return loanaccnum;
        }

        public void setLoanaccnum(String loanaccnum) {
            this.loanaccnum = loanaccnum;
        }

        public String getTransdate() {
            return transdate;
        }

        public void setTransdate(String transdate) {
            this.transdate = transdate;
        }

        public String get_PORCNAME() {
            return _PORCNAME;
        }

        public void set_PORCNAME(String _PORCNAME) {
            this._PORCNAME = _PORCNAME;
        }

        public String get_$Temp__xh2276() {
            return _$Temp__xh2276;
        }

        public void set_$Temp__xh2276(String _$Temp__xh2276) {
            this._$Temp__xh2276 = _$Temp__xh2276;
        }

        public String getLoanterm() {
            return loanterm;
        }

        public void setLoanterm(String loanterm) {
            this.loanterm = loanterm;
        }

        public String getTellCode() {
            return TellCode;
        }

        public void setTellCode(String TellCode) {
            this.TellCode = TellCode;
        }

        public String getAccNum() {
            return AccNum;
        }

        public void setAccNum(String AccNum) {
            this.AccNum = AccNum;
        }

        public String getAccnum() {
            return accnum;
        }

        public void setAccnum(String accnum) {
            this.accnum = accnum;
        }

        public String getUnitAccName() {
            return UnitAccName;
        }

        public void setUnitAccName(String UnitAccName) {
            this.UnitAccName = UnitAccName;
        }

        public String getAmt1() {
            return amt1;
        }

        public void setAmt1(String amt1) {
            this.amt1 = amt1;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getApprnum() {
            return apprnum;
        }

        public void setApprnum(String apprnum) {
            this.apprnum = apprnum;
        }

        public String getIntamt() {
            return intamt;
        }

        public void setIntamt(String intamt) {
            this.intamt = intamt;
        }

        public String get_$Temp__xh368() {
            return _$Temp__xh368;
        }

        public void set_$Temp__xh368(String _$Temp__xh368) {
            this._$Temp__xh368 = _$Temp__xh368;
        }

        public String get_WITHKEY() {
            return _WITHKEY;
        }

        public void set_WITHKEY(String _WITHKEY) {
            this._WITHKEY = _WITHKEY;
        }

        public String getChannelSeq() {
            return ChannelSeq;
        }

        public void setChannelSeq(String ChannelSeq) {
            this.ChannelSeq = ChannelSeq;
        }

        public String getCertitype() {
            return certitype;
        }

        public void setCertitype(String certitype) {
            this.certitype = certitype;
        }

        public String getBrcCode() {
            return BrcCode;
        }

        public void setBrcCode(String BrcCode) {
            this.BrcCode = BrcCode;
        }

        public String get_ACCNUM() {
            return _ACCNUM;
        }

        public void set_ACCNUM(String _ACCNUM) {
            this._ACCNUM = _ACCNUM;
        }

        public String getUnitaccname() {
            return unitaccname;
        }

        public void setUnitaccname(String unitaccname) {
            this.unitaccname = unitaccname;
        }

        public String get_UNITACCNUM() {
            return _UNITACCNUM;
        }

        public void set_UNITACCNUM(String _UNITACCNUM) {
            this._UNITACCNUM = _UNITACCNUM;
        }

        public String getAccName() {
            return AccName;
        }

        public void setAccName(String AccName) {
            this.AccName = AccName;
        }

        public String getAccname() {
            return accname;
        }

        public void setAccname(String accname) {
            this.accname = accname;
        }

        public String getChkCode() {
            return ChkCode;
        }

        public void setChkCode(String ChkCode) {
            this.ChkCode = ChkCode;
        }

        public String get_SENDDATE() {
            return _SENDDATE;
        }

        public void set_SENDDATE(String _SENDDATE) {
            this._SENDDATE = _SENDDATE;
        }

        public String get_$Temp_Itemid1283() {
            return _$Temp_Itemid1283;
        }

        public void set_$Temp_Itemid1283(String _$Temp_Itemid1283) {
            this._$Temp_Itemid1283 = _$Temp_Itemid1283;
        }

        public String getBusiSeq() {
            return BusiSeq;
        }

        public void setBusiSeq(String BusiSeq) {
            this.BusiSeq = BusiSeq;
        }

        public String getPeoplenum() {
            return peoplenum;
        }

        public void setPeoplenum(String peoplenum) {
            this.peoplenum = peoplenum;
        }

        public String getTrancode() {
            return trancode;
        }

        public void setTrancode(String trancode) {
            this.trancode = trancode;
        }

        public String get_$Temp__xh4182() {
            return _$Temp__xh4182;
        }

        public void set_$Temp__xh4182(String _$Temp__xh4182) {
            this._$Temp__xh4182 = _$Temp__xh4182;
        }

        public String getTranDate() {
            return TranDate;
        }

        public void setTranDate(String TranDate) {
            this.TranDate = TranDate;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getPowdept() {
            return powdept;
        }

        public void setPowdept(String powdept) {
            this.powdept = powdept;
        }

        public String getLoandate() {
            return loandate;
        }

        public void setLoandate(String loandate) {
            this.loandate = loandate;
        }

        public String getCertiNum() {
            return CertiNum;
        }

        public void setCertiNum(String CertiNum) {
            this.CertiNum = CertiNum;
        }

        public String getCertinum() {
            return certinum;
        }

        public void setCertinum(String certinum) {
            this.certinum = certinum;
        }

        public String getPrin() {
            return prin;
        }

        public void setPrin(String prin) {
            this.prin = prin;
        }

        public String get_UNITACCNAME() {
            return _UNITACCNAME;
        }

        public void set_UNITACCNAME(String _UNITACCNAME) {
            this._UNITACCNAME = _UNITACCNAME;
        }

        public String getAccbankcode() {
            return accbankcode;
        }

        public void setAccbankcode(String accbankcode) {
            this.accbankcode = accbankcode;
        }

        public String getCustid() {
            return custid;
        }

        public void setCustid(String custid) {
            this.custid = custid;
        }

        public String get_DEPUTYIDCARDNUM() {
            return _DEPUTYIDCARDNUM;
        }

        public void set_DEPUTYIDCARDNUM(String _DEPUTYIDCARDNUM) {
            this._DEPUTYIDCARDNUM = _DEPUTYIDCARDNUM;
        }

        public String getTranIP() {
            return TranIP;
        }

        public void setTranIP(String TranIP) {
            this.TranIP = TranIP;
        }

        public String get$page() {
            return $page;
        }

        public void set$page(String $page) {
            this.$page = $page;
        }

        public String get_SENDTIME() {
            return _SENDTIME;
        }

        public void set_SENDTIME(String _SENDTIME) {
            this._SENDTIME = _SENDTIME;
        }

        public String getLinkphone() {
            return linkphone;
        }

        public void setLinkphone(String linkphone) {
            this.linkphone = linkphone;
        }

        public String get_$Temp_Itemid247() {
            return _$Temp_Itemid247;
        }

        public void set_$Temp_Itemid247(String _$Temp_Itemid247) {
            this._$Temp_Itemid247 = _$Temp_Itemid247;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getBalance() {
            return Balance;
        }

        public void setBalance(String Balance) {
            this.Balance = Balance;
        }

        public String get_$Temp_Itemval121() {
            return _$Temp_Itemval121;
        }

        public void set_$Temp_Itemval121(String _$Temp_Itemval121) {
            this._$Temp_Itemval121 = _$Temp_Itemval121;
        }

        public String getRspCode() {
            return RspCode;
        }

        public void setRspCode(String RspCode) {
            this.RspCode = RspCode;
        }

        public String get_IS() {
            return _IS;
        }

        public void set_IS(String _IS) {
            this._IS = _IS;
        }

        public String getLoanrate() {
            return loanrate;
        }

        public void setLoanrate(String loanrate) {
            this.loanrate = loanrate;
        }

        public String getOrgcode() {
            return orgcode;
        }

        public void setOrgcode(String orgcode) {
            this.orgcode = orgcode;
        }

        public String getRspMsg() {
            return RspMsg;
        }

        public void setRspMsg(String RspMsg) {
            this.RspMsg = RspMsg;
        }

        public String get_$Temp_Itemid3124() {
            return _$Temp_Itemid3124;
        }

        public void set_$Temp_Itemid3124(String _$Temp_Itemid3124) {
            this._$Temp_Itemid3124 = _$Temp_Itemid3124;
        }

        public String get_BRANCHKIND() {
            return _BRANCHKIND;
        }

        public void set_BRANCHKIND(String _BRANCHKIND) {
            this._BRANCHKIND = _BRANCHKIND;
        }

        public String getCURRENT_SYSTEM_DATE() {
            return CURRENT_SYSTEM_DATE;
        }

        public void setCURRENT_SYSTEM_DATE(String CURRENT_SYSTEM_DATE) {
            this.CURRENT_SYSTEM_DATE = CURRENT_SYSTEM_DATE;
        }

        public String getTranCode() {
            return TranCode;
        }

        public void setTranCode(String TranCode) {
            this.TranCode = TranCode;
        }

        public String get_ISCROP() {
            return _ISCROP;
        }

        public void set_ISCROP(String _ISCROP) {
            this._ISCROP = _ISCROP;
        }

        public String get_$Temp_Itemval2164() {
            return _$Temp_Itemval2164;
        }

        public void set_$Temp_Itemval2164(String _$Temp_Itemval2164) {
            this._$Temp_Itemval2164 = _$Temp_Itemval2164;
        }

        public String getSTimeStamp() {
            return STimeStamp;
        }

        public void setSTimeStamp(String STimeStamp) {
            this.STimeStamp = STimeStamp;
        }

        public String getPayeebankaccnum() {
            return payeebankaccnum;
        }

        public void setPayeebankaccnum(String payeebankaccnum) {
            this.payeebankaccnum = payeebankaccnum;
        }

        public String get_$Temp_Itemid4199() {
            return _$Temp_Itemid4199;
        }

        public void set_$Temp_Itemid4199(String _$Temp_Itemid4199) {
            this._$Temp_Itemid4199 = _$Temp_Itemid4199;
        }

        public String getLoancontrnum() {
            return loancontrnum;
        }

        public void setLoancontrnum(String loancontrnum) {
            this.loancontrnum = loancontrnum;
        }

        public String getCenbankacc() {
            return cenbankacc;
        }

        public void setCenbankacc(String cenbankacc) {
            this.cenbankacc = cenbankacc;
        }

        public String get_$Temp_Itemval3190() {
            return _$Temp_Itemval3190;
        }

        public void set_$Temp_Itemval3190(String _$Temp_Itemval3190) {
            this._$Temp_Itemval3190 = _$Temp_Itemval3190;
        }

        public String getAuthCode1() {
            return AuthCode1;
        }

        public void setAuthCode1(String AuthCode1) {
            this.AuthCode1 = AuthCode1;
        }

        public String getPayeebankaccnm() {
            return payeebankaccnm;
        }

        public void setPayeebankaccnm(String payeebankaccnm) {
            this.payeebankaccnm = payeebankaccnm;
        }

        public String getAuthCode2() {
            return AuthCode2;
        }

        public void setAuthCode2(String AuthCode2) {
            this.AuthCode2 = AuthCode2;
        }

        public String getAuthCode3() {
            return AuthCode3;
        }

        public void setAuthCode3(String AuthCode3) {
            this.AuthCode3 = AuthCode3;
        }
    }
}
