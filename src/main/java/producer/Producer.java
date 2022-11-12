package producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Producer {
    final Properties properties = new Properties();

    public Producer() {
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    }

    public void sendRecord (final ProducerRecord<String,String> producerRecord) {
        final KafkaProducer<String,String> kafkaProducer = new KafkaProducer<>(properties);
        kafkaProducer.send(producerRecord);
        kafkaProducer.close();
    }
}
