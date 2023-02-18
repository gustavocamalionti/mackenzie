import random

class Tank(object):
    def __init__(self, name):
        self.name = name
        self.alive = True
        self.ammo = 5
        self.armor = 60

    def __str__(self):
        if self.alive:
            return "%s (%i armor, %i shells)" % (self.name, self.armor, self.ammo)
        else:
            return "%s (DEADE)" % self.name

    def fire_at(self, enemy):
        if self.ammo >= 1:
            self.ammo -= 1
            print(self.name, "fires on", enemy.name)
            enemy.hit()
        else:
            print(self.name, "has no shells!")

    def hit(self):
        self.armor -= 20
        print(self.name, "is hit")
        if self.armor <= 0:
            self.explode()

    def explode(self):
        self.alive = False
        print(self.name, "explodes!")


# meuTanque = Tank("Bob")
# meuTanque2 = Tank("Jack")
# meuTanque.fire_at(meuTanque2)
# print(meuTanque)
# print(meuTanque2)

tanques = [
    Tank("Romeu"),
    Tank("Julieta"),
    Tank("Magô"),
    Tank("jhene"),
    Tank("Mackenzi")
]


# Sortear tanque atacante e tank defensor
while (len(tanques) != 1):
    

    # seleciona tanque atacante
    index_tanque_atacante = random.randint(0, len(tanques)-1)

    # seleciona tanque defensor
    index_tanque_defensor =  random.randint(0, len(tanques)-1)

    # quando o tanque defensor é igual ao tanque atacante, faremos um novos sorteios até não ser mais, quantas vezes for necessário.
    while index_tanque_atacante == index_tanque_defensor:
        index_tanque_defensor =  random.randint(0, len(tanques)-1)

    # tentativa de ataque
    print(f'O tanque "{tanques[index_tanque_defensor]}" foi ameaçado.')
    tanques[index_tanque_atacante].fire_at(tanques[index_tanque_defensor])
    

    # se o tanque for destruido
    if tanques[index_tanque_defensor].alive == False:
        tanques.pop(index_tanque_defensor)
    print('-=-'*20)

    #CASO ESPECÍFICO - vericar se é possível haver um ganhador pois ambos podem não ter munição
    if len(tanques) == 2 and (tanques[0].ammo < 1 and tanques[1].ammo < 1):
        print(f'EMPATE! {tanques[0]} e {tanques[1]} estão sem munição.')
        exit()
        
print(f'Winner winner chicken dinner! Vencedor: {tanques[0]}')