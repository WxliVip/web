package wxli.vip.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductidIsNull() {
            addCriterion("ProductId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("CategoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("CategoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("CategoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CategoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("CategoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("CategoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("CategoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("CategoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andProductunitIsNull() {
            addCriterion("ProductUnit is null");
            return (Criteria) this;
        }

        public Criteria andProductunitIsNotNull() {
            addCriterion("ProductUnit is not null");
            return (Criteria) this;
        }

        public Criteria andProductunitEqualTo(String value) {
            addCriterion("ProductUnit =", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotEqualTo(String value) {
            addCriterion("ProductUnit <>", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitGreaterThan(String value) {
            addCriterion("ProductUnit >", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitGreaterThanOrEqualTo(String value) {
            addCriterion("ProductUnit >=", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitLessThan(String value) {
            addCriterion("ProductUnit <", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitLessThanOrEqualTo(String value) {
            addCriterion("ProductUnit <=", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitLike(String value) {
            addCriterion("ProductUnit like", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotLike(String value) {
            addCriterion("ProductUnit not like", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitIn(List<String> values) {
            addCriterion("ProductUnit in", values, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotIn(List<String> values) {
            addCriterion("ProductUnit not in", values, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitBetween(String value1, String value2) {
            addCriterion("ProductUnit between", value1, value2, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotBetween(String value1, String value2) {
            addCriterion("ProductUnit not between", value1, value2, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNull() {
            addCriterion("ProductDesc is null");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNotNull() {
            addCriterion("ProductDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProductdescEqualTo(String value) {
            addCriterion("ProductDesc =", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotEqualTo(String value) {
            addCriterion("ProductDesc <>", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThan(String value) {
            addCriterion("ProductDesc >", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThanOrEqualTo(String value) {
            addCriterion("ProductDesc >=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThan(String value) {
            addCriterion("ProductDesc <", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThanOrEqualTo(String value) {
            addCriterion("ProductDesc <=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLike(String value) {
            addCriterion("ProductDesc like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotLike(String value) {
            addCriterion("ProductDesc not like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescIn(List<String> values) {
            addCriterion("ProductDesc in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotIn(List<String> values) {
            addCriterion("ProductDesc not in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescBetween(String value1, String value2) {
            addCriterion("ProductDesc between", value1, value2, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotBetween(String value1, String value2) {
            addCriterion("ProductDesc not between", value1, value2, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductparmIsNull() {
            addCriterion("ProductParm is null");
            return (Criteria) this;
        }

        public Criteria andProductparmIsNotNull() {
            addCriterion("ProductParm is not null");
            return (Criteria) this;
        }

        public Criteria andProductparmEqualTo(String value) {
            addCriterion("ProductParm =", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmNotEqualTo(String value) {
            addCriterion("ProductParm <>", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmGreaterThan(String value) {
            addCriterion("ProductParm >", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmGreaterThanOrEqualTo(String value) {
            addCriterion("ProductParm >=", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmLessThan(String value) {
            addCriterion("ProductParm <", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmLessThanOrEqualTo(String value) {
            addCriterion("ProductParm <=", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmLike(String value) {
            addCriterion("ProductParm like", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmNotLike(String value) {
            addCriterion("ProductParm not like", value, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmIn(List<String> values) {
            addCriterion("ProductParm in", values, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmNotIn(List<String> values) {
            addCriterion("ProductParm not in", values, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmBetween(String value1, String value2) {
            addCriterion("ProductParm between", value1, value2, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductparmNotBetween(String value1, String value2) {
            addCriterion("ProductParm not between", value1, value2, "productparm");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNull() {
            addCriterion("ProductStatus is null");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNotNull() {
            addCriterion("ProductStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProductstatusEqualTo(Integer value) {
            addCriterion("ProductStatus =", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotEqualTo(Integer value) {
            addCriterion("ProductStatus <>", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThan(Integer value) {
            addCriterion("ProductStatus >", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductStatus >=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThan(Integer value) {
            addCriterion("ProductStatus <", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ProductStatus <=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusIn(List<Integer> values) {
            addCriterion("ProductStatus in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotIn(List<Integer> values) {
            addCriterion("ProductStatus not in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusBetween(Integer value1, Integer value2) {
            addCriterion("ProductStatus between", value1, value2, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductStatus not between", value1, value2, "productstatus");
            return (Criteria) this;
        }

        public Criteria andSortvalueIsNull() {
            addCriterion("SortValue is null");
            return (Criteria) this;
        }

        public Criteria andSortvalueIsNotNull() {
            addCriterion("SortValue is not null");
            return (Criteria) this;
        }

        public Criteria andSortvalueEqualTo(Integer value) {
            addCriterion("SortValue =", value, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueNotEqualTo(Integer value) {
            addCriterion("SortValue <>", value, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueGreaterThan(Integer value) {
            addCriterion("SortValue >", value, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("SortValue >=", value, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueLessThan(Integer value) {
            addCriterion("SortValue <", value, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueLessThanOrEqualTo(Integer value) {
            addCriterion("SortValue <=", value, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueIn(List<Integer> values) {
            addCriterion("SortValue in", values, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueNotIn(List<Integer> values) {
            addCriterion("SortValue not in", values, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueBetween(Integer value1, Integer value2) {
            addCriterion("SortValue between", value1, value2, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andSortvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("SortValue not between", value1, value2, "sortvalue");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceIsNull() {
            addCriterion("ShowDiscountPrice is null");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceIsNotNull() {
            addCriterion("ShowDiscountPrice is not null");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceEqualTo(Integer value) {
            addCriterion("ShowDiscountPrice =", value, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceNotEqualTo(Integer value) {
            addCriterion("ShowDiscountPrice <>", value, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceGreaterThan(Integer value) {
            addCriterion("ShowDiscountPrice >", value, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShowDiscountPrice >=", value, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceLessThan(Integer value) {
            addCriterion("ShowDiscountPrice <", value, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceLessThanOrEqualTo(Integer value) {
            addCriterion("ShowDiscountPrice <=", value, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceIn(List<Integer> values) {
            addCriterion("ShowDiscountPrice in", values, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceNotIn(List<Integer> values) {
            addCriterion("ShowDiscountPrice not in", values, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceBetween(Integer value1, Integer value2) {
            addCriterion("ShowDiscountPrice between", value1, value2, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andShowdiscountpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ShowDiscountPrice not between", value1, value2, "showdiscountprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceIsNull() {
            addCriterion("RawPrice is null");
            return (Criteria) this;
        }

        public Criteria andRawpriceIsNotNull() {
            addCriterion("RawPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRawpriceEqualTo(BigDecimal value) {
            addCriterion("RawPrice =", value, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceNotEqualTo(BigDecimal value) {
            addCriterion("RawPrice <>", value, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceGreaterThan(BigDecimal value) {
            addCriterion("RawPrice >", value, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RawPrice >=", value, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceLessThan(BigDecimal value) {
            addCriterion("RawPrice <", value, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RawPrice <=", value, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceIn(List<BigDecimal> values) {
            addCriterion("RawPrice in", values, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceNotIn(List<BigDecimal> values) {
            addCriterion("RawPrice not in", values, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RawPrice between", value1, value2, "rawprice");
            return (Criteria) this;
        }

        public Criteria andRawpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RawPrice not between", value1, value2, "rawprice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNull() {
            addCriterion("SalesVolume is null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNotNull() {
            addCriterion("SalesVolume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeEqualTo(Integer value) {
            addCriterion("SalesVolume =", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotEqualTo(Integer value) {
            addCriterion("SalesVolume <>", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThan(Integer value) {
            addCriterion("SalesVolume >", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesVolume >=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThan(Integer value) {
            addCriterion("SalesVolume <", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("SalesVolume <=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIn(List<Integer> values) {
            addCriterion("SalesVolume in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotIn(List<Integer> values) {
            addCriterion("SalesVolume not in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeBetween(Integer value1, Integer value2) {
            addCriterion("SalesVolume between", value1, value2, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesVolume not between", value1, value2, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeIsNull() {
            addCriterion("LikesVolume is null");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeIsNotNull() {
            addCriterion("LikesVolume is not null");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeEqualTo(Integer value) {
            addCriterion("LikesVolume =", value, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeNotEqualTo(Integer value) {
            addCriterion("LikesVolume <>", value, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeGreaterThan(Integer value) {
            addCriterion("LikesVolume >", value, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LikesVolume >=", value, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeLessThan(Integer value) {
            addCriterion("LikesVolume <", value, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("LikesVolume <=", value, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeIn(List<Integer> values) {
            addCriterion("LikesVolume in", values, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeNotIn(List<Integer> values) {
            addCriterion("LikesVolume not in", values, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeBetween(Integer value1, Integer value2) {
            addCriterion("LikesVolume between", value1, value2, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andLikesvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("LikesVolume not between", value1, value2, "likesvolume");
            return (Criteria) this;
        }

        public Criteria andIssoldoutIsNull() {
            addCriterion("IsSoldOut is null");
            return (Criteria) this;
        }

        public Criteria andIssoldoutIsNotNull() {
            addCriterion("IsSoldOut is not null");
            return (Criteria) this;
        }

        public Criteria andIssoldoutEqualTo(Integer value) {
            addCriterion("IsSoldOut =", value, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutNotEqualTo(Integer value) {
            addCriterion("IsSoldOut <>", value, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutGreaterThan(Integer value) {
            addCriterion("IsSoldOut >", value, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSoldOut >=", value, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutLessThan(Integer value) {
            addCriterion("IsSoldOut <", value, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutLessThanOrEqualTo(Integer value) {
            addCriterion("IsSoldOut <=", value, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutIn(List<Integer> values) {
            addCriterion("IsSoldOut in", values, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutNotIn(List<Integer> values) {
            addCriterion("IsSoldOut not in", values, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutBetween(Integer value1, Integer value2) {
            addCriterion("IsSoldOut between", value1, value2, "issoldout");
            return (Criteria) this;
        }

        public Criteria andIssoldoutNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSoldOut not between", value1, value2, "issoldout");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("Stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("Stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("Stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("Stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("Stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("Stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("Stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("Stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("Stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("Stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("Stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("Cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("Cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("Cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("Cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("Cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("Cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("Cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("Cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("Cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("Cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("Cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("Cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("Cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("Cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverbigIsNull() {
            addCriterion("CoverBig is null");
            return (Criteria) this;
        }

        public Criteria andCoverbigIsNotNull() {
            addCriterion("CoverBig is not null");
            return (Criteria) this;
        }

        public Criteria andCoverbigEqualTo(String value) {
            addCriterion("CoverBig =", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigNotEqualTo(String value) {
            addCriterion("CoverBig <>", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigGreaterThan(String value) {
            addCriterion("CoverBig >", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigGreaterThanOrEqualTo(String value) {
            addCriterion("CoverBig >=", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigLessThan(String value) {
            addCriterion("CoverBig <", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigLessThanOrEqualTo(String value) {
            addCriterion("CoverBig <=", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigLike(String value) {
            addCriterion("CoverBig like", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigNotLike(String value) {
            addCriterion("CoverBig not like", value, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigIn(List<String> values) {
            addCriterion("CoverBig in", values, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigNotIn(List<String> values) {
            addCriterion("CoverBig not in", values, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigBetween(String value1, String value2) {
            addCriterion("CoverBig between", value1, value2, "coverbig");
            return (Criteria) this;
        }

        public Criteria andCoverbigNotBetween(String value1, String value2) {
            addCriterion("CoverBig not between", value1, value2, "coverbig");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeIsNull() {
            addCriterion("DataChange_CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeIsNotNull() {
            addCriterion("DataChange_CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeEqualTo(Date value) {
            addCriterion("DataChange_CreateTime =", value, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeNotEqualTo(Date value) {
            addCriterion("DataChange_CreateTime <>", value, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeGreaterThan(Date value) {
            addCriterion("DataChange_CreateTime >", value, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DataChange_CreateTime >=", value, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeLessThan(Date value) {
            addCriterion("DataChange_CreateTime <", value, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DataChange_CreateTime <=", value, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeIn(List<Date> values) {
            addCriterion("DataChange_CreateTime in", values, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeNotIn(List<Date> values) {
            addCriterion("DataChange_CreateTime not in", values, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("DataChange_CreateTime between", value1, value2, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DataChange_CreateTime not between", value1, value2, "datachangeCreatetime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIsNull() {
            addCriterion("DataChange_LastTime is null");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIsNotNull() {
            addCriterion("DataChange_LastTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeEqualTo(Date value) {
            addCriterion("DataChange_LastTime =", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotEqualTo(Date value) {
            addCriterion("DataChange_LastTime <>", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeGreaterThan(Date value) {
            addCriterion("DataChange_LastTime >", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DataChange_LastTime >=", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeLessThan(Date value) {
            addCriterion("DataChange_LastTime <", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("DataChange_LastTime <=", value, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeIn(List<Date> values) {
            addCriterion("DataChange_LastTime in", values, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotIn(List<Date> values) {
            addCriterion("DataChange_LastTime not in", values, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeBetween(Date value1, Date value2) {
            addCriterion("DataChange_LastTime between", value1, value2, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andDatachangeLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("DataChange_LastTime not between", value1, value2, "datachangeLasttime");
            return (Criteria) this;
        }

        public Criteria andPresaleIsNull() {
            addCriterion("PreSale is null");
            return (Criteria) this;
        }

        public Criteria andPresaleIsNotNull() {
            addCriterion("PreSale is not null");
            return (Criteria) this;
        }

        public Criteria andPresaleEqualTo(Integer value) {
            addCriterion("PreSale =", value, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleNotEqualTo(Integer value) {
            addCriterion("PreSale <>", value, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleGreaterThan(Integer value) {
            addCriterion("PreSale >", value, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("PreSale >=", value, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleLessThan(Integer value) {
            addCriterion("PreSale <", value, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleLessThanOrEqualTo(Integer value) {
            addCriterion("PreSale <=", value, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleIn(List<Integer> values) {
            addCriterion("PreSale in", values, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleNotIn(List<Integer> values) {
            addCriterion("PreSale not in", values, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleBetween(Integer value1, Integer value2) {
            addCriterion("PreSale between", value1, value2, "presale");
            return (Criteria) this;
        }

        public Criteria andPresaleNotBetween(Integer value1, Integer value2) {
            addCriterion("PreSale not between", value1, value2, "presale");
            return (Criteria) this;
        }

        public Criteria andSearchtagIsNull() {
            addCriterion("SearchTag is null");
            return (Criteria) this;
        }

        public Criteria andSearchtagIsNotNull() {
            addCriterion("SearchTag is not null");
            return (Criteria) this;
        }

        public Criteria andSearchtagEqualTo(String value) {
            addCriterion("SearchTag =", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagNotEqualTo(String value) {
            addCriterion("SearchTag <>", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagGreaterThan(String value) {
            addCriterion("SearchTag >", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagGreaterThanOrEqualTo(String value) {
            addCriterion("SearchTag >=", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagLessThan(String value) {
            addCriterion("SearchTag <", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagLessThanOrEqualTo(String value) {
            addCriterion("SearchTag <=", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagLike(String value) {
            addCriterion("SearchTag like", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagNotLike(String value) {
            addCriterion("SearchTag not like", value, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagIn(List<String> values) {
            addCriterion("SearchTag in", values, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagNotIn(List<String> values) {
            addCriterion("SearchTag not in", values, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagBetween(String value1, String value2) {
            addCriterion("SearchTag between", value1, value2, "searchtag");
            return (Criteria) this;
        }

        public Criteria andSearchtagNotBetween(String value1, String value2) {
            addCriterion("SearchTag not between", value1, value2, "searchtag");
            return (Criteria) this;
        }

        public Criteria andHottagIsNull() {
            addCriterion("HotTag is null");
            return (Criteria) this;
        }

        public Criteria andHottagIsNotNull() {
            addCriterion("HotTag is not null");
            return (Criteria) this;
        }

        public Criteria andHottagEqualTo(String value) {
            addCriterion("HotTag =", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagNotEqualTo(String value) {
            addCriterion("HotTag <>", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagGreaterThan(String value) {
            addCriterion("HotTag >", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagGreaterThanOrEqualTo(String value) {
            addCriterion("HotTag >=", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagLessThan(String value) {
            addCriterion("HotTag <", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagLessThanOrEqualTo(String value) {
            addCriterion("HotTag <=", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagLike(String value) {
            addCriterion("HotTag like", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagNotLike(String value) {
            addCriterion("HotTag not like", value, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagIn(List<String> values) {
            addCriterion("HotTag in", values, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagNotIn(List<String> values) {
            addCriterion("HotTag not in", values, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagBetween(String value1, String value2) {
            addCriterion("HotTag between", value1, value2, "hottag");
            return (Criteria) this;
        }

        public Criteria andHottagNotBetween(String value1, String value2) {
            addCriterion("HotTag not between", value1, value2, "hottag");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNull() {
            addCriterion("VideoId is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("VideoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(Integer value) {
            addCriterion("VideoId =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(Integer value) {
            addCriterion("VideoId <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(Integer value) {
            addCriterion("VideoId >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VideoId >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(Integer value) {
            addCriterion("VideoId <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(Integer value) {
            addCriterion("VideoId <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<Integer> values) {
            addCriterion("VideoId in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<Integer> values) {
            addCriterion("VideoId not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(Integer value1, Integer value2) {
            addCriterion("VideoId between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("VideoId not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andLiidIsNull() {
            addCriterion("LiId is null");
            return (Criteria) this;
        }

        public Criteria andLiidIsNotNull() {
            addCriterion("LiId is not null");
            return (Criteria) this;
        }

        public Criteria andLiidEqualTo(Integer value) {
            addCriterion("LiId =", value, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidNotEqualTo(Integer value) {
            addCriterion("LiId <>", value, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidGreaterThan(Integer value) {
            addCriterion("LiId >", value, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LiId >=", value, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidLessThan(Integer value) {
            addCriterion("LiId <", value, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidLessThanOrEqualTo(Integer value) {
            addCriterion("LiId <=", value, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidIn(List<Integer> values) {
            addCriterion("LiId in", values, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidNotIn(List<Integer> values) {
            addCriterion("LiId not in", values, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidBetween(Integer value1, Integer value2) {
            addCriterion("LiId between", value1, value2, "liid");
            return (Criteria) this;
        }

        public Criteria andLiidNotBetween(Integer value1, Integer value2) {
            addCriterion("LiId not between", value1, value2, "liid");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}