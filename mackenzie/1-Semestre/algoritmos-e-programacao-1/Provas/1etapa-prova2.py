#EXER1
titulo = ' EXERCÍCIO 1 '
print(f'{titulo:-^30}')
nomes = ["Maria", "Pedro", "João"]
for x in nomes:  
    print(x)

#EXER2
titulo = ' EXERCÍCIO 2 '
print(f'{titulo:-^30}')
for k in range(0,4,-1):
    print(k)

#EXER3
titulo = ' EXERCÍCIO 3 '
print(f'{titulo:-^30}')
def e(b):
    a = b*b
    return a
a = 10
e(a)
e(a)
print(e(a))

#EXER4
titulo = ' EXERCÍCIO 4 '
print(f'{titulo:-^30}')
cont = 1
res = 0
x = 2
n = 4
while cont >= n:
    res*=res
    cont += 1
    print(res)
print(res)

#EXER5
titulo = ' EXERCÍCIO 5 '
print(f'{titulo:-^30}')
s = 0
c = 1
while c < 7:
    s = s + c
    c = c + 1
print(s)

S=0
for C in range (1,7):
    S += C
print(S)

#EXER6
#Escreva em Python uma função areaDeCirculo(r) que retorna a área de um círculo de raio r. 
#Faça a entrada e a saída dos dados.
def areaDeCirculo(r):
    area = (3.14)*r**2
    return area

raio = int(input("Digite o valor do raio: ").strip())
print(f'A área do círculo de raio {raio} vale: {areaDeCirculo(raio)}m²')