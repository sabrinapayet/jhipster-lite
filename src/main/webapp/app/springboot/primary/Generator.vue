<template>
  <q-layout view="hHh lpR fFf">
    <q-header reveal elevated class="bg-primary text-white">
      <q-toolbar>
        <q-toolbar-title>
          <q-avatar>
            <img src="../../../content/JHipster-Lite-neon-blue_40x.png" alt="" />
          </q-avatar>
          JHipster Lite - Spring Boot Generator
        </q-toolbar-title>
      </q-toolbar>
    </q-header>

    <q-page-container>
      <q-page class="q-pa-md">
        <div class="row q-gutter-md">
          <div class="col-12 col-md-4">
            <q-card flat bordered class="my-card">
              <q-card-section>
                <div class="text-h6">Project configuration</div>
              </q-card-section>

              <q-separator dark inset />

              <q-card-section>
                <q-input v-model="text" label="Path (required)" />
                <q-input v-model="text" label="Project name" />
                <q-input v-model="text" label="Base name" />
                <q-input v-model="text" label="Package name" />
                <q-input v-model="text" label="Server port" />
              </q-card-section>
            </q-card>
          </div>
          <div class="col">
            <q-card class="my-card">
              <q-card-section>
                <div class="text-h6">Options</div>
              </q-card-section>

              <q-card-section class="q-pt-none">
                <div class="q-pa-md">
                  <q-list bordered padding>
                    <q-item-label header class="text-weight-bold">Language</q-item-label>

                    <q-separator spaced inset="item" />
                    <div class="row">
                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="language" val="java" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>Java</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/java_rounded_40x40.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>
                    </div>

                    <q-separator spaced />

                    <q-item-label header class="text-weight-bold">Build tool</q-item-label>

                    <q-separator spaced inset="item" />
                    <div class="row">
                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="build" val="maven" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>Maven</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/JHipster-Lite-neon-blue_40x.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>

                      <q-separator vertical inset />

                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="build" val="gradle" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>Gradle</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/JHipster-Lite-neon-blue_40x.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>
                    </div>

                    <q-separator spaced />

                    <q-item-label header class="text-weight-bold">Server</q-item-label>

                    <q-separator spaced inset="item" />

                    <div class="row">
                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="server" val="none" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>None</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/JHipster-Lite-neon-blue_40x.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>

                      <q-separator vertical inset />

                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="server" val="spring" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>Spring Boot</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/JHipster-Lite-neon-blue_40x.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>
                    </div>

                    <q-separator spaced />

                    <q-item-label header class="text-weight-bold">Client</q-item-label>

                    <q-separator spaced inset="item" />
                    <div class="row">
                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="client" val="none" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>None</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/JHipster-Lite-neon-blue_40x.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>

                      <q-separator vertical inset />

                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="client" val="angular" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>Angular</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/AngularLogo.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>

                      <q-separator vertical inset />

                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="client" val="react" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>React</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/ReactLogo.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>

                      <q-separator vertical inset />

                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="client" val="vue" />
                        </q-item-section>
                        <q-item-section>
                          <q-item-label>Vue</q-item-label>
                        </q-item-section>
                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/VueLogo.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>

                      <q-separator vertical inset />

                      <q-item>
                        <q-item-section side top>
                          <q-radio v-model="client" val="svelte" />
                        </q-item-section>

                        <q-item-section>
                          <q-item-label>Svelte</q-item-label>
                        </q-item-section>

                        <q-item-section top avatar>
                          <q-avatar>
                            <img src="../../../content/SvelteLogo.png" alt="" />
                          </q-avatar>
                        </q-item-section>
                      </q-item>
                    </div>
                  </q-list>
                </div>
              </q-card-section>
            </q-card>
          </div>
        </div>

        <div class="q-pa-md row items-start">
          <q-toolbar class="bg-primary text-white shadow-2">
            <q-toolbar-title>Initialization</q-toolbar-title>
          </q-toolbar>
          <q-list bordered class="row q-pt-none">
            <q-item>
              <q-item-section>
                <q-item-label class="text-h6">Init</q-item-label>
              </q-item-section>
              <q-item-section top side>
                <div class="text-grey-8 q-gutter-xs">
                  <q-btn class="glossy" align="between" size="md" color="primary" icon="engineering"> Generate </q-btn>
                </div>
              </q-item-section>
            </q-item>

            <q-separator vertical />

            <q-item>
              <q-item-section>
                <q-item-label class="text-h6">Maven</q-item-label>
              </q-item-section>
              <q-item-section top side>
                <div class="text-grey-8 q-gutter-xs">
                  <q-btn class="glossy" align="between" size="md" color="primary" icon="engineering"> Generate </q-btn>
                </div>
              </q-item-section>
            </q-item>

            <q-separator vertical />

            <q-item>
              <q-item-section>
                <q-item-label class="text-h6">Java base</q-item-label>
              </q-item-section>
              <q-item-section top side>
                <div class="text-grey-8 q-gutter-xs">
                  <q-btn class="glossy" align="between" size="md" color="primary" icon="engineering"> Generate </q-btn>
                </div>
              </q-item-section>
            </q-item>

            <q-separator vertical />
          </q-list>
        </div>
        <div class="q-pa-md row items-start q-gutter-md">
          <q-card class="my-card" flat bordered>
            <q-toolbar class="bg-spring text-white shadow-2">
              <q-toolbar-title>Spring Boot</q-toolbar-title>
            </q-toolbar>

            <q-card-actions>
              <q-btn flat color="dark" label="Core" />
              <q-btn flat color="primary" label="Security" />
              <q-btn flat color="dark" label="Database" />
              <q-btn flat color="dark" label="Cache" />

              <q-space />

              <q-btn
                color="grey"
                round
                flat
                dense
                :icon="expanded ? 'keyboard_arrow_up' : 'keyboard_arrow_down'"
                @click="expanded = !expanded"
              />
            </q-card-actions>

            <q-slide-transition>
              <div v-show="expanded">
                <q-separator />
                <q-card-section class="text-subitle2">
                  {{ lorem }}
                </q-card-section>
              </div>
            </q-slide-transition>
          </q-card>
        </div>
      </q-page>
      <router-view />
    </q-page-container>

    <q-footer reveal elevated class="bg-grey-8 text-white">
      <q-toolbar>
        <q-toolbar-title>
          <q-avatar>
            <img src="https://cdn.quasar.dev/logo-v2/svg/logo-mono-white.svg" />
          </q-avatar>
          <div>Title</div>
        </q-toolbar-title>
      </q-toolbar>
    </q-footer>
  </q-layout>
</template>

<script lang="ts" src="./Generator.component.ts"></script>

<style>
.bg-spring {
  background: #6db33f;
}
</style>
