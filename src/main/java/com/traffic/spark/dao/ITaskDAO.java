package com.traffic.spark.dao;


import com.traffic.spark.domain.Task;

/**
 * 任务管理DAO接口
 *
 * @author root
 */
public interface ITaskDAO {

    /**
     * 根据task的主键查询指定的任务
     *
     * @param taskId
     * @return
     */
    Task findTaskById(long taskId);
}
