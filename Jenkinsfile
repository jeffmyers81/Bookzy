Pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				build 'PipelineProject_Build'
			}
		}			
		stage('Test') {
			steps {
				build 'PipelineProject_Test'
			}
		}			
		stage('Deploy') {
			steps {
				build 'PipelineProject_Deploy'
			}			
		}
	}
}

