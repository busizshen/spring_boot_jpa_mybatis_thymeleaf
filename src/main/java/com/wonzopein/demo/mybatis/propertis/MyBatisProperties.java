package com.wonzopein.demo.mybatis.propertis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

/**
 * Created by seunghyeonoh on 15. 7. 13..
 */
@ConfigurationProperties(prefix = "mybatis")
public class MyBatisProperties {

    Resource configLocation;
    Resource[] mapperLocation;

    public Resource[] getMapperLocation() {
        return mapperLocation;
    }

    public void setMapperLocation(Resource[] mapperLocation) {
        this.mapperLocation = mapperLocation;
    }

    public Resource getConfigLocation() {
        return configLocation;
    }

    public void setConfigLocation(Resource configLocation) {
        this.configLocation = configLocation;
    }
}
