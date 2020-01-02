package multitenancy;

import multitenancy.config.MultiTenantDS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableJpaRepositories
public class MultiTenancySpringBoot {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource dataSource() {
        MultiTenantDS multiTenantDS = new MultiTenantDS();
        multiTenantDS.setDefaultTargetDataSource(defaultDatasource());
        multiTenantDS.setTargetDataSources(tenantDatasource());
        multiTenantDS.afterPropertiesSet();
        return multiTenantDS;
    }


    DataSource defaultDatasource() {
        DriverManagerDataSource driverManagerDataSource1 = new DriverManagerDataSource();
        driverManagerDataSource1.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource1.setUrl("jdbc:postgresql://localhost:5432/spring-framework");
        driverManagerDataSource1.setUsername("postgres");
        driverManagerDataSource1.setUsername("root");
        return driverManagerDataSource1;
    }

    Map<Object, Object> tenantDatasource() {
        Map<Object, Object> map = new HashMap<>();
        map.put("spring.datasource.url", "jdbc:postgresql://localhost:5432/spring-framework2");
        map.put("spring.datasource.username", "postgres");
        map.put("spring.datasource.password", "root");
        map.put("spring.datasource.driver-class-name", "org.postgresql.Driver");
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(MultiTenancySpringBoot.class);
    }
}
