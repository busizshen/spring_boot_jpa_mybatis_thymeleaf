package com.wonzopein.demo.config;

import com.wonzopein.demo.mybatis.propertis.MyBatisProperties;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by seunghyeonoh on 15. 8. 4..
 */
@Configuration
@MapperScan("com.wonzopein.demo.mybatis.mapper")
public class MybatisConfig {

    @Autowired
    MyBatisProperties myBatisProperties;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryForMyBatis(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation( myBatisProperties.getConfigLocation() );
        sqlSessionFactoryBean.setMapperLocations( myBatisProperties.getMapperLocation() );
        return sqlSessionFactoryBean;
    }

    @Bean
    public SqlSession sqlSessionForMyBatis(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);

    }

}
