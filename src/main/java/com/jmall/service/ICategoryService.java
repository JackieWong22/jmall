package com.jmall.service;


import com.jmall.common.ServerResponse;
import com.jmall.pojo.Category;

import java.util.List;


/**
 * @author jackie
 * @date 2018/8/6 23:45
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
