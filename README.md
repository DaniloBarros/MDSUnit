#Modelo Teste Unitário e Integração

## Estudo de Caso

A Montadora MDS produz quatro modelos de Carro:

Attractive com motor 1.0 e Câmbio Manual
Attractive com motor 1.4 e Câmbio Manual
Sporting com motor 1.6 e Câmbio Manual
Sporting com motor 1.6 e Câmbio Automático


## Para compilar com o Maven

	mvn clean install 


## Para compilar com o Maven e gerar uma saída para o Sonar


	mvn clean install sonar:sonar


## Para testar

	mvn test
