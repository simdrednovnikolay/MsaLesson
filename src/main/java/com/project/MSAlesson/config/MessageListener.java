package com.project.MSAlesson.config;


import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Level;
import java.util.logging.Logger;

@Configuration
public class MessageListener {

    private Logger logger = Logger.getLogger(MessageListener.class.getName());

    @StreamListener(ConsumerChannel.DIRECTED)
    public void directed(String message) {
        logger.log(Level.WARNING,"Directed: " + message);

    }

    @StreamListener(ConsumerChannel.BROADCASTS)
    public void broadcasted(String message) {
        logger.warning("Directed: " + message);
    }
}
