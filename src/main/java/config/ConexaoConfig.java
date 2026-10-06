package config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConexaoConfig {
    @Bean
    CommandLineRunner pingOracle(DataSource ds) {
        return args -> {
            try (var conn = ds.getConnection()) {
                boolean ok = conn.isValid(2);
                System.out.println("Oracle: " + ok);
            }
        };
    }
}
