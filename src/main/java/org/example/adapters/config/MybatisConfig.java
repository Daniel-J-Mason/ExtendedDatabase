package org.example.adapters.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.example.adapters.util.UuidTypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig {
    
    @Bean(name = "Test")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeHandlers(new UuidTypeHandler());
        return sqlSessionFactoryBean.getObject();
    }
    
//    @Bean
//    public MapperFactoryBean<MybatisDecisionRepository> mybatisDecisionRepository(SqlSessionFactory sqlSessionFactory){
//        MapperFactoryBean<MybatisDecisionRepository> factoryBean = new MapperFactoryBean<>(MybatisDecisionRepository.class);
//        factoryBean.setSqlSessionFactory(sqlSessionFactory);
//        return factoryBean;
//    }
}
