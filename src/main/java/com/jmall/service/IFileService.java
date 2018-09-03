package com.jmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author jackie
 * @date 2018/8/15 22:52
 */
public interface IFileService {

    public String upload(MultipartFile file, String path);

}
