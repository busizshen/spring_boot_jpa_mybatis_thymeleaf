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
 * The type Mybatis config.
 */
@Configuration
@MapperScan("com.wonzopein.demo.mybatis.mapper")
public class MybatisConfig {

    /**
     * The My batis properties.
     */
    @Autowired
    MyBatisProperties myBatisProperties;

    /**
     * Sql session factory for my batis.
     *
     * @param dataSource the data source
     * @return the sql session factory bean
     * @throws Exception the exception
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryForMyBatis(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation( myBatisProperties.getConfigLocation() );
        sqlSessionFactoryBean.setMapperLocations( myBatisProperties.getMapperLocation() );
        return sqlSessionFactoryBean;
    }

    /**
     * Sql session for my batis.
     *
     * @param sqlSessionFactory the sql session factory
     * @return the sql session
     */
    @Bean
    public SqlSession sqlSessionForMyBatis(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);

    }

}
