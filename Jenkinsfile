def UPSTREAM_PROJECTS_LIST = [ "Mule-runtime/mule-integration-tests/4.x",
                               "Mule-runtime/mule-http-service/master",
                               "Mule-runtime/mule-oauth-service/master",
                               "Mule-runtime/mule-scheduler-service/master",
                               "Mule-runtime/mule-soap-service/master",
                               "Mule-runtime/mule-embedded-api/master",
                               "Mule-runtime/mule-maven-client/master" ]

Map pipelineParams = [ "upstreamProjects" : UPSTREAM_PROJECTS_LIST.join(','),
                       "mavenSettingsXmlId" : "mule-runtime-maven-settings-MuleSettings" ]

runtimeProjectsBuild(pipelineParams)
