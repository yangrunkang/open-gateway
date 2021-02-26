package com.open.basic.inter.base.db;


import java.util.List;

/**
 * 基本集合
 * @param <T> 泛型 T
 */
public interface BaseMapper<T> {

    /**
     * 插入
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 批量插入T集合
     * @param tList
     * @return
     */
    int insertBatch(List<T> tList);

    /**
     * 更新T
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 批量更新T集合
     * @param tList
     * @return
     */
    int updateBatch(List<T> tList);

    /**
     * 删除T
     * @param t
     * @return
     */
    int delete(T t);

    /**
     * 批量删除T集合
     * @param tList
     * @return
     */
    int deleteBatch(List<T> tList);

}
