node {
    stage 'Check out'
        echo 'Checking out...'
        checkout scm
    stage 'Build Jar'
        echo 'Building Jar file...'
        sh 'mvn clean install'
        archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        junit 'target/surefire-reports/*.xml'
}