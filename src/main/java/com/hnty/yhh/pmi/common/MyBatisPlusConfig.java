package com.hnty.yhh.pmi.common;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Liu Zhendong
 * @Description
 * @createTime 2020年05月06日 09:17:00
 */
@Configuration
@MapperScan({"com.hnty.yhh.pmi"})
public class MyBatisPlusConfig {

    /**
     * 分页插件
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * 性能分析插件
     *该插件 3.2.0 以上版本移除推荐使用第三方扩展 执行SQL分析打印 功能
     * @return
     */

    /*
     * @Bean public PerformanceInterceptor performanceInterceptor() {
     * PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
     * //格式化sql语句 Properties properties = new Properties();
     * properties.setProperty("format", "true");
     * performanceInterceptor.setProperties(properties); return
     * performanceInterceptor; }
     */


    /**
     * 乐观锁插件
     *
     * @return
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
