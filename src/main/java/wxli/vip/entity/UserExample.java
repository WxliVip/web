package wxli.vip.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("Avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("Avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("Avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("Avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("Avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("Avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("Avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("Avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("Avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("Avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("Avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("Avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("Avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("Avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("Nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("Nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("Nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("Nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("Nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("Nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("Nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("Nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("Nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("Nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("Nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("Nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("Nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("Nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("Introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("Introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("Introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("Introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("Introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("Introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("Introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("Introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("Introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("Introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("Introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("Introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("Introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("Introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("Sex not between", value1, value2, "sex");
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

        public Criteria andAreaidIsNull() {
            addCriterion("AreaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AreaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("AreaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("AreaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("AreaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("AreaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("AreaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("AreaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("AreaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("AreaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("AreaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionIsNull() {
            addCriterion("ShortDescription is null");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionIsNotNull() {
            addCriterion("ShortDescription is not null");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionEqualTo(String value) {
            addCriterion("ShortDescription =", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotEqualTo(String value) {
            addCriterion("ShortDescription <>", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionGreaterThan(String value) {
            addCriterion("ShortDescription >", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ShortDescription >=", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionLessThan(String value) {
            addCriterion("ShortDescription <", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionLessThanOrEqualTo(String value) {
            addCriterion("ShortDescription <=", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionLike(String value) {
            addCriterion("ShortDescription like", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotLike(String value) {
            addCriterion("ShortDescription not like", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionIn(List<String> values) {
            addCriterion("ShortDescription in", values, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotIn(List<String> values) {
            addCriterion("ShortDescription not in", values, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionBetween(String value1, String value2) {
            addCriterion("ShortDescription between", value1, value2, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotBetween(String value1, String value2) {
            addCriterion("ShortDescription not between", value1, value2, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("UserType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("UserType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("UserType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("UserType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("UserType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("UserType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("UserType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("UserType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("UserType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("UserType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("UserType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("Token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("Token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("Token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("Token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("Token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("Token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("Token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("Token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("Token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("Token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("Token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("Token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("Token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("Token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andFromsourceIsNull() {
            addCriterion("FromSource is null");
            return (Criteria) this;
        }

        public Criteria andFromsourceIsNotNull() {
            addCriterion("FromSource is not null");
            return (Criteria) this;
        }

        public Criteria andFromsourceEqualTo(Integer value) {
            addCriterion("FromSource =", value, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceNotEqualTo(Integer value) {
            addCriterion("FromSource <>", value, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceGreaterThan(Integer value) {
            addCriterion("FromSource >", value, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("FromSource >=", value, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceLessThan(Integer value) {
            addCriterion("FromSource <", value, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceLessThanOrEqualTo(Integer value) {
            addCriterion("FromSource <=", value, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceIn(List<Integer> values) {
            addCriterion("FromSource in", values, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceNotIn(List<Integer> values) {
            addCriterion("FromSource not in", values, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceBetween(Integer value1, Integer value2) {
            addCriterion("FromSource between", value1, value2, "fromsource");
            return (Criteria) this;
        }

        public Criteria andFromsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("FromSource not between", value1, value2, "fromsource");
            return (Criteria) this;
        }

        public Criteria andLivepowerIsNull() {
            addCriterion("LivePower is null");
            return (Criteria) this;
        }

        public Criteria andLivepowerIsNotNull() {
            addCriterion("LivePower is not null");
            return (Criteria) this;
        }

        public Criteria andLivepowerEqualTo(Integer value) {
            addCriterion("LivePower =", value, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerNotEqualTo(Integer value) {
            addCriterion("LivePower <>", value, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerGreaterThan(Integer value) {
            addCriterion("LivePower >", value, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("LivePower >=", value, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerLessThan(Integer value) {
            addCriterion("LivePower <", value, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerLessThanOrEqualTo(Integer value) {
            addCriterion("LivePower <=", value, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerIn(List<Integer> values) {
            addCriterion("LivePower in", values, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerNotIn(List<Integer> values) {
            addCriterion("LivePower not in", values, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerBetween(Integer value1, Integer value2) {
            addCriterion("LivePower between", value1, value2, "livepower");
            return (Criteria) this;
        }

        public Criteria andLivepowerNotBetween(Integer value1, Integer value2) {
            addCriterion("LivePower not between", value1, value2, "livepower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerIsNull() {
            addCriterion("RecordingPower is null");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerIsNotNull() {
            addCriterion("RecordingPower is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerEqualTo(Integer value) {
            addCriterion("RecordingPower =", value, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerNotEqualTo(Integer value) {
            addCriterion("RecordingPower <>", value, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerGreaterThan(Integer value) {
            addCriterion("RecordingPower >", value, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("RecordingPower >=", value, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerLessThan(Integer value) {
            addCriterion("RecordingPower <", value, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerLessThanOrEqualTo(Integer value) {
            addCriterion("RecordingPower <=", value, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerIn(List<Integer> values) {
            addCriterion("RecordingPower in", values, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerNotIn(List<Integer> values) {
            addCriterion("RecordingPower not in", values, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerBetween(Integer value1, Integer value2) {
            addCriterion("RecordingPower between", value1, value2, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andRecordingpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("RecordingPower not between", value1, value2, "recordingpower");
            return (Criteria) this;
        }

        public Criteria andMomentauditIsNull() {
            addCriterion("MomentAudit is null");
            return (Criteria) this;
        }

        public Criteria andMomentauditIsNotNull() {
            addCriterion("MomentAudit is not null");
            return (Criteria) this;
        }

        public Criteria andMomentauditEqualTo(Integer value) {
            addCriterion("MomentAudit =", value, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditNotEqualTo(Integer value) {
            addCriterion("MomentAudit <>", value, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditGreaterThan(Integer value) {
            addCriterion("MomentAudit >", value, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditGreaterThanOrEqualTo(Integer value) {
            addCriterion("MomentAudit >=", value, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditLessThan(Integer value) {
            addCriterion("MomentAudit <", value, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditLessThanOrEqualTo(Integer value) {
            addCriterion("MomentAudit <=", value, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditIn(List<Integer> values) {
            addCriterion("MomentAudit in", values, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditNotIn(List<Integer> values) {
            addCriterion("MomentAudit not in", values, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditBetween(Integer value1, Integer value2) {
            addCriterion("MomentAudit between", value1, value2, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andMomentauditNotBetween(Integer value1, Integer value2) {
            addCriterion("MomentAudit not between", value1, value2, "momentaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditIsNull() {
            addCriterion("LiveAudit is null");
            return (Criteria) this;
        }

        public Criteria andLiveauditIsNotNull() {
            addCriterion("LiveAudit is not null");
            return (Criteria) this;
        }

        public Criteria andLiveauditEqualTo(Integer value) {
            addCriterion("LiveAudit =", value, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditNotEqualTo(Integer value) {
            addCriterion("LiveAudit <>", value, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditGreaterThan(Integer value) {
            addCriterion("LiveAudit >", value, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditGreaterThanOrEqualTo(Integer value) {
            addCriterion("LiveAudit >=", value, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditLessThan(Integer value) {
            addCriterion("LiveAudit <", value, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditLessThanOrEqualTo(Integer value) {
            addCriterion("LiveAudit <=", value, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditIn(List<Integer> values) {
            addCriterion("LiveAudit in", values, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditNotIn(List<Integer> values) {
            addCriterion("LiveAudit not in", values, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditBetween(Integer value1, Integer value2) {
            addCriterion("LiveAudit between", value1, value2, "liveaudit");
            return (Criteria) this;
        }

        public Criteria andLiveauditNotBetween(Integer value1, Integer value2) {
            addCriterion("LiveAudit not between", value1, value2, "liveaudit");
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

        public Criteria andAreaimgIsNull() {
            addCriterion("AreaImg is null");
            return (Criteria) this;
        }

        public Criteria andAreaimgIsNotNull() {
            addCriterion("AreaImg is not null");
            return (Criteria) this;
        }

        public Criteria andAreaimgEqualTo(String value) {
            addCriterion("AreaImg =", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgNotEqualTo(String value) {
            addCriterion("AreaImg <>", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgGreaterThan(String value) {
            addCriterion("AreaImg >", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgGreaterThanOrEqualTo(String value) {
            addCriterion("AreaImg >=", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgLessThan(String value) {
            addCriterion("AreaImg <", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgLessThanOrEqualTo(String value) {
            addCriterion("AreaImg <=", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgLike(String value) {
            addCriterion("AreaImg like", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgNotLike(String value) {
            addCriterion("AreaImg not like", value, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgIn(List<String> values) {
            addCriterion("AreaImg in", values, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgNotIn(List<String> values) {
            addCriterion("AreaImg not in", values, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgBetween(String value1, String value2) {
            addCriterion("AreaImg between", value1, value2, "areaimg");
            return (Criteria) this;
        }

        public Criteria andAreaimgNotBetween(String value1, String value2) {
            addCriterion("AreaImg not between", value1, value2, "areaimg");
            return (Criteria) this;
        }

        public Criteria andOperflagIsNull() {
            addCriterion("OperFlag is null");
            return (Criteria) this;
        }

        public Criteria andOperflagIsNotNull() {
            addCriterion("OperFlag is not null");
            return (Criteria) this;
        }

        public Criteria andOperflagEqualTo(Integer value) {
            addCriterion("OperFlag =", value, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagNotEqualTo(Integer value) {
            addCriterion("OperFlag <>", value, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagGreaterThan(Integer value) {
            addCriterion("OperFlag >", value, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperFlag >=", value, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagLessThan(Integer value) {
            addCriterion("OperFlag <", value, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagLessThanOrEqualTo(Integer value) {
            addCriterion("OperFlag <=", value, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagIn(List<Integer> values) {
            addCriterion("OperFlag in", values, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagNotIn(List<Integer> values) {
            addCriterion("OperFlag not in", values, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagBetween(Integer value1, Integer value2) {
            addCriterion("OperFlag between", value1, value2, "operflag");
            return (Criteria) this;
        }

        public Criteria andOperflagNotBetween(Integer value1, Integer value2) {
            addCriterion("OperFlag not between", value1, value2, "operflag");
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