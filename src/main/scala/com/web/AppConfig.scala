package com.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
  * @author yangwj
  * @date 2020/8/7 10:24
  */

@SpringBootApplication(scanBasePackages = Array("com.web.*"))
class AppConfig extends WebMvcConfigurerAdapter {

}
