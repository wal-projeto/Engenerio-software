# ESTRUTURA DE DADOS -->>  APRENDENDO SOBRE LISTAS - PILHAS - FILAS

LISTAS -  ARRAY - VETOR :

    - É UMA VARIAVEL QUE POSSUI DIVERSAS POSIÇÕES, E COM ISSO ARMAZENA DIVERSOS
VALORES, TODOS DO MESMO TIPO

    - DECLARACAO:
    funcao inicio() {
    inteiro vetor[5]
    caracter vetor1[200]
    }
    //vetor inicializados:
    real vetor2[2] = {1.4 , 2.5}
    logico vetor3[4] = {verdadeiro, falso, verdadeiro, verdadeiro}
    cadeia vetor5[] = {"Questão" , "Fundamental"}
    // Mudando o valor do vetor5 na posição 0 de "Questão" para "Pergunda"
    vetor5[0] = "Pergunta"

    - OPERAÇÕES COM ARRAY:
    Insert(inserir)
    Delete(excluir)
    Get(receber)
    Size(tamanho)

    PILHAS : O COMPUTADOR TEM UMA PILHA DE EXECUCAO, ENTAO ELE ARMAZENA OS ESTADOS, E DANDO CTROL + Z, 
    VC DESEMPILHA AS ACOES, OU SEJA, VOLTA ATRAS AS ACOES.
    - LIFO : LAST IN, FIRST OUT (O ULTIMO A ENTRAR É O PRIMEIRO A SAIR)
    - TOPO -> O ULTIMO DA PILHA
    - OPERACÕES COM PILH:
        PUSH (empilhar)
        POP (desempilhar)
        isEmpty(éVazio?)
        Top (topo)

    FUNCÕES: OTIMIZA AS ROTINAS REPETITIVAS, OU SEJA, QUANDO PRECISAMOS QUE UM TRECHO DE CODIGO SEJA 
    REPETIDO EM DIFERENTES LUGARES NO NOSSO ALGORITMO, PARA EVITAR REPETIÇÃO
    funcao tipo_retorno nome_da_funcao(parametros) {
        Execução
    }

    EXEMPLO:
    funcao vazio imprime_linha()
    {
        escreva("\n--------------------------\n")

    }


    FILHA : SEQUENCIA QUE SE JUNTA NA FILHA PELO FINAL. QUEUE
    FIFO -> fIRST IN, fIRST OUT ( o primeiro a entar é o primeiro a sair)
    Enqueue (enfileirar)
    Dequeue(desenfilerar)
    IsEmpyty(éVazio)
    Top(topo)
    
    - ALGORITMO DE BUSCA: SO FUNCIONA SE A BASE ESTIVER ORDENADA.
    BUSCA BINARIA -> MECANISMO QUE DIVIDE EM 2 PARTES E ELIMINA UMA DELAS E VOLTA A DIVIDIR, ATE CHEGAR.

    ALGORITMOS DE ORDENACAO: 
    SELECTION SORT
    QUICK SORT (MUITO BOM)
    BUCKET SORT
    BUBBLE SORT
    HEARP SORT
    COUNTING SORT
    INSERTION SORT
    REDIX SORT
    MERGE SORT (MUITO BOM)
