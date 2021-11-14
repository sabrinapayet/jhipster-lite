package tech.jhipster.light.generator.server.springboot.database.postgresql.infrastructure.beans;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import tech.jhipster.light.IntegrationTest;
import tech.jhipster.light.generator.server.springboot.database.postgresql.domain.PostgresqlDomainService;

@IntegrationTest
class PostgresqlServiceBeanConfigurationIT {

  @Autowired
  ApplicationContext applicationContext;

  @Test
  void shouldGetBean() {
    assertThat(applicationContext.getBean("postgresqlService")).isNotNull().isInstanceOf(PostgresqlDomainService.class);
  }
}