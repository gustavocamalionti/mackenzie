# Exercício 1: Escreva um programa em Python que leia um número inteiro, entre 0 e 10, e mostre a tabuada deste número multiplicado de 1 até 10. 

 

# O valor de entrada dever ser validado, pois o programa somente aceitará números entre 0 e 10 (inclusive). Caso o valor de entrada esteja fora do intervalo, o programa emitirá a mensagem VALOR INVÁLIDO e solicitará a entrada desse dado até que ela seja válida. 

 

# Com a entrada de dados válida, o programa mostrará a tabuada do número digitado no formato do caso de teste. 




n = -1
while n < 0 or n > 10:
    n = int(input('Digite um número inteiro entre 0 e 10: '))
    if n < 0 or n > 10:
        print('Por favor, digite um valor entre 0 e 10!. ')

    else:
        tabuada = f'Tabuada do {n}'
        print('-='*30)
        print(f'{tabuada:^60}')
        print('-='*30)
        for c in range(0,11):
            resultado_multiplicacao = n*c
            print(f'{n} x {c} = {resultado_multiplicacao}')
            



