package com.jmall.service;

import com.github.pagehelper.PageInfo;
import com.jmall.common.ServerResponse;
import com.jmall.pojo.Shipping;

/**
 * @author jackie
 * @date 2018/9/9 0:03
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId, Integer shippingId);

    ServerResponse update (Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
