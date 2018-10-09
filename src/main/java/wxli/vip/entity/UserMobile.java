package wxli.vip.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UserMobile implements Serializable {
    private Integer umid;

    private Integer userid;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 是否删除：1是0不是
     */
    private Integer isdeleted;

    /**
     * 创建时间
     */
    private Date datachangeCreatetime;

    /**
     * 最后修改时间
     */
    private Date datachangeLasttime;

    private static final long serialVersionUID = 1L;

    public Integer getUmid() {
        return umid;
    }

    public void setUmid(Integer umid) {
        this.umid = umid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
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
        UserMobile other = (UserMobile) that;
        return (this.getUmid() == null ? other.getUmid() == null : this.getUmid().equals(other.getUmid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getDatachangeCreatetime() == null ? other.getDatachangeCreatetime() == null : this.getDatachangeCreatetime().equals(other.getDatachangeCreatetime()))
            && (this.getDatachangeLasttime() == null ? other.getDatachangeLasttime() == null : this.getDatachangeLasttime().equals(other.getDatachangeLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUmid() == null) ? 0 : getUmid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
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
        sb.append(", umid=").append(umid);
        sb.append(", userid=").append(userid);
        sb.append(", mobile=").append(mobile);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", datachangeCreatetime=").append(datachangeCreatetime);
        sb.append(", datachangeLasttime=").append(datachangeLasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}