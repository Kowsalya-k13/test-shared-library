def call(String buildCommand = 'mvn clean install') {
    sh "${buildCommand}"
}
