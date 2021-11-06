package tech.jhipster.forge.generator.buildtool.generic.domain;

import java.util.List;
import tech.jhipster.forge.error.domain.GeneratorException;
import tech.jhipster.forge.generator.buildtool.maven.domain.MavenService;
import tech.jhipster.forge.generator.project.domain.*;

public class BuildToolDomainService implements BuildToolService {

  private final MavenService mavenService;

  public BuildToolDomainService(MavenService mavenService) {
    this.mavenService = mavenService;
  }

  @Override
  public void addParent(Project project, Parent parent) {
    if (project.isMavenProject()) {
      mavenService.addParent(project, parent);
    } else {
      throw new GeneratorException("No build tool");
    }
  }

  @Override
  public void addDependency(Project project, Dependency dependency) {
    addDependency(project, dependency, List.of());
  }

  @Override
  public void addDependency(Project project, Dependency dependency, List<Dependency> exclusions) {
    if (project.isMavenProject()) {
      mavenService.addDependency(project, dependency, exclusions);
    } else {
      throw new GeneratorException("No build tool");
    }
  }

  @Override
  public void addPlugin(Project project, Plugin plugin) {
    if (project.isMavenProject()) {
      mavenService.addPlugin(project, plugin);
    } else {
      throw new GeneratorException("No build tool");
    }
  }

  @Override
  public void addProperty(Project project, String key, String version) {
    if (project.isMavenProject()) {
      mavenService.addProperty(project, key, version);
    } else {
      throw new GeneratorException("No build tool");
    }
  }

  @Override
  public void init(Project project) {
    if (BuildToolType.MAVEN == project.getBuildTool().orElse(null)) {
      mavenService.init(project);
    } else {
      throw new GeneratorException("No build tool");
    }
  }
}