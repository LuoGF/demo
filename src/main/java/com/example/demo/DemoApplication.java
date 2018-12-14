package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.demo.mapper")//与dao层的@Mapper二选一写上即可(主要作用是扫包)

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("1111");
    }
 /* @Bean(destroyMethod = "close",initMethod = "init")
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource druidDataSource(){
        DruiDataSource druidDataSource=new DruiDataSource();
        return druiDataSource;
  }*/
}
