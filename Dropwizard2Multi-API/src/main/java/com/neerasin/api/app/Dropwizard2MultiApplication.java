package com.neerasin.api.app;


import com.neerasin.api.services.CalculatorService;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

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
        bootstrap.addBundle(new SwaggerBundle<Dropwizard2MultiConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(Dropwizard2MultiConfiguration configuration) {
                return configuration.swaggerBundleConfiguration;
            }
        });
    }

    @Override
    public void run(final Dropwizard2MultiConfiguration configuration,
                    final Environment environment) {
        CalculatorService calculatorService = new CalculatorService();
        environment.jersey().register(calculatorService);
    }

}
