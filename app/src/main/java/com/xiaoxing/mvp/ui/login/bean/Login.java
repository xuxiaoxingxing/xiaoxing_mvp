package com.xiaoxing.mvp.ui.login.bean;

/**
 * @name Xiaoxing_Mvp
 * @class name：com.xiaoxing.mvp.ui.login.bean
 * @class describe  登录
 * @anthor xiaoxing QQ:2235445233
 * @time 2017/9/22 14:55
 * @change
 * @chang time
 * @class describe
 */


public class Login {


    /**
     * code : 200
     * msg : success
     * data : {"uid":"107","user_name":"123","mobile":"123","password":"8cfa0cb786738c8b52bf7e68dc3093f1","salt":"swvfuc","lng":null,"lat":null,"reg_time":"1500015084","type":null,"cover":null,"address":"123","nick_name":"111","name":null,"is_admin":"0","is_superadmin":"0","sex":"2","member_money":"0","birthday":"19900101","points":"0","relation":"大哥","idno":"12356789","access_token":"384eOn7RSrrM8GFCCWzkgI6MxpJhkXoQHtzFxLuo5j0"}
     */

    private String code;
    private String msg;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * uid : 107
         * user_name : 123
         * mobile : 123
         * password : 8cfa0cb786738c8b52bf7e68dc3093f1
         * salt : swvfuc
         * lng : null
         * lat : null
         * reg_time : 1500015084
         * type : null
         * cover : null
         * address : 123
         * nick_name : 111
         * name : null
         * is_admin : 0
         * is_superadmin : 0
         * sex : 2
         * member_money : 0
         * birthday : 19900101
         * points : 0
         * relation : 大哥
         * idno : 12356789
         * access_token : 384eOn7RSrrM8GFCCWzkgI6MxpJhkXoQHtzFxLuo5j0
         */

        private String uid;
        private String user_name;
        private String mobile;
        private String password;
        private String salt;
        private Object lng;
        private Object lat;
        private String reg_time;
        private Object type;
        private Object cover;
        private String address;
        private String nick_name;
        private Object name;
        private String is_admin;
        private String is_superadmin;
        private String sex;
        private String member_money;
        private String birthday;
        private String points;
        private String relation;
        private String idno;
        private String access_token;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public Object getLng() {
            return lng;
        }

        public void setLng(Object lng) {
            this.lng = lng;
        }

        public Object getLat() {
            return lat;
        }

        public void setLat(Object lat) {
            this.lat = lat;
        }

        public String getReg_time() {
            return reg_time;
        }

        public void setReg_time(String reg_time) {
            this.reg_time = reg_time;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Object getCover() {
            return cover;
        }

        public void setCover(Object cover) {
            this.cover = cover;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public String getIs_admin() {
            return is_admin;
        }

        public void setIs_admin(String is_admin) {
            this.is_admin = is_admin;
        }

        public String getIs_superadmin() {
            return is_superadmin;
        }

        public void setIs_superadmin(String is_superadmin) {
            this.is_superadmin = is_superadmin;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getMember_money() {
            return member_money;
        }

        public void setMember_money(String member_money) {
            this.member_money = member_money;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public String getRelation() {
            return relation;
        }

        public void setRelation(String relation) {
            this.relation = relation;
        }

        public String getIdno() {
            return idno;
        }

        public void setIdno(String idno) {
            this.idno = idno;
        }

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }
    }
}
