package com.jmall.service;

import com.jmall.common.ServerResponse;
import com.jmall.vo.CartVo;

/**
 * @author jackie
 * @date 2018/9/2 18:25
 */
public interface ICartService {

     ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

     ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

     ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);

     ServerResponse<CartVo> list(Integer userId);

     ServerResponse<CartVo> selectOrUnSelect(Integer userId,Integer productId,Integer checked);

     ServerResponse<Integer> getCartProductCount(Integer userId);
}
