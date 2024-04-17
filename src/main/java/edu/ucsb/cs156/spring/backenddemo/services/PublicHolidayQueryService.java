package edu.ucsb.cs156.spring.backenddemo.services;

import java.util.Map;

import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@Service
public class PublicHolidayQueryService {


    private final RestTemplate restTemplate;

    public PublicHolidayQueryService(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public static final String ENDPOINT = "https://date.nager.at/api/v2/publicholidays/{year}/{countryCode}";

    public String getJSON(String year, String countryCode) throws HttpClientErrorException {
        log.info("year={}, countryCode={}", year, countryCode);
        Map<String, String> uriVariables = Map.of("year", year, "countryCode", countryCode);
        return "";
    }

   

}