package com.neerasin.api.app;

import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.hibernate.validator.constraints.*;
import jakarta.validation.constraints.*;

public class Dropwizard2MultiConfiguration extends Configuration {

    @JsonProperty("swagger")
    public SwaggerBundleConfiguration swaggerBundleConfiguration;

}
