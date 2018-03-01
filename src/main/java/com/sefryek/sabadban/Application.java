package com.sefryek.sabadban;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by ismael.sadeghi on 03/01/2018.
 */
@SpringBootApplication
@EnableCaching
@EnableJpaAuditing
public class Application extends SpringBootServletInitializer{

    private static final Logger log = LoggerFactory.getLogger(Application.class);


}
