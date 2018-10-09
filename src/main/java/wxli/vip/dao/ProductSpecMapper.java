package wxli.vip.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wxli.vip.entity.ProductSpec;
import wxli.vip.entity.ProductSpecExample;
import wxli.vip.entity.ProductSpecKey;

public interface ProductSpecMapper {
    long countByExample(ProductSpecExample example);

    int deleteByExample(ProductSpecExample example);

    int deleteByPrimaryKey(ProductSpecKey key);

    int insert(ProductSpec record);

    int insertSelective(ProductSpec record);

    List<ProductSpec> selectByExample(ProductSpecExample example);

    ProductSpec selectByPrimaryKey(ProductSpecKey key);

    int updateByExampleSelective(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    int updateByExample(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    int updateByPrimaryKeySelective(ProductSpec record);

    int updateByPrimaryKey(ProductSpec record);
}