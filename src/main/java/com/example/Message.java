package com.example;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {
        @Id
        @GeneratedValue
        int id;

        @Column(nullable = false)
        String message;

//        @Column(nullable = false)
//        User user;

        public Message() {
        }

        public Message(String message) {
                this.message = message;
        }

//        public Message(String message, User user) {
//                this.message = message;
//                this.user = user;
//        }
}
