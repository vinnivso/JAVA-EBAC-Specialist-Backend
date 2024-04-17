package com.ebac.ebacqueues.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationRabbitMQ {
    public static final String QUEUE_NAME = "queue-ebac";
    public static final String EXCHANGE_NAME = "exchange-ebac";
    public static final String ROUTE_NAME = "route.ebac.#";

    /**
     * Creates and returns a new Queue object.
     *
     * @return the new Queue object
     */
    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME, false);
    }

    /**
     * Creates and returns a new TopicExchange bean.
     *
     * @return The newly created TopicExchange bean.
     */
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    /**
     * Creates a binding between a queue and a topic exchange with a specific routing key.
     *
     * @param queue the queue to bind
     * @param exchange the topic exchange to bind to
     * @return the binding created
     */
    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTE_NAME);
    }
}
