CURSO DE GIT REVERT

Arquivo Conteudo - imagem dos temas que serao estudados

Arquivo Git checkout - imagem que permite que navegemos entre os commits e branchs


Introdução
O Git é uma ferramenta poderosa de controle de versão que permite navegar entre diferentes versões do código, chamadas de commits.

Nesta transcrição, são abordados três comandos principais para navegar entre commits no Git:

Git Checkout
Git Revert
Git Reset
Entender esses comandos é essencial para aproveitar todo o potencial do Git e do controle de versão.

PARA PRATICAR VAMOS DAR OS SEGUINTES COMANDOS:
- git log --online  -> para visualizar Todos comites que são identificados por numeros;
- git checkout "numero do commit" -> ele se deprende de todos os comites e fica na tela so com o commit selecionado;
- git log --oneline -> com esse comando posso visualizar so ficou o commit selecionado por mim atraves do git checkout;

- git checkout main -> Se quero que volte a aparecer todos os commits novamente;

DIFERENCA ENTRE GIT REVERT  E GIT RESET
arquivo Diferenca git Rever e git Reset.jpg 

git revert "numero do comite que deseja voltar"

O git revert 
Deve ser o comando preferido ao invés do git reset na maioria dos casos, pois previne a perda de trabalho já realizado.
Deve ser utilizado quando Deseja desfazer mudanças de um commit, mas quer manter um histórico do que considerou errado e apagou, assim que esse comite fica registrado na linha do tempo

Git Reset
O comando git reset também desfaz alterações, mas de modo mais drástico: ele remove completamente um ou mais commits do histórico, apagando esses comites da linha do tempo

comeco dando um 
git log --online -> para ver toda a minha arvore de comites;

git revert "numero do comite" -> estou selecionando o comite onde quero voltar (SERA ABERTO UMA JANELA, PARA SAIR DIGITO: :wq)

- dou um git log --online -> posso observar que ele voltou ao comite desejado , mas manteve na arvore o comite velho na linha do tempo

- JA O git reset eu vou voltar a um commit desejado, mas apaga todos os comites que estiver na frente dele.

- agora eu dou um git push origin main -- force  para forcar a atualizacao la no GitHub com esse comites atualizados.

CONCLUSAO:
é preferivel utilizar o revert pois mantem os comites antigos 

---------    --------    ------ 


BRANCHES -  PASSOS PARA APRENDER:
arquivos : BRANCHs_Criacao.jpg   e  BRANCH-COMANDO DE CRIACAO.jpg

- git branch -> visualizo as branchs existentes:
* main

- git branch header -> estou criando uma nova branch chamada hader

- git branch -> vou visualizar as duas branchs existentes: ao criar ela eu nao vau para a branch header, o asteristico mostra que estamos na branch principal main:

VISUALIZACAO DO TERMINAL:
header
* main

NO GIT GRAPH VISUALIZAMOS AS DUAS BRNCHs:

- main/origin       header

- git checkout "nome-da-branch"   ->>> navegamos entra as branches, sendo necessario dar um git checkout para 
ir até ela.

- git checkou -b "nome-da-branch"   ->>> CRIAMOS e já NAVEGAMOS DIRETAMENTE na branches criada, nao sendo necessario dar um git checkout para ir até ela.