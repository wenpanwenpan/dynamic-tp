package com.dtp.starter.adapter.sofa.autoconfigure;

import com.dtp.adapter.sofa.SofaDtpAdapter;
import com.dtp.starter.common.autoconfigure.BaseBeanAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SofaTpAutoConfiguration related
 *
 * @author yanhom
 * @since 1.1.0
 */
@Configuration
@ConditionalOnClass(name = "com.alipay.sofa.rpc.config.UserThreadPoolManager")
@AutoConfigureAfter({BaseBeanAutoConfiguration.class})
public class SofaTpAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SofaDtpAdapter sofaDtpAdapter() {
        return new SofaDtpAdapter();
    }
}
