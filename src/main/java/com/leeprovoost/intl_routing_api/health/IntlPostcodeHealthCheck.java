package com.leeprovoost.intl_routing_api.health;

import com.yammer.metrics.core.HealthCheck;

public class IntlPostcodeHealthCheck extends HealthCheck {

	// TODO implement metrics properly
    public IntlPostcodeHealthCheck() {
        super("intl-routing-api");
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}