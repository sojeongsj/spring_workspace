package org.iclass.finals;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.iclass.finals")   //해당패키지의 Component를 모두 bean으로 생성
public class FinalProductConfig {

}
