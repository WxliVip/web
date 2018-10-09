package wxli.vip.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProductSpecExample() {
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

        public Criteria andSpecidIsNull() {
            addCriterion("SpecId is null");
            return (Criteria) this;
        }

        public Criteria andSpecidIsNotNull() {
            addCriterion("SpecId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecidEqualTo(Integer value) {
            addCriterion("SpecId =", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotEqualTo(Integer value) {
            addCriterion("SpecId <>", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidGreaterThan(Integer value) {
            addCriterion("SpecId >", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SpecId >=", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidLessThan(Integer value) {
            addCriterion("SpecId <", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidLessThanOrEqualTo(Integer value) {
            addCriterion("SpecId <=", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidIn(List<Integer> values) {
            addCriterion("SpecId in", values, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotIn(List<Integer> values) {
            addCriterion("SpecId not in", values, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidBetween(Integer value1, Integer value2) {
            addCriterion("SpecId between", value1, value2, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotBetween(Integer value1, Integer value2) {
            addCriterion("SpecId not between", value1, value2, "specid");
            return (Criteria) this;
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

        public Criteria andShorttitleIsNull() {
            addCriterion("ShortTitle is null");
            return (Criteria) this;
        }

        public Criteria andShorttitleIsNotNull() {
            addCriterion("ShortTitle is not null");
            return (Criteria) this;
        }

        public Criteria andShorttitleEqualTo(String value) {
            addCriterion("ShortTitle =", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotEqualTo(String value) {
            addCriterion("ShortTitle <>", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleGreaterThan(String value) {
            addCriterion("ShortTitle >", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleGreaterThanOrEqualTo(String value) {
            addCriterion("ShortTitle >=", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleLessThan(String value) {
            addCriterion("ShortTitle <", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleLessThanOrEqualTo(String value) {
            addCriterion("ShortTitle <=", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleLike(String value) {
            addCriterion("ShortTitle like", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotLike(String value) {
            addCriterion("ShortTitle not like", value, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleIn(List<String> values) {
            addCriterion("ShortTitle in", values, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotIn(List<String> values) {
            addCriterion("ShortTitle not in", values, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleBetween(String value1, String value2) {
            addCriterion("ShortTitle between", value1, value2, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andShorttitleNotBetween(String value1, String value2) {
            addCriterion("ShortTitle not between", value1, value2, "shorttitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleIsNull() {
            addCriterion("LongTitle is null");
            return (Criteria) this;
        }

        public Criteria andLongtitleIsNotNull() {
            addCriterion("LongTitle is not null");
            return (Criteria) this;
        }

        public Criteria andLongtitleEqualTo(String value) {
            addCriterion("LongTitle =", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleNotEqualTo(String value) {
            addCriterion("LongTitle <>", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleGreaterThan(String value) {
            addCriterion("LongTitle >", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleGreaterThanOrEqualTo(String value) {
            addCriterion("LongTitle >=", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleLessThan(String value) {
            addCriterion("LongTitle <", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleLessThanOrEqualTo(String value) {
            addCriterion("LongTitle <=", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleLike(String value) {
            addCriterion("LongTitle like", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleNotLike(String value) {
            addCriterion("LongTitle not like", value, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleIn(List<String> values) {
            addCriterion("LongTitle in", values, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleNotIn(List<String> values) {
            addCriterion("LongTitle not in", values, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleBetween(String value1, String value2) {
            addCriterion("LongTitle between", value1, value2, "longtitle");
            return (Criteria) this;
        }

        public Criteria andLongtitleNotBetween(String value1, String value2) {
            addCriterion("LongTitle not between", value1, value2, "longtitle");
            return (Criteria) this;
        }

        public Criteria andSpecunitIsNull() {
            addCriterion("SpecUnit is null");
            return (Criteria) this;
        }

        public Criteria andSpecunitIsNotNull() {
            addCriterion("SpecUnit is not null");
            return (Criteria) this;
        }

        public Criteria andSpecunitEqualTo(String value) {
            addCriterion("SpecUnit =", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitNotEqualTo(String value) {
            addCriterion("SpecUnit <>", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitGreaterThan(String value) {
            addCriterion("SpecUnit >", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitGreaterThanOrEqualTo(String value) {
            addCriterion("SpecUnit >=", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitLessThan(String value) {
            addCriterion("SpecUnit <", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitLessThanOrEqualTo(String value) {
            addCriterion("SpecUnit <=", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitLike(String value) {
            addCriterion("SpecUnit like", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitNotLike(String value) {
            addCriterion("SpecUnit not like", value, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitIn(List<String> values) {
            addCriterion("SpecUnit in", values, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitNotIn(List<String> values) {
            addCriterion("SpecUnit not in", values, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitBetween(String value1, String value2) {
            addCriterion("SpecUnit between", value1, value2, "specunit");
            return (Criteria) this;
        }

        public Criteria andSpecunitNotBetween(String value1, String value2) {
            addCriterion("SpecUnit not between", value1, value2, "specunit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
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

        public Criteria andTagnameIsNull() {
            addCriterion("TagName is null");
            return (Criteria) this;
        }

        public Criteria andTagnameIsNotNull() {
            addCriterion("TagName is not null");
            return (Criteria) this;
        }

        public Criteria andTagnameEqualTo(String value) {
            addCriterion("TagName =", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameNotEqualTo(String value) {
            addCriterion("TagName <>", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameGreaterThan(String value) {
            addCriterion("TagName >", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameGreaterThanOrEqualTo(String value) {
            addCriterion("TagName >=", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameLessThan(String value) {
            addCriterion("TagName <", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameLessThanOrEqualTo(String value) {
            addCriterion("TagName <=", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameLike(String value) {
            addCriterion("TagName like", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameNotLike(String value) {
            addCriterion("TagName not like", value, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameIn(List<String> values) {
            addCriterion("TagName in", values, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameNotIn(List<String> values) {
            addCriterion("TagName not in", values, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameBetween(String value1, String value2) {
            addCriterion("TagName between", value1, value2, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagnameNotBetween(String value1, String value2) {
            addCriterion("TagName not between", value1, value2, "tagname");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("Tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("Tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Integer value) {
            addCriterion("Tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Integer value) {
            addCriterion("Tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Integer value) {
            addCriterion("Tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Integer value) {
            addCriterion("Tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Integer value) {
            addCriterion("Tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Integer> values) {
            addCriterion("Tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Integer> values) {
            addCriterion("Tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Integer value1, Integer value2) {
            addCriterion("Tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Integer value1, Integer value2) {
            addCriterion("Tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("SubTitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("SubTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("SubTitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("SubTitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("SubTitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("SubTitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("SubTitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("SubTitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("SubTitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("SubTitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("SubTitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("SubTitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("SubTitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("SubTitle not between", value1, value2, "subtitle");
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