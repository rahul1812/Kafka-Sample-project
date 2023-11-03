# Kafka-Sample-project


Command 

Go to the folder of kakfa and open the cmd after that run below command
C:\kafka

a) To run zookeepers
   bin\windows\zookeeper-server-start.bat config\zookeeper.properties
   
b) To run kafka server 
   bin\windows\kafka-server-start.bat config\server.properties
   
   
Now we will create the topic.

1) create new topic with kafka-topics
2) produce example message with kafka-console-producer.
3) consume the message with kafka-console consumer.

For docs got to   URL:- https://kafka.apache.org/documentation/



command to create the topic 
$ bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

in above command change to bat because we are using in windows system
 bin\windows\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092
 
 To check newly created topics run below command
 bin\windows\kafka-topics.bat --describe --topic user-topic --bootstrap-server localhost:9092
 
 To produce message in new topic
 bin\windows\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092
 
 to consume message
 >bin\windows\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092
