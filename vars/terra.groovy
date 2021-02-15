def call (){
    pipeline {
    agent any

    stages {

        
         stage('Terraform Init') {
            steps {
              sh 'cd test1;terraform init'

            }
        }
        
        stage('Terraform Plan') {
            steps {
              sh 'cd test1;terraform plan'

            }
        }
        stage('Terraform Apply') {
            steps {
              sh 'cd test1;terraform apply -auto-approve'

            }
        }
    }
}
}