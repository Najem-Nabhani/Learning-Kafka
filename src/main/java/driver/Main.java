package driver;

import producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer();

        final ProducerRecord<String, String> producerRecord = new ProducerRecord<>("orders", "topicName", "MSG");
        producer.sendRecord(producerRecord);
    }
}
