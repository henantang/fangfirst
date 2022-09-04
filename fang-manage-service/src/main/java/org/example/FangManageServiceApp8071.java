package org.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubbo
@MapperScan("org.example.product.dao")
public class FangManageServiceApp8071 {
    public static void main(String[] args) {
        SpringApplication.run(FangManageServiceApp8071.class, args);
    }
}
