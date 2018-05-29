package com.sbt.javaschool.services.subtractprocessor.common;

import org.apache.ignite.services.Service;

public interface SubtractionService extends Service {
    public static final String SERVICE_NAME = "SubtractionService";
    public static final String METRICS_CACHE_NAME = "CalculatorSvcMetrics";

    float subtract(float a, float b);
}
