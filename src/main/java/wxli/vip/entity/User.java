package wxli.vip.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class User implements Serializable {
    private Integer userid;

    /**
     * 用户名
     */
    private String username;

    private String password;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 性别：1男性0女性
     */
    private Integer sex;

    /**
     * 封面
     */
    private String cover;

    /**
     * 区域Id
     */
    private Integer areaid;

    /**
     * 一句话描述
     */
    private String shortdescription;

    /**
     * 0普通用户，1认证农人
     */
    private Integer usertype;

    /**
     * 网易云Token
     */
    private String token;

    /**
     * 用户来源 0 手机注册 1微信注册
     */
    private Integer fromsource;

    /**
     * 直播权限
     */
    private Integer livepower;

    /**
     * 录制权限 0没有 1有
     */
    private Integer recordingpower;

    /**
     * 发布的动态需要审核 0 需要 1 不需要
     */
    private Integer momentaudit;

    /**
     * 发布的直播需要审核 1 需要 0 不需要
     */
    private Integer liveaudit;

    /**
     * 创建时间
     */
    private Date datachangeCreatetime;

    /**
     * 最后修改时间
     */
    private Date datachangeLasttime;

    private String areaimg;

    private Integer operflag;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getFromsource() {
        return fromsource;
    }

    public void setFromsource(Integer fromsource) {
        this.fromsource = fromsource;
    }

    public Integer getLivepower() {
        return livepower;
    }

    public void setLivepower(Integer livepower) {
        this.livepower = livepower;
    }

    public Integer getRecordingpower() {
        return recordingpower;
    }

    public void setRecordingpower(Integer recordingpower) {
        this.recordingpower = recordingpower;
    }

    public Integer getMomentaudit() {
        return momentaudit;
    }

    public void setMomentaudit(Integer momentaudit) {
        this.momentaudit = momentaudit;
    }

    public Integer getLiveaudit() {
        return liveaudit;
    }

    public void setLiveaudit(Integer liveaudit) {
        this.liveaudit = liveaudit;
    }

    public Date getDatachangeCreatetime() {
        return datachangeCreatetime;
    }

    public void setDatachangeCreatetime(Date datachangeCreatetime) {
        this.datachangeCreatetime = datachangeCreatetime;
    }

    public Date getDatachangeLasttime() {
        return datachangeLasttime;
    }

    public void setDatachangeLasttime(Date datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }

    public String getAreaimg() {
        return areaimg;
    }

    public void setAreaimg(String areaimg) {
        this.areaimg = areaimg;
    }

    public Integer getOperflag() {
        return operflag;
    }

    public void setOperflag(Integer operflag) {
        this.operflag = operflag;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getShortdescription() == null ? other.getShortdescription() == null : this.getShortdescription().equals(other.getShortdescription()))
            && (this.getUsertype() == null ? other.getUsertype() == null : this.getUsertype().equals(other.getUsertype()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getFromsource() == null ? other.getFromsource() == null : this.getFromsource().equals(other.getFromsource()))
            && (this.getLivepower() == null ? other.getLivepower() == null : this.getLivepower().equals(other.getLivepower()))
            && (this.getRecordingpower() == null ? other.getRecordingpower() == null : this.getRecordingpower().equals(other.getRecordingpower()))
            && (this.getMomentaudit() == null ? other.getMomentaudit() == null : this.getMomentaudit().equals(other.getMomentaudit()))
            && (this.getLiveaudit() == null ? other.getLiveaudit() == null : this.getLiveaudit().equals(other.getLiveaudit()))
            && (this.getDatachangeCreatetime() == null ? other.getDatachangeCreatetime() == null : this.getDatachangeCreatetime().equals(other.getDatachangeCreatetime()))
            && (this.getDatachangeLasttime() == null ? other.getDatachangeLasttime() == null : this.getDatachangeLasttime().equals(other.getDatachangeLasttime()))
            && (this.getAreaimg() == null ? other.getAreaimg() == null : this.getAreaimg().equals(other.getAreaimg()))
            && (this.getOperflag() == null ? other.getOperflag() == null : this.getOperflag().equals(other.getOperflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getShortdescription() == null) ? 0 : getShortdescription().hashCode());
        result = prime * result + ((getUsertype() == null) ? 0 : getUsertype().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getFromsource() == null) ? 0 : getFromsource().hashCode());
        result = prime * result + ((getLivepower() == null) ? 0 : getLivepower().hashCode());
        result = prime * result + ((getRecordingpower() == null) ? 0 : getRecordingpower().hashCode());
        result = prime * result + ((getMomentaudit() == null) ? 0 : getMomentaudit().hashCode());
        result = prime * result + ((getLiveaudit() == null) ? 0 : getLiveaudit().hashCode());
        result = prime * result + ((getDatachangeCreatetime() == null) ? 0 : getDatachangeCreatetime().hashCode());
        result = prime * result + ((getDatachangeLasttime() == null) ? 0 : getDatachangeLasttime().hashCode());
        result = prime * result + ((getAreaimg() == null) ? 0 : getAreaimg().hashCode());
        result = prime * result + ((getOperflag() == null) ? 0 : getOperflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", avatar=").append(avatar);
        sb.append(", nickname=").append(nickname);
        sb.append(", introduction=").append(introduction);
        sb.append(", sex=").append(sex);
        sb.append(", cover=").append(cover);
        sb.append(", areaid=").append(areaid);
        sb.append(", shortdescription=").append(shortdescription);
        sb.append(", usertype=").append(usertype);
        sb.append(", token=").append(token);
        sb.append(", fromsource=").append(fromsource);
        sb.append(", livepower=").append(livepower);
        sb.append(", recordingpower=").append(recordingpower);
        sb.append(", momentaudit=").append(momentaudit);
        sb.append(", liveaudit=").append(liveaudit);
        sb.append(", datachangeCreatetime=").append(datachangeCreatetime);
        sb.append(", datachangeLasttime=").append(datachangeLasttime);
        sb.append(", areaimg=").append(areaimg);
        sb.append(", operflag=").append(operflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}