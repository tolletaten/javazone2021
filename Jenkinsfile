#! groovy

String app = 'toll-app'

node {
    checkout scm
    def multibranchJenkinsfile = load("jenkinsfile-multibranch/jenkinsfileMultibranch.groovy")
    multibranchJenkinsfile.buildAndPush(app)
}