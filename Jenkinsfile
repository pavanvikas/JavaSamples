    properties([ 
         buildDiscarder(logRotator(numToKeepStr:'10')),
         gitLabConnection('git.zd.datev.de') 
    ])






    stage ('Linux')
    {
        node ('Linux') {
		
		// 'theCredentials' is configured in Jenkins, including credentials for the Artifactory access
		// 'maven-3.6.1' is configured in Jenkins and points to a Maven 3.6.1 installation
		// 'maven-central-mirror' is configured in Artifactory as a virtual repository. 
		// 'maven-datev-repo' is configured in Anrtifactoy as a local repository
		
		
        checkout scm
    
		def artifactory = Artifactory.server('theCredentials')
        def maven = Artifactory.newMavenBuild()

        def buildUser = sh(returnStdout: true, script: "whoami").trim()
        def repoloc = " -Dmaven.repo.local=/data/jenkins/" + buildUser + "/m2repos/" + 'maven-central-mirror'

        maven.resolver server: artifactory, releaseRepo: 'maven-central-mirror', snapshotRepo: 'maven-central-mirror'
        maven.deployer server: artifactory, releaseRepo: 'maven-datev-repo', snapshotRepo: 'maven-datev-repo'
        maven.deployer.deployArtifacts = true
        maven.tool = 'maven-3.6.1'

        def preliminaryBuildInfo = Artifactory.newBuildInfo()
        preliminaryBuildInfo.name = "${preliminaryBuildInfo.name} - Stage: 'build'"

        maven.opts = '-Dmaven.test.failure.ignore' + repoloc
        def mavenGoals = 'clean install'

        def buildInfo = maven.run pom: 'pom.xml', goals: '-B' + " " + mavenGoals, buildInfo: preliminaryBuildInfo

 
 
        }
        
    }
	
	
	