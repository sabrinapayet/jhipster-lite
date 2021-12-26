package tech.jhipster.lite.generator.server.springboot.async.domain;

import static tech.jhipster.lite.common.domain.FileUtils.getPath;
import static tech.jhipster.lite.generator.project.domain.Constants.MAIN_JAVA;
import static tech.jhipster.lite.generator.project.domain.Constants.TEST_JAVA;
import static tech.jhipster.lite.generator.project.domain.DefaultConfig.BASE_NAME;
import static tech.jhipster.lite.generator.project.domain.DefaultConfig.PACKAGE_NAME;

import java.util.Map;
import java.util.TreeMap;
import tech.jhipster.lite.generator.project.domain.Project;
import tech.jhipster.lite.generator.project.domain.ProjectRepository;
import tech.jhipster.lite.generator.server.springboot.common.domain.SpringBootCommonService;
import tech.jhipster.lite.generator.server.springboot.properties.domain.SpringBootPropertiesService;

public class SpringBootAsyncDomainService implements SpringBootAsyncService {

  public static final String SOURCE = "server/springboot/async";

  public static final String ASYNC_PATH = "technical/infrastructure/secondary/async";

  private final ProjectRepository projectRepository;
  private final SpringBootCommonService springBootCommonService;
  private final SpringBootPropertiesService springBootPropertiesService;

  public SpringBootAsyncDomainService(
    ProjectRepository projectRepository,
    SpringBootCommonService springBootCommonService,
    SpringBootPropertiesService springBootPropertiesService
  ) {
    this.projectRepository = projectRepository;
    this.springBootCommonService = springBootCommonService;
    this.springBootPropertiesService = springBootPropertiesService;
  }

  @Override
  public void init(Project project) {
    addJavaFiles(project);
    addProperties(project);
  }

  @Override
  public void addJavaFiles(Project project) {
    project.addDefaultConfig(PACKAGE_NAME);
    project.addDefaultConfig(BASE_NAME);
    String packageNamePath = project.getPackageNamePath().orElse(getPath("com/mycompany/myapp"));

    templateToAsync(project, packageNamePath, "src", "AsyncConfiguration.java", MAIN_JAVA);
    templateToAsync(project, packageNamePath, "src", "ExceptionHandlingAsyncTaskExecutor.java", MAIN_JAVA);

    springBootCommonService.addTestLogbackRecorder(project);
    templateToAsync(project, packageNamePath, "test", "AsyncConfigurationIT.java", TEST_JAVA);
    templateToAsync(project, packageNamePath, "test", "ExceptionHandlingAsyncTaskExecutorTest.java", TEST_JAVA);
  }

  @Override
  public void addProperties(Project project) {
    String baseName = project.getBaseName().orElse("jhipster");

    springPropertiesDatasource(baseName).forEach((k, v) -> springBootPropertiesService.addProperties(project, k, v));
  }

  private Map<String, Object> springPropertiesDatasource(String baseName) {
    TreeMap<String, Object> result = new TreeMap<>();

    result.put("spring.task.execution.pool.keep-alive", "10s");
    result.put("spring.task.execution.pool.max-size", 16);
    result.put("spring.task.execution.pool.queue-capacity", 100);
    result.put("spring.task.execution.thread-name-prefix", baseName + "-task-");
    result.put("spring.task.scheduling.pool.size", 2);
    result.put("spring.task.scheduling.thread-name-prefix", baseName + "-scheduling-");

    return result;
  }

  private void templateToAsync(Project project, String source, String type, String sourceFilename, String destination) {
    projectRepository.template(project, getPath(SOURCE, type), sourceFilename, getPath(destination, source, ASYNC_PATH));
  }
}
