package wxli.vip.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductSpecKey implements Serializable {
    /**
     * 规格ID
     */
    private Integer specid;

    /**
     * 产品ID
     */
    private Integer productid;

    private static final long serialVersionUID = 1L;

    public Integer getSpecid() {
        return specid;
    }

    public void setSpecid(Integer specid) {
        this.specid = specid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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
        ProductSpecKey other = (ProductSpecKey) that;
        return (this.getSpecid() == null ? other.getSpecid() == null : this.getSpecid().equals(other.getSpecid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpecid() == null) ? 0 : getSpecid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specid=").append(specid);
        sb.append(", productid=").append(productid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}