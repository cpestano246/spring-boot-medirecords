package co.medirecords.exam.service;

import co.medirecords.exam.utils.JsonUtility;
import co.medirecords.exam.objects.WeatherstackResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherstackServiceImpl implements WeatherstackService{

    @Value("${weatherstack.path}")
    private String weatherStackPath;

    @Value("${weatherstack.accessKey}")
    private String accessKey;

    private final JsonUtility jsonUtility;
    private final RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(WeatherstackServiceImpl.class);

    public WeatherstackServiceImpl(JsonUtility jsonUtility, RestTemplate restTemplate) {
        this.jsonUtility = jsonUtility;
        this.restTemplate = restTemplate;
    }

    private HttpEntity createHttpEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.add("content-type", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity(headers);
    }

    @Override
    public WeatherstackResponse getCurrent(String location) {

        logger.info(" Weatherstack current ::: request ::: Location:[{}]", location);

        ResponseEntity<WeatherstackResponse> response =
                restTemplate.exchange( weatherStackPath+ "current?access_key="+ accessKey +"&query="+location,
                        HttpMethod.GET, createHttpEntity(), WeatherstackResponse.class);

        logger.info(" Weatherstack current ::: response ::: {}", jsonUtility.toJson(response.getBody()));

        if(response.getBody() == null){
            return null;
        }

        return response.getBody();
    }
}
