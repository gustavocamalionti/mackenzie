# Exercício 2: Elabore um programa em Python que leia um número inteiro e positivo, calcule e apresente os divisores deste número, separados por um espaço em branco. 

# O valor de entrada dever ser validado, pois o programa somente aceitará números positivos. Caso o valor de entrada esteja fora do intervalo, o programa emitirá a mensagem VALOR INVÁLIDO e solicitará a entrada desse dado até que ela seja válida. 

# A saída de dados serão os divisores do número de entrada, apresentados um ao lado do outro, separados por um espaço, conforme caso de teste. 

n = -1 

while n <= 0:
    n = int(input(''))
    if n<= 0:
        print('VALOR INVÁLIDO')

    else:
        for c in range(1, n+1):
            if n%c == 0: 
                print(f'{c}', end = " ")
        break
