package wxli.vip.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductWithBLOBs extends Product implements Serializable {
    /**
     * 温馨提示
     */
    private String remindtip;

    /**
     * 配送提示
     */
    private String deliverytip;

    /**
     * 注意事项
     */
    private String noticetip;

    private static final long serialVersionUID = 1L;

    public String getRemindtip() {
        return remindtip;
    }

    public void setRemindtip(String remindtip) {
        this.remindtip = remindtip;
    }

    public String getDeliverytip() {
        return deliverytip;
    }

    public void setDeliverytip(String deliverytip) {
        this.deliverytip = deliverytip;
    }

    public String getNoticetip() {
        return noticetip;
    }

    public void setNoticetip(String noticetip) {
        this.noticetip = noticetip;
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
        ProductWithBLOBs other = (ProductWithBLOBs) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getProductunit() == null ? other.getProductunit() == null : this.getProductunit().equals(other.getProductunit()))
            && (this.getProductdesc() == null ? other.getProductdesc() == null : this.getProductdesc().equals(other.getProductdesc()))
            && (this.getProductparm() == null ? other.getProductparm() == null : this.getProductparm().equals(other.getProductparm()))
            && (this.getProductstatus() == null ? other.getProductstatus() == null : this.getProductstatus().equals(other.getProductstatus()))
            && (this.getSortvalue() == null ? other.getSortvalue() == null : this.getSortvalue().equals(other.getSortvalue()))
            && (this.getShowdiscountprice() == null ? other.getShowdiscountprice() == null : this.getShowdiscountprice().equals(other.getShowdiscountprice()))
            && (this.getRawprice() == null ? other.getRawprice() == null : this.getRawprice().equals(other.getRawprice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSalesvolume() == null ? other.getSalesvolume() == null : this.getSalesvolume().equals(other.getSalesvolume()))
            && (this.getLikesvolume() == null ? other.getLikesvolume() == null : this.getLikesvolume().equals(other.getLikesvolume()))
            && (this.getIssoldout() == null ? other.getIssoldout() == null : this.getIssoldout().equals(other.getIssoldout()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
            && (this.getCoverbig() == null ? other.getCoverbig() == null : this.getCoverbig().equals(other.getCoverbig()))
            && (this.getDatachangeCreatetime() == null ? other.getDatachangeCreatetime() == null : this.getDatachangeCreatetime().equals(other.getDatachangeCreatetime()))
            && (this.getDatachangeLasttime() == null ? other.getDatachangeLasttime() == null : this.getDatachangeLasttime().equals(other.getDatachangeLasttime()))
            && (this.getPresale() == null ? other.getPresale() == null : this.getPresale().equals(other.getPresale()))
            && (this.getSearchtag() == null ? other.getSearchtag() == null : this.getSearchtag().equals(other.getSearchtag()))
            && (this.getHottag() == null ? other.getHottag() == null : this.getHottag().equals(other.getHottag()))
            && (this.getVideoid() == null ? other.getVideoid() == null : this.getVideoid().equals(other.getVideoid()))
            && (this.getLiid() == null ? other.getLiid() == null : this.getLiid().equals(other.getLiid()))
            && (this.getRemindtip() == null ? other.getRemindtip() == null : this.getRemindtip().equals(other.getRemindtip()))
            && (this.getDeliverytip() == null ? other.getDeliverytip() == null : this.getDeliverytip().equals(other.getDeliverytip()))
            && (this.getNoticetip() == null ? other.getNoticetip() == null : this.getNoticetip().equals(other.getNoticetip()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getProductunit() == null) ? 0 : getProductunit().hashCode());
        result = prime * result + ((getProductdesc() == null) ? 0 : getProductdesc().hashCode());
        result = prime * result + ((getProductparm() == null) ? 0 : getProductparm().hashCode());
        result = prime * result + ((getProductstatus() == null) ? 0 : getProductstatus().hashCode());
        result = prime * result + ((getSortvalue() == null) ? 0 : getSortvalue().hashCode());
        result = prime * result + ((getShowdiscountprice() == null) ? 0 : getShowdiscountprice().hashCode());
        result = prime * result + ((getRawprice() == null) ? 0 : getRawprice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSalesvolume() == null) ? 0 : getSalesvolume().hashCode());
        result = prime * result + ((getLikesvolume() == null) ? 0 : getLikesvolume().hashCode());
        result = prime * result + ((getIssoldout() == null) ? 0 : getIssoldout().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getCoverbig() == null) ? 0 : getCoverbig().hashCode());
        result = prime * result + ((getDatachangeCreatetime() == null) ? 0 : getDatachangeCreatetime().hashCode());
        result = prime * result + ((getDatachangeLasttime() == null) ? 0 : getDatachangeLasttime().hashCode());
        result = prime * result + ((getPresale() == null) ? 0 : getPresale().hashCode());
        result = prime * result + ((getSearchtag() == null) ? 0 : getSearchtag().hashCode());
        result = prime * result + ((getHottag() == null) ? 0 : getHottag().hashCode());
        result = prime * result + ((getVideoid() == null) ? 0 : getVideoid().hashCode());
        result = prime * result + ((getLiid() == null) ? 0 : getLiid().hashCode());
        result = prime * result + ((getRemindtip() == null) ? 0 : getRemindtip().hashCode());
        result = prime * result + ((getDeliverytip() == null) ? 0 : getDeliverytip().hashCode());
        result = prime * result + ((getNoticetip() == null) ? 0 : getNoticetip().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", remindtip=").append(remindtip);
        sb.append(", deliverytip=").append(deliverytip);
        sb.append(", noticetip=").append(noticetip);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}