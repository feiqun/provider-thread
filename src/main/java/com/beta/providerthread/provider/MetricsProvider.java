package com.beta.providerthread.provider;

import com.beta.providerthread.model.Metrics;
import com.beta.providerthread.model.Mo;
import com.beta.providerthread.model.SampleValue;
import reactor.core.publisher.Mono;

public interface MetricsProvider {

    SampleValue sample(Mo mo, Metrics metrics);

}
