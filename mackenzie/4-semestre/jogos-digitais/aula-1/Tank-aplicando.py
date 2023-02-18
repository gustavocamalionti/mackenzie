import random
import string


class Tank(object):
    def __init__(self, name):
        self.name = name
        self.alive = True
        self.ammo = 5
        self.armor = 40

    def __str__(self):
        if self.alive:
            return "%s (%i armor, %i shells)" % (self.name, self.armor, self.ammo)
        else:
            return "%s (DEADE)" % self.name

    def fire_at(self, enemy):
        if self.ammo >= 1:
            self.ammo -= 1
            print(self.name, "Atacando ", enemy.name)
            enemy.hit()
        else:
            print(self.name, "Não tem munição!")

    def hit(self):
        self.armor -= 20
        print(self.name, "Tomou dano")
        if self.armor <= 0:
            self.explode()

    def explode(self):
        self.alive = False
        print(self.name, "Explodiu!")


# meuTanque = Tank("Bob")
# meuTanque2 = Tank("Jack")
# meuTanque.fire_at(meuTanque2)
# print(meuTanque)
# print(meuTanque2)

start_game = True
alfabeto = list(string.ascii_lowercase)

titulo = 'BATALHA ENTRE TANKS'

while start_game == True:
    print('-=-'*20)
    print(f'{titulo: ^60}')
    print('-=-'*20)

    quantidade_tanques = int(input('Quantidade de tanques: '))
    while (quantidade_tanques <= 0 or quantidade_tanques > 10):
        quantidade_tanques = int(input('Por favor, digite entre 1 até 10: '))

    tanques = dict()
    cont = 0
    print('-=-'*20)

    while (len(tanques) != quantidade_tanques):
        nome_tanque = str(
            input(f'Tank {alfabeto[cont]} | Qual o nome do tanque? ')).strip()
        while nome_tanque == "":
            nome_tanque = str(
                input(f'Tank {alfabeto[cont]} | Por favor, dê um nome ao tanque: '))

        tanques[f'{alfabeto[cont]}'] = Tank(nome_tanque)
        cont += 1
    print('-=-'*20)

    lista_auxiliar = list(tanques.items())
    
    # Sortear tanque atacante e seleciona tank defensor
    while (len(lista_auxiliar) != 1):
        # sorteia tanque atacante
        index_tanque_atacante = random.randint(0, len(lista_auxiliar)-1)

        # seleciona tanque defensor
        opcoes = []
        print(f'{lista_auxiliar[index_tanque_atacante][1].name}, Escolha um jogador para atacar! Suas opções são:' )
        for i in range(0, len(lista_auxiliar)):
            if i == index_tanque_atacante:
                continue
            print(f'Tank | [{lista_auxiliar[i][0]}] - {lista_auxiliar[i][1]}')
            opcoes.append(lista_auxiliar[i][0])

        escolha=""
        while escolha not in opcoes:
            escolha = str(input(f'Por favor, selecione uma opção válida: {opcoes} ')).strip()

        for i in range(0, len(lista_auxiliar)):
            if escolha == lista_auxiliar[i][0]:
                index_tanque_defensor = i

        # tentativa de ataque
        print(f'O tanque "{lista_auxiliar[index_tanque_defensor][0]}" foi ameaçado.')
        lista_auxiliar[index_tanque_atacante][1].fire_at(lista_auxiliar[index_tanque_defensor][1])

        # se o tanque for destruido
        if lista_auxiliar[index_tanque_defensor][1].alive == False:
            lista_auxiliar.pop(index_tanque_defensor)
        print('-=-'*20)

        # CASO ESPECÍFICO - vericar se é possível haver um ganhador pois ambos podem não ter munição
        if len(lista_auxiliar) == 2 and (lista_auxiliar[0][1].ammo < 1 and lista_auxiliar[1][1].ammo < 1):
            print(f'EMPATE! {lista_auxiliar[0][1]} e {lista_auxiliar[1][1]} estão sem munição.')
            exit()
    print('-=-'*20)

    print(f'Winner winner chicken dinner! Vencedor: {lista_auxiliar[0][1]}')
    decisao = ''
    while decisao != 'S' or decisao != 'N':
        decisao = str(input(
            'Quer jogar de novo? [\033[32;40mS\033[m/\033[31;40mN\033[m] ')).strip().upper()
        if decisao == 'N':
            print('END.')
            start_game = False
            break

        elif decisao == 'S':
            break
