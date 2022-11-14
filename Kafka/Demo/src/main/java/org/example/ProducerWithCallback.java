package org.example;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class ProducerWithCallback {
    public static void main(String[] args) {
        // create properties for producer config depend on kafka doc
        // https://kafka.apache.org/documentation/#producerconfigs
        Logger logger = LoggerFactory.getLogger(ProducerWithCallback.class);
        String bootstrapServers = "127.0.0.1:9092";
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        // create kafka producer with properties
        KafkaProducer<String, String> my_producer = new KafkaProducer<>(properties);
        // create producer record (just think it's like data you want to send)
        for (int i = 0; i < 10; i++) {
            ProducerRecord<String, String> record = new ProducerRecord<String, String>("this_is_first_topic", String.valueOf(i+1), "hello kafka" + i);
            logger.info("key: " + i+1);
            my_producer.send(record, new Callback() {
                        @Override
                        public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                            if (e == null) {
                                logger.info("Successfully received the details as: \n" +
                                        "Topic: " + recordMetadata.topic() + "\n" +
                                        "Partition: " + recordMetadata.partition() + "\n" +
                                        "Offset: " + recordMetadata.offset() + "\n" +
                                        "Timestamp: " + recordMetadata.timestamp());
                            } else {
                                logger.info(e.getMessage());
                            }
                        }
                    }
            );
        }
        my_producer.flush();
        my_producer.close();
    }
}
