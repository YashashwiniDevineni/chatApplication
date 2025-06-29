ChatApplication Using Apache Kafka  
  
A real-time, distributed chat messaging system built using Apache Kafka, Spring Boot, ReactJS, and MongoDB.  
Designed as a fault-tolerant, scalable chat platform supporting instant message delivery using Kafka’s publish-subscribe mechanism and WebSocket communication.  
  
Features:  
User Authentication & Login  
Real-Time Messaging using Kafka & WebSockets  
Message Queueing with Kafka (no message loss)  
One-to-One & Group Chat Support  
Distributed Architecture with fault tolerance  
Scalable Database with MongoDB  
  
Technologies Used:            
Frontend - ReactJS                 
Backend - Spring Boot (Java)          
Messaging - Apache Kafka, ZooKeeper   
Database - MongoDB (NoSQL)           
Deployment - Docker                    
  
System Architecture:  
Client (ReactJS) -> WebSocket  
Backend API (Spring Boot) -> Kafka Producer  
Kafka Topic (Chat) -> Kafka Consumer  
Backend Broadcast → WebSocket → Client(s)  
  
Messages are serialized and published to a Kafka topic.  
Kafka ensures replication, fault tolerance, and ordering.  
Backend consumes and forwards the messages to appropriate WebSocket clients.  
  
Execution Steps:  
- Start Services via Docker  
- Start Docker Desktop  
- Run containers for:  
  Zookeeper  
  Kafka  
  MongoDB  
- Start Backend (Spring Boot)  
- Navigate to the Spring Boot directory.  
- Run the backend application (`ChatApplication.java`) via your IDE or terminal.  
- Start Frontend (React)  
- Open the integrated terminal inside the `/src` folder of the ReactJS project.  
- Run:  
  bash  
  npm install  # First time only  
  npm start  
    
Team Contribution:  
Yashashwini Devineni - Project Lead,Backend    
Bindu Naga Varshini Cherukupalli - Frontend  
Kiranmayee Goud Panthangi - Kafka  
Varshithai Kesa - Database  
  
Load Testing:  
Tool Used: Apache JMeter  
Simulated 10,000 requests over 100 seconds  
Verified high throughput and low latency under load  
  
Security & Reliability:  
Kafka topic replication for fault tolerance  
MongoDB replica sets for data consistency  
WebSocket for instant message delivery without polling  
  
Future Improvements:  
Multiple chat channels  
File and media sharing  
End-to-end message encryption  
Mobile responsiveness  
  
References:  
* [Apache Kafka](https://kafka.apache.org)  
* [Spring Boot](https://spring.io/projects/spring-boot)  
* [MongoDB](https://www.mongodb.com)  
* [ReactJS](https://reactjs.org)  
* [Docker](https://www.docker.com)  
  
