package com.gotax.framework.library.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface GoTaxLogChannel {

    @Output(value = "gotax_logs")
    MessageChannel output();
}
