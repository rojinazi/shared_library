def call (){
    pipeline {
    agent any

    stages {

        
         stage('Terraform Init') {
            steps {
              sh '''cd test1;terraform init;terraform apply -auto-approve
'''
            }
        }
        
        stage('Terraform Apply') {
            steps {
              sh '''cd test1;terraform init;terraform apply -auto-approve
'''
            }
        }
    }
}
}