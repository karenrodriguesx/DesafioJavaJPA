# CRUD utilizando Hibernate + JPA <img align="center" alt="Karen-php" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg"><img align="center" alt="Karen-php" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-plain.svg"><img align="center" alt="Karen-php" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-plain.svg">

- Este projeto teve origem a partir de outro projeto, [disponível neste link](https://github.com/karenrodriguesx/desafioJava)
- O projeto anterior, feito inteiramente JDBC, foi refatorado para Hibernate + JPA, e continua com as mesmas funções e o mesmo Front-End
- O banco de dados utilizado é o PostgreSQL, que está rodando através do Docker, sendo necessário utilizar o comando ```docker-compose up``` para que o banco de dados funcione 
- Na página inicial, pode ser feito um novo cadastro, informando o nome, profissão e idade
- Além disso, o botão "Listar" direciona à página de lista com todos os usuários cadastrados
- Na página de lista, há a opção de excluir ou editar um usuário, e ao final da página, a opção de inserir um novo cadastro.
- A página de cadastro é acessada através da URL http://localhost:8080/desafioJava/cadastro.jsp, sendo necessário instalar e configurar o Apache TomCat para rodar o projeto

  <img width="503" alt="image" src="https://github.com/karenrodriguesx/desafioJava/assets/97055846/8150399e-6c64-47c1-a5d8-730a6ba508b2">


- A página de lista é acessada através da URL http://localhost:8080/desafioJava/listaUsuarios

  <img width="611" alt="image" src="https://github.com/karenrodriguesx/desafioJava/assets/97055846/2a569586-6c51-4301-b241-833cf7708aab">

- Ao clicar no ícone de excluir, o sistema retorna uma confirmação em JavaScript, validando se realmente deseja excluir o usuário

  <img width="373" alt="image" src="https://github.com/karenrodriguesx/desafioJava/assets/97055846/e166671e-8175-41f1-8249-c2d0d9fc1e25">

- Clicando em OK, o usuário é excluído, e é exibida a lista atualizada de usuários.
- Ao clicar no ícone de editar, o usuário é direcionado a uma página semelhante a de cadastro, com os dados do usuário selecionado, disponíveis para edição
  
  <img width="447" alt="image" src="https://github.com/karenrodriguesx/desafioJava/assets/97055846/a82bdd76-e37f-4702-af8e-7f26b57d5de9">

- Após editar os dados desejados, novamente será exibida a lista atualizada de usuários

