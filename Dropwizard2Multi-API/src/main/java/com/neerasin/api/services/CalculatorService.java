package com.neerasin.api.services;

import com.codahale.metrics.annotation.Timed;
import com.neerasin.business.CalculatorBusinessService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@OpenAPIDefinition(
        tags = {@Tag(name = "CalculatorService")})
@Path("/CalculatorService")
@Produces(MediaType.APPLICATION_JSON)
public class CalculatorService {

    private CalculatorBusinessService calculatorBusinessService = new CalculatorBusinessService();

    @GET
    @Timed
    @Path("add")
    public Integer add(@NotNull @QueryParam("first") int first, @NotNull @QueryParam("second") int second) {
        return calculatorBusinessService.add(first,second);
    }
}
