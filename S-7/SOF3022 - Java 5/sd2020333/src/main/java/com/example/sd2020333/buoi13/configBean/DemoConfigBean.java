package com.example.sd2020333.buoi13.configBean;

import com.example.sd2020333.buoi13.model.CapSach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfigBean {
    @Bean
    public CapSach createCapSachBean() {
        return new CapSach(1, "lbee2012");
    }
}
