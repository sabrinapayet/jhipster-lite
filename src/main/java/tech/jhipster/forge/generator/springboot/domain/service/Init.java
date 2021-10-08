package tech.jhipster.forge.generator.springboot.domain.service;

public class Init {

  public static final String NODE_VERSION = "14.17.6";

  private Init() {}

  public static String getNodeVersion() {
    return NODE_VERSION;
  }
}