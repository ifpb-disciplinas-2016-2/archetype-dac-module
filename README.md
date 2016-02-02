# Projeto exemplo de Archetype
Este projeto visa criar um projeto corporativo com a estrutura de projetos e dependências necessárias para sua execução.

##Primeiro passo - Criando o projeto
mvn archetype:generate -DarchetypeGroupId=ifpb.job.dac -DarchetypeArtifactId=dac-module-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=ifpb.dac.stateless -DartifactId=stateless-ejb

##Segundo passo
Na estrutura de diretorio foi criada uma pasta com o mesmo nome especificado na artifactId.
Dentro desta pasta execute o seguinte comando
mvn -DskipTests=true --fail-at-end clean  -amd package install

