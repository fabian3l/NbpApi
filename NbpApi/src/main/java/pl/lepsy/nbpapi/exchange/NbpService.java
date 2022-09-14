package pl.lepsy.nbpapi.exchange;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
@Slf4j
public class NbpService implements ExchangeRate{

    private static final String NBP_API_TABLE = "http://api.nbp.pl/api/exchangerates/tables/a/usd/last/3?format=json";

    @Override
    public void getDataFromTable() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<TableDto[]> forEntity = restTemplate.getForEntity(NBP_API_TABLE, TableDto[].class);

        TableDto[] body = forEntity.getBody();

        Arrays.stream(body).map(TableDto::getRates)
                .flatMap(b->b.stream())
                .forEach(r -> log.info("rate: {}", r));

    }
}
