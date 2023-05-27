# testesb
Teste Spring Boot

# Repositório da aplicação
1. Criar um repositório para os testes de Spring Boot.

https://github.com/armandossrecife/testesb

# Projeto no Code Space
2. Criar um projeto no Code Space do repositório testesb

# Configurar o VSCode para Java
3. Configurar o VSCode para o ambiente Java e Spring Boot. (Extension Pack for Java)

versão do java - openjdk 17.0.7 2023-04-18 LTS

# Criar projeto Spring Boot

4. Comece criando um novo projeto Spring Boot usando o Spring Initializr (https://start.spring.io/).

4.1 Selecione as dependências necessárias: Spring Web, Spring Data JPA, Thymeleaf e H2.
Faça o download do projeto gerado e importe-o em sua IDE de desenvolvimento.

# Descompacte o .zip para o repositório

# Criar classe para atender as requisições 

Crie uma classe controller com a anotação @RestController

# Preparação e execução usando Maven 
Rode os seguintes comando via maven:
- mvn clean dependency:tree
- mvn clean compile
- mvn spring-boot:run

# Compatibilidade entre as versões do java, maven e spring-boot
A última versão estável foi testada com o JDK 17 e Spring-Boot 3.1.0

Para o JDK 11, deve-se usar o Spring-Boot 2.5.2

No caso de erro: "package jakarta.persistence does not exist" é preciso substituir o por javax.persistence