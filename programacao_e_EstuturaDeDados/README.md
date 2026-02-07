CURSO DE PROGRAMACAO E ESTRUTURA DE DADOS

A Importância da Precisão nos Algoritmos:
    Detalhamento minucioso: Cada passo do algoritmo deve ser detalhado de forma extremamente precisa. Não podemos deixar nada implícito ou assumir que o computador "entenderá" o que queremos dizer.

    Eliminação de ambiguidades: As instruções devem ser claras e não ambíguas. Qualquer possibilidade de interpretação dupla pode levar a resultados inesperados ou erros.

    Consideração de todos os cenários: É necessário pensar em todas as possíveis situações e fornecer instruções para cada uma delas. O computador não vai "adivinhar" o que fazer em uma situação não prevista.

Implicações para o Desenvolvimento de Software.  A necessidade de precisão nos algoritmos tem implicações significativas para o desenvolvimento de software:

    Tempo de desenvolvimento: A necessidade de detalhar cada passo pode tornar o processo de desenvolvimento mais demorado, especialmente em sistemas complexos.

    Debugging: Erros sutis podem ocorrer devido à falta de precisão, tornando o processo de debugging (depuração) mais desafiador.

    Manutenção: Algoritmos precisos e bem documentados são mais fáceis de manter e atualizar no futuro.

    Escalabilidade: À medida que os sistemas crescem em complexidade, a precisão torna-se ainda mais crucial para garantir que todas as partes do sistema funcionem corretamente juntas.

    Eficiência: Algoritmos precisos e bem pensados geralmente levam a programas mais eficientes, pois eliminam operações desnecessárias ou redundantes.

Estratégias para Aumentar a Precisão. Para desenvolver algoritmos mais precisos, considere as seguintes estratégias:

Pensar como um computador: Tente visualizar cada passo do algoritmo da perspectiva de uma máquina que segue instruções literalmente.

Usar pseudocódigo: Antes de começar a codificar, escreva o algoritmo em linguagem natural, mas de forma estruturada. Isso pode ajudar a identificar lacunas na lógica.

Testar casos extremos: Pense em situações incomuns ou extremas e certifique-se de que seu algoritmo as trata adequadamente.

Revisão por pares: Peça a outros programadores para revisar seu algoritmo. Eles podem identificar suposições implícitas que você não percebeu.

Documentação detalhada: Documente não apenas o que o algoritmo faz, mas também por que cada passo é necessário. Isso pode ajudar a identificar etapas supérfluas ou faltantes.

A precisão nos algoritmos é um skill fundamental para qualquer programador. Ela não apenas leva a um código mais robusto e confiável, mas também ajuda a desenvolver um modo de pensar que é valioso em muitas áreas além da programação. Ao praticar a criação de algoritmos precisos, você está desenvolvendo uma habilidade que será crucial ao longo de toda a sua carreira na área de tecnologia.


Representação de Algoritmos
A representação de algoritmos é uma parte crucial do processo de desenvolvimento de software. Existem várias maneiras de representar algoritmos, cada uma com suas próprias vantagens e aplicações. Vamos explorar algumas das formas mais comuns de representação de algoritmos:

1. Código
O código é a forma mais direta e precisa de representar um algoritmo. Ele é escrito em uma linguagem de programação específica e pode ser executado diretamente por um computador.

    Vantagens:
    Precisão: O código deixa pouco espaço para ambiguidade.
    Executável: Pode ser testado e executado diretamente.
    Detalhado: Permite a implementação de lógicas complexas.

    Desvantagens:
    Pode ser difícil de entender para não programadores.
    Específico para uma linguagem de programação.

    Exemplo em Python:
    def calcular_media(notas): 
        soma = 0 
        for nota in notas: 
            soma += nota 
            media = soma / len(notas) 
            return media notas = [7, 8, 9, 6, 8] 
    resultado = calcular_media(notas) 
    print(f"A média das notas é: {resultado}")

2. Fluxograma
Um fluxograma é uma representação gráfica de um algoritmo. Ele usa símbolos diferentes para representar diferentes tipos de operações e setas para mostrar o fluxo de execução.

    Vantagens:
    Visual: Fácil de entender, mesmo para não programadores.
    Visão geral: Fornece uma visão clara do fluxo do algoritmo.
    Independente de linguagem: Não está vinculado a nenhuma linguagem de programação específica.
    
    Desvantagens:
    Pode se tornar complicado para algoritmos muito complexos.
    Não é diretamente executável.
    Exemplo:

    [Início] -> 
        [Entrada: notas] -> 
        [Inicializar soma = 0] -> 
        [Para cada nota] -> [Adicionar nota à soma] -> 
        [Calcular média = soma / número de notas] -> 
        [Exibir média] -> [Fim]

3. Pseudocódigo
O pseudocódigo é uma descrição informal de alto nível de um algoritmo. Ele usa as convenções estruturais de uma linguagem de programação, mas é projetado para leitura humana em vez de leitura por máquina.

    - Um exemplo de pseudocodico é o Portugol. Ferramenta ideal para aprender algoritmo é o:
     https://portugol.dev/  (open source: o codigo-fonte é disponibilizado publicamente, permitindo uso, modificação e distribuicao por qualquer pessoa)
    EXEMPLO DE UM PSEUDOCODIGO : arquivo EXEMPLO_PSEUDOCOGIGO.txt

TIPOS DE DADOS: 
    inteiro, real, caracter, const , cadeia e logico

COMANDO DE ENTRADA E SAIDA: 
    leia(), escreva() 

OPERADORES ARITMETICOS:
    + (7+2 = 9)
    - (7+2 = 5)
    * (7*2 = 14)
    / (7/2 = 3.5) 
    % (7%2 = 1) resto da divisão

    + pode fazer a CONCATENAÇÃO/JUNÇÃO de CADEIA
        cadeia nome = "walquiria"
        escreva("Meu nome é " + nome + "\n")
    
    Em python * multiplica uma CADEIA
        print('Ola'  *  4)
        Ola Ola Ola Ola
    
    A ordem geral de precedência é:
        Parênteses ()
        Potenciação (**)
        Multiplicação (*), Divisão (/), Divisão Inteira (//), Módulo (%)
        Adição (+), Subtração (-)
        Operadores de comparação (<, >, <=, >=, ==, !=)
        Operadores lógicos (not, and, or)
        
        7 + 2 * 4  é diferente de (7 + 2) * 4

    Operador de Atribuição (=)
    Operador de Igualdade (==)
    Operador de Diferença (!=)
    Operadores de Comparação (>, <, >=, <=)
    Potenciação (**)
    Divisão Inteira (//)
    Operadores de Atribuição Composta:
    Existem operadores que combinam uma operação aritmética com atribuição. Eles são úteis para atualizar o valor de uma variável baseado em seu valor atual. Alguns exemplos:

        += (adição e atribuição)
        -= (subtração e atribuição)
        *= (multiplicação e atribuição)
        /= (divisão e atribuição)

    Comparação de Strings:
        if "maçã" < "banana": 
        print("maçã vem antes de banana no dicionário")

    AGORA VAMOS COMECAR A PROGRAMAR EM JAVA COM EXERCICIOS SIMPLES:

    - exercicio_java_metros.java
    - exercicio_java_valorPoupanca.java

    OPERADORES CONDICIONAIS -> FLUXOGRAMA(ALGORITIMO)
     - se, senao se, escolha(caso 1, caso 1 , caso contrario)
     - comparadores == , != , > , >= , < , <=
     - Múltiplas condições - Operadores Lógicos se(True) E (True) / se (True) OU (False)
     - Tabela verdade A B  / A E B / A OU B / não A / não B


    LACO DE REPETICAO:
    - While(True)  executa codigo enquanto a condição for verdadeira - condição definida- Não sabemos quantas vezes se repetira o laco e estamos aguardando algo ser verdadeiro

    - For (executa codigo enquanto a condicão for verdadeira) - repetições definidas-quando sabemos quantas vezes vamos ter que repetir o código

    - Do (executa o codigo dentro do laça) Enquanto(a condição for verdadeira)