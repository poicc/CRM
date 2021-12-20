package com.soft.crm.soft.crm.security.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @description: Swagger配置
 * @author: mqxu
 * @date: 2021-12-10
 **/
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfiguration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.mqxu.crm"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("CRM系统接口管理文档")
                .description("CRM系统接口管理文档")
                .termsOfServiceUrl("https://mqxu.top")
                .version("1.0.0")
                .contact(new Contact("mqxu", "https://mqxu.top", "16422802@qq.com"))
                .build();
    }

    /**
     * SpringFox3.0在SpringBoot 2.6下报错，加入这个解决
     * https://stackoverflow.com/questions/70178343/springfox-3-0-0-is-not-working-with-spring-boot-2-6-0
     *
     * @return BeanPostProcessor
     */
    //@Bean
    //public static BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
    //    return new BeanPostProcessor() {
    //
    //        @Override
    //        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //            if (bean instanceof WebMvcRequestHandlerProvider || bean instanceof WebFluxRequestHandlerProvider) {
    //                customizeSpringfoxHandlerMappings(getHandlerMappings(bean));
    //            }
    //            return bean;
    //        }
    //
    //        private <T extends RequestMappingInfoHandlerMapping> void customizeSpringfoxHandlerMappings(List<T> mappings) {
    //            List<T> copy = mappings.stream()
    //                    .filter(mapping -> mapping.getPatternParser() == null)
    //                    .collect(Collectors.toList());
    //            mappings.clear();
    //            mappings.addAll(copy);
    //        }
    //
    //        @SuppressWarnings("unchecked")
    //        private List<RequestMappingInfoHandlerMapping> getHandlerMappings(Object bean) {
    //            try {
    //                Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings");
    //                assert field != null;
    //                field.setAccessible(true);
    //                return (List<RequestMappingInfoHandlerMapping>) field.get(bean);
    //            } catch (IllegalArgumentException | IllegalAccessException e) {
    //                throw new IllegalStateException(e);
    //            }
    //        }
    //    };
    //}

}
