#EXER1
nomes = ["Maria", "Pedro", "João"]
for x in nomes:  
    print(x)

#EXER2
for k in range(0,4,-1):
    print(k)

#EXER3
def e(b):
    a = b*b
    return a

#EXER4
a = 10
e(a)
e(a)
print(e(a))

#EXER5
cont = 1
res = 0
x = 2
n = 4
while cont >= n:
    res*=res
    cont += 1
    print(res)
print(res)

#EXER6
titulo = 'EXERCÍCIO 6'
print(f'{titulo:^30}')
s = 0
c = 1
while c < 7:
    s = s + c
    c = c + 1
print(s)