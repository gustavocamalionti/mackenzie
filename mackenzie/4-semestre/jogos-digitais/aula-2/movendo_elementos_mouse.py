# importa a biblioteca pygame
import pygame
from pygame.locals import *
from sys import exit

# inicializa os módulos da biblioteca
pygame.init()

# seta o tamanho da janela
screen_size = (800, 600)
screen = pygame.display.set_mode(screen_size, 0, 32)

picture_tank = pygame.image.load('tank.jpg').convert()
picture_tank = pygame.transform.scale(picture_tank, (45, 45))
# picture_tank = pygame.transform.flip(picture_tank,True, False)


x, y = 377, 277
move_x, move_y = 377, 277


while True:
    for event in pygame.event.get():
        # print(event)
        if event.type == QUIT:
            pygame.quit()
            exit()

        if event.type == MOUSEMOTION:
            move_x = event.pos[0] - 23
            move_y = event.pos[1] - 23
        
        x = move_x
        y = move_y

        # troca a cor da janela para branco
        screen.fill((255,255,255))

        screen.blit(picture_tank,(x,y))

        pygame.display.update()