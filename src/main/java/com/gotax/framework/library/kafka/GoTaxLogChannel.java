package com.gotax.framework.library.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface GoTaxLogChannel {

    @Output(value = "gotax_logs")
    MessageChannel output();
}
