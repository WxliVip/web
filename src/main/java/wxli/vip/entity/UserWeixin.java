package wxli.vip.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UserWeixin implements Serializable {
    /**
     * 自增
     */
    private Long wxid;

    /**
     * 用户ID
     */
    private Long userid;

    /**
     * 微信OPENID
     */
    private String openid;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像地址
     */
    private String headimage;

    /**
     * 国家
     */
    private String country;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 唯一UnionID
     */
    private String unionid;

    /**
     * 微信服务号OpenID
     */
    private String wsopenid;

    private Date datachangeCreatetime;

    private Date datachangeLasttime;

    private static final long serialVersionUID = 1L;

    public Long getWxid() {
        return wxid;
    }

    public void setWxid(Long wxid) {
        this.wxid = wxid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadimage() {
        return headimage;
    }

    public void setHeadimage(String headimage) {
        this.headimage = headimage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getWsopenid() {
        return wsopenid;
    }

    public void setWsopenid(String wsopenid) {
        this.wsopenid = wsopenid;
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
        UserWeixin other = (UserWeixin) that;
        return (this.getWxid() == null ? other.getWxid() == null : this.getWxid().equals(other.getWxid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getHeadimage() == null ? other.getHeadimage() == null : this.getHeadimage().equals(other.getHeadimage()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getWsopenid() == null ? other.getWsopenid() == null : this.getWsopenid().equals(other.getWsopenid()))
            && (this.getDatachangeCreatetime() == null ? other.getDatachangeCreatetime() == null : this.getDatachangeCreatetime().equals(other.getDatachangeCreatetime()))
            && (this.getDatachangeLasttime() == null ? other.getDatachangeLasttime() == null : this.getDatachangeLasttime().equals(other.getDatachangeLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWxid() == null) ? 0 : getWxid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getHeadimage() == null) ? 0 : getHeadimage().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getWsopenid() == null) ? 0 : getWsopenid().hashCode());
        result = prime * result + ((getDatachangeCreatetime() == null) ? 0 : getDatachangeCreatetime().hashCode());
        result = prime * result + ((getDatachangeLasttime() == null) ? 0 : getDatachangeLasttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wxid=").append(wxid);
        sb.append(", userid=").append(userid);
        sb.append(", openid=").append(openid);
        sb.append(", sex=").append(sex);
        sb.append(", nickname=").append(nickname);
        sb.append(", headimage=").append(headimage);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", unionid=").append(unionid);
        sb.append(", wsopenid=").append(wsopenid);
        sb.append(", datachangeCreatetime=").append(datachangeCreatetime);
        sb.append(", datachangeLasttime=").append(datachangeLasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}