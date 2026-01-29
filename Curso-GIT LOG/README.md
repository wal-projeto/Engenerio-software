"#repositorio-teste" 
2 MANEIRAS MANEIRA DE CLONAR O REPOSITORIO DO GITHUB PARA A MAQUINA E ATUALIZAR-LO LA NO GIT:
<br>
criando um novo repositório atraves da "LINHA DE COMANDO" ABRINDO UM TERMINAL NO VSCODE.
<br>

primeiro crio uma pasta no meu diretorio preferido, que nesse caso chamei de REPOSITORIO-TESTE , e abro aqui no <br>
VSCode ela, depois abro um terminal estando nala e crio o arquivo readme.md atraves desse comando:
->>>  echo "# repositorio-teste" >> README.md <br>

Logo escrevo o comando:
->>> git init <br>
digitamos esse comando para inicializar esse repositorio no git, depois desse comando podemos verificar que na <br>
pasta do repositorio aparecera outra chamada  ".git "(arquivo que detem todas as configuraçoes na nossa maquina) <br>
<br>

Logo escrevemo o comando:
-->>>  git add README.md  ou  git add . <br>
com esse comando adicionamos o arquivo readme.md na area de stage para ser comitado no seguinte passo. Para adicionar
todos os arquivos de uma so vez digitamos-> git add .

<br>
Logo escrevemos :
-->>>  git commit -m "meu primeiro commit"  <br>
agora estamos comitando pela primeira vez e colocando um nome no commit. Aparecera essa mensagem :
<br>
[master (root-commit) 833f73f] primeiro commit adicionando o arq read.me
 1 file changed, 1 insertion(+)
 create mode 100644 README.md


<br>
lo escrevemos :
->>>>   git branch -M main  <br>
aqui ele diz que criemos uma branch chamada main. Para saber em qual branch estamos, digitamos git status:
essa mensagem do terminal significa que estamos na nossa branch chamada master:
<br>
[master (root-commit) 833f73f] primeiro commit adicionando o arq read.me
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

<br>

logo digitamos:
->>> git remote add origin https://github.com/wal-projeto/repositorio-para-teste.git (copiamos a https la no github)
<br> 
com esse comando estamos linkando esse repositorio local criado no computador(repositorio-teste) com o repositorio remoto la do github atreves dessa URL acima que pegamos la no GitHub em <>codigo -> Clone-> HTTPS


-->>> git push -u origin main<br>
 com esse comando carregamos os aquivos do repositorio da maquina para o repositorio do github(que de momento so tehno o arquivo readme.md)
 <br>
APARECERA ESSA MENSAGEM:
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 250 bytes | 125.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/wal-projeto/repositorio-para-teste.git
 * [new branch]      master -> master
<BR>

COM ISSO NOSSO REPOSTITORIO FOI CARREGADA PARA O GITHUB

<BR>

SE EU ESTIVER EM UM PROJETO COM MAIS PESSOAS LÁ NO GITHUB é IMPORTANTE ANTES DO PUSH, FAZER UM: 
->>> PULL ORIGIN MASTER

POIS ASSIM  ATUALIZAMOS O REPOSITORIO LOCAL COM AS ALTERACOES MAIS RECENTES DO REPOSITORIO REMOTO DO GITHUB . É <br> feito um fetch das atualizacoes no repositorio remoto e em seguida faz um merge com a branch atual do repositorio <br> local, incorporando as alteracoes realizadas pelos demais colaboradores.
APARECERA UMA MENSAGEM NO TERMINAL ASSIM:
* branch   master   -> FETCH_HEAD
Already up to date.
<br>

E DEPOIS JÁ POSSO FAZER O MEU (PUSH) E SUBIR AS MINHAS ALTERACOES NO PROJETO LA NO GITHUB<br>

<br> 



SEGUNDA MANEIRA DE CLONAR O REPOSITORIO DO GITHUB PARA A MAQUINA E ATUALIZAR-LO LA NO GIT:
<br>

UTILIZANDO O GIT BASH:

<BR>
- Primeiro crio um novo repositorio no GitHub, que nesse caso chamei de repositório-para-teste e selecione que ele
crie junto um arquivo README.MD (é um arquivo de documentacao padrao necessario para descrever sobre o repositorio)

-Abro o Git Bash dentro de uma pasta no windows onde quero clonar o repositorio remoto do github para dentro dela<br>
botao direito na pasta e clicamos em " Open Git Bash here", ou seja, ele abre o terminal do git dentro da pasta
- Para clonar o repositorio do GitHub para meu computador, dentro do terminal do Bash digito: 
->   git clone https://github.com/wal-projeto/repositorio-para-teste.git <br>

Para obter esse https, entro no repositorio repositório-para-teste la no github, em  <> codigo -> clone - copio o https que no caso é o https://github.com/wal-projeto/repositorio-para-teste.git e colo no prompt de comando do bash <br>

- Agora, se eu entrar na pasta no windows D:\curso PLATAFORMA DNS\FORMACAO ARQUITETO DE SOFTWARE ja poderei ver a pasta  "repositorio-para-teste" que é o repositorio remoto clonado. E dentro dela encontramos o aquivo .git com todas as configurações do git e o arquivo readme.md

OBS: posso fazer esse processo do git clone dentro do meu VSCode(abro um terminal, com o comando "cd entro na pasta
que desejo clonar) e depois git clone https://github.com/wal-projeto/repositorio-para-teste.git <br>, depois é só
abrir a pasta e ja terei acesso ao arquivo read.md

-agora ja posso fazer qualquer alteração no arquivo read.md do repositorio local e seguir com os comandos abaixo para atualizar o repositorio remoto do GitHub:

git add .
git commit -m "nome do comite" (pode ser que depois desse comando ele peça o git config --global user.email "" e o user.name)
git push origin main (com isso as alterações ja estarão no GitHub )


AGORA VAMOS SABER SOBRE O GIT LOG: 
arquivos jpg : 
GitLog - descricao dos comandos;

GitLog_comando q - mostra o historico de acoes realizadas no repositorio com Posicao Atual, Autor e data, Mensagem do commit e Identificacao do commit; 

GitLog_depois de um git push - a imagem descreve que  no HEAD ->main (respositorio local) fizemos um commit , e que no repositorio remoto  HEAD -> main, origin/mai, esse commit esta 
atualizado

GitLog remoto nao esta atualizado1 - a imagem mostra que fiz 2
commit no repositorio local:
 Adicionando sobrenome no arquivo1 (HEAD -> main) 
 Adicionando outro arquivo"  (HEAD -> main) 

O git log serve para mostrar Ao fazer um que tenho esses 2 commits e que eles estão a frente do ultimo commit remoto no gitHub (origin/main) "Adicionando o arquivo1 com meu primeiro nome" 

Depois é feito um git push para atualizar o Github 

GitLod- Repositorio remoto ATUALIZADO - 
a imagem mostra depois do comando git log que, os 3 comites ja estão atualizados no repositorio remoto, no GitHub:

(HEAD -> main, origin/mai) 

isso significa que os 2 repositorio estao iguais, estao com os mesmos comites.


Git log--online -  Exibe o histórico resumido, com cada commit em uma única linha

Git log--stat - Exibe estatísticas de alteração por arquivo em cada commit

OBS: eu posso combinar os dois comandos:
 git log --online --stat

git log -p - Exibe o diff, as linhas exatas que foram adicionadas ou removidas em cada arquivo de cada commit:. para sair dos logs clico na letra "q"

git log --author="Nome" - pesquiso na linha do tempo atraves de um autor de algum comit, e ele lista o que busquei, ou seja, Filtra o histórico somente por commits de um determinado autor

git log--grep="texto" - pesquiso atraves de uma linha do tempo de algum texto de um comite, ele listara so os comites que tenha o texto buscado, ou seja, Busca por commits que possuam um determinado texto na mensagem

git log --graph -  exibe todos os comites com uma linha do 
tempo para melhor entendimento

Git Log - Conclusao - a imagem mostra quando um comite esta a frente de outro

PODEMOS COMBINAR OS LOGs:
Git log --graph --online - 

git log --graph --online - 

git log -p --online - 



O que é Git Log e sua importância
O Git log permite visualizar o histórico de commits de um repositório Git. Cada commit representa uma alteração realizada nos arquivos, registrando informações como:

Identificação única do commit (hash)
Autor
Data
Mensagem
Modificações realizadas

Alguns motivos para utilizar o Git log:
Entender a evolução do projeto ao longo do tempo
Saber quem fez cada alteração e quando
Encontrar um estado anterior desejado
Reverter commits problemáticos
Comparar mudanças entre versões
Solucionar conflitos
O Git log registra todas as alterações realizadas no repositório. É uma ferramenta indispensável para ter controle e trabalhar com o versionamento.


git log  mostrará as seguintes informações:
hash: identificação única do commit
Author: autor do commit
Date: data que o commit foi realizado
Commit message: mensagem do commit

--  ----- ------- ---- 
Git Log: Local x Remoto

O Git log mostra onde o repositório está tanto localmente quando no servidor remoto. 
Isso é indicado pelos ponteiros HEAD (local) e origin/main (remoto).

Exemplo:
* HEAD -> main (Minha máquina) * origin/main (GitHub) : ->>> PODEMOS OBSERVAR QUE O HEAD E O ORIGIN FICAM NA LISMA LINHA DO TEMPO
commit f5d83fd39a7b103c0b7e2eb3984c4c0252aa3c7c 
Author: João Silva

Neste caso, o repositório local e remoto estão sincronizados no mesmo commit.


MAS e se eu commitar localmente e não enviar para o GitHub como fica a mensagem?
Exemplo: 

commit b7d83fd39a7b103c0b7e2eb3984c4c0252aa3c7d - Local : HEAD -> main (Minha máquina) ->>> HEAD EM UM LINHA DO TEMPO 
Author: João Silva 

commit f5d83fd39a7b103c0b7e2eb3984c4c0252aa3c7c - Remoto: origin/main (GitHub) ->> E o ORIGIN EM UMA LINHAS DO TEMPO DISTINTA.
Author: João Silva

Agora existe um novo commit local que ainda não foi enviado remotamente. O Git log sinaliza isso visualmente no histórico.