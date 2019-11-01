package com.java.efficent.integration.data;

import com.java.efficent.integration.async.CreateBulk;
import com.java.efficent.integration.consts.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import javax.annotation.PostConstruct;

public class ApplicationDataSet {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    TaskExecutor taskExecutor;

    @PostConstruct
    public void preCreateBean() {
        if (!elasticsearchTemplate.indexExists(Constants.indexName)) {
            elasticsearchTemplate.createIndex(Constants.indexName);
        }

        for (int i = 0; i < 100; i++) {
            taskExecutor.execute(new CreateBulk());
        }
    }


}
