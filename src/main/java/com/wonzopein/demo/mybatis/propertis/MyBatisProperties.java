package com.wonzopein.demo.mybatis.propertis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

/**
 * The type My batis properties.
 */
@ConfigurationProperties(prefix = "mybatis")
public class MyBatisProperties {

    /**
     * The Config location.
     */
    Resource configLocation;
    /**
     * The Mapper location.
     */
    Resource[] mapperLocation;

    /**
     * Get mapper location.
     *
     * @return the resource [ ]
     */
    public Resource[] getMapperLocation() {
        return mapperLocation;
    }

    /**
     * Sets mapper location.
     *
     * @param mapperLocation the mapper location
     */
    public void setMapperLocation(Resource[] mapperLocation) {
        this.mapperLocation = mapperLocation;
    }

    /**
     * Gets config location.
     *
     * @return the config location
     */
    public Resource getConfigLocation() {
        return configLocation;
    }

    /**
     * Sets config location.
     *
     * @param configLocation the config location
     */
    public void setConfigLocation(Resource configLocation) {
        this.configLocation = configLocation;
    }
}
