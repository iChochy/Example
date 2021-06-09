/*
 * Copyright (c) 2021 iChochy
 * URL:https://ichochy.com
 * Date:2021/06/09 22:07:09
 */

package com.ichochy.example.upload.storage;


import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    /**
     * 初始化操作
     */
    void init();

    /**
     * 存储文件
     * @param file
     */
    void store(MultipartFile file);

    /**
     * 加载所有文件路径
     * @return
     */
    Stream<Path> loadAll();

    /**
     * 加载文件路径
     * @param filename
     * @return
     */
    Path load(String filename);

    /**
     * 加载文件数据
     * @param filename
     * @return
     */
    Resource loadAsResource(String filename);

    /**
     * 初始化完全删除
     */
    void deleteAll();
}
