package com.java.efficent.integration;

import com.java.efficent.integration.data.ApplicationDataSet;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.net.InetAddress;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.java.efficent.integration.repository")
public class ElasticsearchApplication {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(ElasticsearchApplication.class, args);
    }


    @Bean
    TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        executor.initialize();
        return executor;
    }

    @Bean
    public Boolean initialDataImport() {
        return Boolean.TRUE;
    }

    @Bean
    public ApplicationDataSet applicationDataSet() {
        return new ApplicationDataSet();
    }

    @Bean
    public Client client() throws Exception {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9200));
        return client;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchTemplate(client());
    }
}

