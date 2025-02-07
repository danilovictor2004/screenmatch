# ScreenMatch - Projeto Prático de Orientação a Objetos com Java

Bem-vindo ao repositório do **ScreenMatch**, um projeto desenvolvido para colocar em prática conceitos fundamentais de **Orientação a Objetos** com Java. Neste projeto, implementei conceitos como **herança**, **polimorfismo**, **interfaces**, **abstração**, **modificadores de acesso** e **construtores**, tudo dentro de um sistema de gestão de filmes, séries e avaliações.

## Funcionalidades

- **Cadastro de Filmes:** Registro de filmes com título, duracao, ano e descrição.
- **Avaliação de Filmes:** Possibilidade de atribuir avaliações a filmes e visualização das médias.
- **Filtragem de Filmes:** Exibição de filmes baseados em categorias específicas.
- **Listagem de Filmes:** Geração de listas dinâmicas de filmes, permitindo uma navegação intuitiva.

## Conceitos de Orientação a Objetos Utilizados

### 1. **Herança**
Através da herança, classes como `Filme` e `Serie` compartilham atributos e métodos, permitindo a reutilização de código e a criação de especializações para cada tipo de mídia.

### 2. **Polimorfismo**
O polimorfismo foi aplicado ao permitir que diferentes tipos de mídias (filmes e séries) fossem tratados de forma uniforme, utilizando a sobrecarga de métodos e interfaces.

### 3. **Interfaces**
Interfaces foram usadas para garantir que diferentes classes implementassem comportamentos comuns, como a interface `Avaliar` para classes que requerem uma avaliação.

### 4. **Abstração**
Classes abstratas, como `Midia`, foram utilizadas para definir características gerais de mídias sem necessidade de implementação concreta, sendo as subclasses responsáveis por concretizar os métodos.

### 5. **Modificadores de Acesso**
O uso de modificadores de acesso como `private`, `protected` e `public` foi crucial para garantir o encapsulamento e a proteção dos dados sensíveis, permitindo um controle mais seguro sobre o comportamento do sistema.

### 6. **Construtores**
Construtores foram usados para inicializar objetos com valores padrão e garantir que os dados necessários estivessem disponíveis logo após a criação de instâncias das classes.

## Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Java**: A linguagem de programação principal utilizada para o desenvolvimento do projeto.
- **IDE**: O projeto foi desenvolvido nas IDEs IntelliJ IDEA, proporcionando um ambiente de desenvolvimento completo.
- **Git**: Utilizado para controle de versão, garantindo um histórico seguro e colaborativo para o projeto.
