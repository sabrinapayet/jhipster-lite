package tech.jhipster.lite.generator.server.springboot.dbmigration.liquibase.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.generator.buildtool.generic.domain.BuildToolService;
import tech.jhipster.lite.generator.project.domain.ProjectRepository;
import tech.jhipster.lite.generator.server.springboot.dbmigration.liquibase.domain.LiquibaseDomainService;
import tech.jhipster.lite.generator.server.springboot.dbmigration.liquibase.domain.LiquibaseService;
import tech.jhipster.lite.generator.server.springboot.logging.domain.SpringBootLoggingService;
import tech.jhipster.lite.generator.server.springboot.properties.domain.SpringBootPropertiesService;

@Configuration
public class LiquibaseBeanConfiguration {

  public final ProjectRepository projectRepository;
  public final BuildToolService buildToolService;
  public final SpringBootPropertiesService springBootPropertiesService;
  public final SpringBootLoggingService springBootLoggingService;

  public LiquibaseBeanConfiguration(
    ProjectRepository projectRepository,
    BuildToolService buildToolService,
    SpringBootPropertiesService springBootPropertiesService,
    SpringBootLoggingService springBootLoggingService
  ) {
    this.projectRepository = projectRepository;
    this.buildToolService = buildToolService;
    this.springBootPropertiesService = springBootPropertiesService;
    this.springBootLoggingService = springBootLoggingService;
  }

  @Bean
  public LiquibaseService liquibaseService() {
    return new LiquibaseDomainService(projectRepository, buildToolService, springBootPropertiesService, springBootLoggingService);
  }
}
