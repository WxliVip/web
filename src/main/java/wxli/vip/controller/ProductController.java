package wxli.vip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wxli.vip.dao.ProductMapper;
import wxli.vip.entity.Product;
import wxli.vip.entity.ProductExample;

import java.util.List;

@RestController
@RequestMapping("/v3/product")
public class ProductController {
    @Autowired
    ProductMapper productMapper;
    @GetMapping("/detail/{id}")
    public Product detail(@PathVariable int id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/list")
    public List<Product> list() {
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        criteria.andProductstatusEqualTo(1);
        return productMapper.selectByExample(example);
    }
}
