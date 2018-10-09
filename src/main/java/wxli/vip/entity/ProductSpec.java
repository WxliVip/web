package wxli.vip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class ProductSpec extends ProductSpecKey implements Serializable {
    /**
     * 短标题
     */
    private String shorttitle;

    /**
     * 长标题
     */
    private String longtitle;

    /**
     * 单位
     */
    private String specunit;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否启用折扣显示，1：启用，0不启用
     */
    private Integer showdiscountprice;

    /**
     * 折扣前同城价格
     */
    private BigDecimal rawprice;

    /**
     * 同城价格
     */
    private BigDecimal price;

    /**
     * 标签名称
     */
    private String tagname;

    /**
     * 标签
     */
    private Integer tag;

    /**
     * 简单描述
     */
    private String subtitle;

    /**
     * 排序值（倒序）
     */
    private Integer sortvalue;

    /**
     * 创建时间
     */
    private Date datachangeCreatetime;

    /**
     * 最后修改时间
     */
    private Date datachangeLasttime;

    private static final long serialVersionUID = 1L;

    public String getShorttitle() {
        return shorttitle;
    }

    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle;
    }

    public String getLongtitle() {
        return longtitle;
    }

    public void setLongtitle(String longtitle) {
        this.longtitle = longtitle;
    }

    public String getSpecunit() {
        return specunit;
    }

    public void setSpecunit(String specunit) {
        this.specunit = specunit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShowdiscountprice() {
        return showdiscountprice;
    }

    public void setShowdiscountprice(Integer showdiscountprice) {
        this.showdiscountprice = showdiscountprice;
    }

    public BigDecimal getRawprice() {
        return rawprice;
    }

    public void setRawprice(BigDecimal rawprice) {
        this.rawprice = rawprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getSortvalue() {
        return sortvalue;
    }

    public void setSortvalue(Integer sortvalue) {
        this.sortvalue = sortvalue;
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
        ProductSpec other = (ProductSpec) that;
        return (this.getSpecid() == null ? other.getSpecid() == null : this.getSpecid().equals(other.getSpecid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getShorttitle() == null ? other.getShorttitle() == null : this.getShorttitle().equals(other.getShorttitle()))
            && (this.getLongtitle() == null ? other.getLongtitle() == null : this.getLongtitle().equals(other.getLongtitle()))
            && (this.getSpecunit() == null ? other.getSpecunit() == null : this.getSpecunit().equals(other.getSpecunit()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getShowdiscountprice() == null ? other.getShowdiscountprice() == null : this.getShowdiscountprice().equals(other.getShowdiscountprice()))
            && (this.getRawprice() == null ? other.getRawprice() == null : this.getRawprice().equals(other.getRawprice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTagname() == null ? other.getTagname() == null : this.getTagname().equals(other.getTagname()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getSortvalue() == null ? other.getSortvalue() == null : this.getSortvalue().equals(other.getSortvalue()))
            && (this.getDatachangeCreatetime() == null ? other.getDatachangeCreatetime() == null : this.getDatachangeCreatetime().equals(other.getDatachangeCreatetime()))
            && (this.getDatachangeLasttime() == null ? other.getDatachangeLasttime() == null : this.getDatachangeLasttime().equals(other.getDatachangeLasttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpecid() == null) ? 0 : getSpecid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getShorttitle() == null) ? 0 : getShorttitle().hashCode());
        result = prime * result + ((getLongtitle() == null) ? 0 : getLongtitle().hashCode());
        result = prime * result + ((getSpecunit() == null) ? 0 : getSpecunit().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getShowdiscountprice() == null) ? 0 : getShowdiscountprice().hashCode());
        result = prime * result + ((getRawprice() == null) ? 0 : getRawprice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTagname() == null) ? 0 : getTagname().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getSortvalue() == null) ? 0 : getSortvalue().hashCode());
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
        sb.append(", shorttitle=").append(shorttitle);
        sb.append(", longtitle=").append(longtitle);
        sb.append(", specunit=").append(specunit);
        sb.append(", status=").append(status);
        sb.append(", showdiscountprice=").append(showdiscountprice);
        sb.append(", rawprice=").append(rawprice);
        sb.append(", price=").append(price);
        sb.append(", tagname=").append(tagname);
        sb.append(", tag=").append(tag);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", sortvalue=").append(sortvalue);
        sb.append(", datachangeCreatetime=").append(datachangeCreatetime);
        sb.append(", datachangeLasttime=").append(datachangeLasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}