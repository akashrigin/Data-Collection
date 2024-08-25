package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class ThreadConfig {

    @Bean("AsyncTaskHandler")
    public Executor AsyncTaskHandler(){
        ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(2);
        taskExecutor.setQueueCapacity(100);
        taskExecutor.setMaxPoolSize(2);
        taskExecutor.setThreadNamePrefix("AsyncExecutorThread-");
        taskExecutor.initialize();
        return taskExecutor;
    }

}
