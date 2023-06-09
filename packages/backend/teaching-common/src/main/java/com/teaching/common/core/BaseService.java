package com.teaching.common.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service基类
 * @author sacher
 **/
public abstract class BaseService {

    protected Logger LOG;

    protected BaseService() {
        LOG = LoggerFactory.getLogger(getClass());
    }


}
