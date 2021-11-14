package tech.jhipster.light.generator.server.javatool.error.infrastructure.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.light.generator.project.domain.ProjectRepository;
import tech.jhipster.light.generator.server.javatool.error.domain.ErrorDomainService;
import tech.jhipster.light.generator.server.javatool.error.domain.ErrorService;

@Configuration
public class ErrorServiceBeanConfiguration {

  private final ProjectRepository projectRepository;

  public ErrorServiceBeanConfiguration(ProjectRepository projectRepository) {
    this.projectRepository = projectRepository;
  }

  @Bean
  public ErrorService errorService() {
    return new ErrorDomainService(projectRepository);
  }
}