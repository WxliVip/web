package wxli.vip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Product implements Serializable {
    /**
     * 产品Id（自增）
     */
    private Integer productid;

    /**
     * 产品名称
     */
    private String productname;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 商品类型Id
     */
    private Integer categoryid;

    /**
     * 产品单位，碗，份等
     */
    private String productunit;

    /**
     * 商品描述
     */
    private String productdesc;

    /**
     * 产品参数
     */
    private String productparm;

    /**
     * 上架状态，1：上架，0，下架
     */
    private Integer productstatus;

    /**
     * 排序值（倒序）
     */
    private Integer sortvalue;

    /**
     * 是否启用折扣显示，1：启用，0不启用
     */
    private Integer showdiscountprice;

    /**
     * 折扣前价格
     */
    private BigDecimal rawprice;

    /**
     * 销售价
     */
    private BigDecimal price;

    /**
     * 销售量
     */
    private Integer salesvolume;

    /**
     * 客人喜欢量
     */
    private Integer likesvolume;

    /**
     * 是否售罄，0否1是
     */
    private Integer issoldout;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 产品封面
     */
    private String cover;

    /**
     * 产品封面大图
     */
    private String coverbig;

    /**
     * 创建时间
     */
    private Date datachangeCreatetime;

    /**
     * 最后修改时间
     */
    private Date datachangeLasttime;

    /**
     * 0 非预售 1 预售
     */
    private Integer presale;

    /**
     * 搜索标签，用逗号分隔
     */
    private String searchtag;

    /**
     * 热门标签，用逗号分隔
     */
    private String hottag;

    /**
     * 主推视频ID
     */
    private Integer videoid;

    /**
     * 主推直播ID
     */
    private Integer liid;

    private static final long serialVersionUID = 1L;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getProductunit() {
        return productunit;
    }

    public void setProductunit(String productunit) {
        this.productunit = productunit;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public String getProductparm() {
        return productparm;
    }

    public void setProductparm(String productparm) {
        this.productparm = productparm;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    public Integer getSortvalue() {
        return sortvalue;
    }

    public void setSortvalue(Integer sortvalue) {
        this.sortvalue = sortvalue;
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

    public Integer getSalesvolume() {
        return salesvolume;
    }

    public void setSalesvolume(Integer salesvolume) {
        this.salesvolume = salesvolume;
    }

    public Integer getLikesvolume() {
        return likesvolume;
    }

    public void setLikesvolume(Integer likesvolume) {
        this.likesvolume = likesvolume;
    }

    public Integer getIssoldout() {
        return issoldout;
    }

    public void setIssoldout(Integer issoldout) {
        this.issoldout = issoldout;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCoverbig() {
        return coverbig;
    }

    public void setCoverbig(String coverbig) {
        this.coverbig = coverbig;
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

    public Integer getPresale() {
        return presale;
    }

    public void setPresale(Integer presale) {
        this.presale = presale;
    }

    public String getSearchtag() {
        return searchtag;
    }

    public void setSearchtag(String searchtag) {
        this.searchtag = searchtag;
    }

    public String getHottag() {
        return hottag;
    }

    public void setHottag(String hottag) {
        this.hottag = hottag;
    }

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public Integer getLiid() {
        return liid;
    }

    public void setLiid(Integer liid) {
        this.liid = liid;
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
        Product other = (Product) that;
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
            && (this.getLiid() == null ? other.getLiid() == null : this.getLiid().equals(other.getLiid()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", userid=").append(userid);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", productunit=").append(productunit);
        sb.append(", productdesc=").append(productdesc);
        sb.append(", productparm=").append(productparm);
        sb.append(", productstatus=").append(productstatus);
        sb.append(", sortvalue=").append(sortvalue);
        sb.append(", showdiscountprice=").append(showdiscountprice);
        sb.append(", rawprice=").append(rawprice);
        sb.append(", price=").append(price);
        sb.append(", salesvolume=").append(salesvolume);
        sb.append(", likesvolume=").append(likesvolume);
        sb.append(", issoldout=").append(issoldout);
        sb.append(", stock=").append(stock);
        sb.append(", cover=").append(cover);
        sb.append(", coverbig=").append(coverbig);
        sb.append(", datachangeCreatetime=").append(datachangeCreatetime);
        sb.append(", datachangeLasttime=").append(datachangeLasttime);
        sb.append(", presale=").append(presale);
        sb.append(", searchtag=").append(searchtag);
        sb.append(", hottag=").append(hottag);
        sb.append(", videoid=").append(videoid);
        sb.append(", liid=").append(liid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}