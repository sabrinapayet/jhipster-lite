package tech.jhipster.forge.generator.server.springboot.database.psql.domain;

import tech.jhipster.forge.generator.project.domain.Project;

public interface PsqlService {
  void init(Project project);

  void addSpringDataJpa(Project project);
  void addPostgreSQLDriver(Project project);
  void addHikari(Project project);
  void addHibernateCore(Project project);
  void addDockerCompose(Project project);
  void addDialectJava(Project project);
  void addProperties(Project project);
  void addTestcontainers(Project project);
}