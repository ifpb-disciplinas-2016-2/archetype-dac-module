# Projeto exemplo de Archetype
Este projeto visa criar um projeto corporativo com a estrutura de projetos e dependências necessárias para sua execução.

**Primeiro passo - Baixando o projeto**

Clone o projeto: **`git clone https://github.com/ricardojob/archetype-dac-module.git`**.

Na pasta criada, execute a instalação do Archetype: **mvn clean install**.

**Segundo passo - Criando o projeto**

Em outra pasta do sistema execute o comando:

* `mvn archetype:generate -DarchetypeGroupId=ifpb.job.dac -DarchetypeArtifactId=dac-module-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=**ifpb.dac.stateless** -DartifactId=**stateless-ejb`** 

Os parâmetros groupId=**ifpb.dac.stateless** e artifactId=**stateless-ejb** podem ser substituídos por informações do seu projeto.

**Terceiro passo**

Na estrutura de diretório foi criada uma pasta com o mesmo nome especificado na **artifactId**.

Dentro desta pasta execute o seguinte comando:

* `mvn -DskipTests=true --fail-at-end clean  -amd package install`

