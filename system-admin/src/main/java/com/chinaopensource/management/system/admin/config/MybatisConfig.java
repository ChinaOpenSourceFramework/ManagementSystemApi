package com.chinaopensource.management.system.admin.config;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * Mybatis配置
 * @date Jan 11, 2019
 * @author 李其伟
 */
@Configuration
/**
 * 扫描DAO
 */
@MapperScan("com.chinaopensource.management.system.**.dao")
public class MybatisConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        /**
         * 扫描Model
         */
        sessionFactory.setTypeAliasesPackage("com.chinaopensource.management.system.**.model");

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        /**
         * 扫描映射文件
         */
        sessionFactory.setMapperLocations(resolver.getResources("classpath*:/mysql/mapper/*.xml"));

        return sessionFactory.getObject();
    }
}