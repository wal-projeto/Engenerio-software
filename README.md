
APRENDENDO GIT:

- Clonando o repositorio do github para o pc atraves da linha de comando do terminal do VS Code
e atraves do git bash
 
 - aprendendo:
  git add . ; 
  git commit -m "nome" ;  
  git pull e 
  git push origin "nome branch"


- git log 
    git log --online
    git log --stat
    git log -p. para sair digitamos q
    git log --author
    git log --grep="texto"
    git log --graph
    git log --author="Nome"
    git log
combinacao:
    git log --online --stat
    git log --graph --online
    git log -p --online
    etc.
git Local x git Remoto:
    * HEAD main(Minha máquina)  * origin/main (GitHub)


- git Revert:
    git checkout "nome do comite"
    git checkout "branch"
    git revert
    git reset

-BRANCHS:
    git checkout "nome da branch"
    git checkout -b "nome da branch"
    git branch -d "nome da branch"
    git branch -D "nome da branch"
