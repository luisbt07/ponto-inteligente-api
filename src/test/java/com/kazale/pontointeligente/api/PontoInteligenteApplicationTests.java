package com.kazale.pontointeligente.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")//Dizer para o teste que ele vai abrir um profile do tipo testes e não obter uma instancia do mysql
public class PontoInteligenteApplicationTests {

    @Test
    public void contextLoads() {
    }

}