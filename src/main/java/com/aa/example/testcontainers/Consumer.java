package com.aa.example.testcontainers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer implements MessageListener<String, String> {

    private final Logger LOG = LoggerFactory.getLogger(Consumer.class);

    @Override
    public void onMessage(ConsumerRecord<String, String> record) {
        LOG.info("Consumer1 message: {}", record.value());
    }
}
