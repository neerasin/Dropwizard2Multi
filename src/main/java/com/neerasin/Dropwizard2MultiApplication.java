package com.neerasin;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class Dropwizard2MultiApplication extends Application<Dropwizard2MultiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new Dropwizard2MultiApplication().run(args);
    }

    @Override
    public String getName() {
        return "Dropwizard2Multi";
    }

    @Override
    public void initialize(final Bootstrap<Dropwizard2MultiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Dropwizard2MultiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
