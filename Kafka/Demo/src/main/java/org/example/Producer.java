package org.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class Producer {
    public static void main(String[] args){
        // create properties for producer config depend on kafka doc
        // https://kafka.apache.org/documentation/#producerconfigs
        String bootstrapServers = "127.0.0.1:9092";
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        // create kafka producer with properties
        KafkaProducer<String,String> my_producer = new KafkaProducer<>(properties);
        // create producer record (just think it's like data you want to send)
        ProducerRecord<String, String> record=new ProducerRecord<>("this_is_first_topic", "hello kafka");

        my_producer.send(record);
        my_producer.flush();
        my_producer.close();
    }
}
