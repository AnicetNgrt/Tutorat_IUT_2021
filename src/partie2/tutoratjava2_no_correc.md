# Tutorat Info 2021 - JAVA

# 2 - Exemple de modélisation Objet
Markus Person a encore besoin de vous ! Saurez-vous l'aider à créer Minecraft en Java ? (Comment ça c'est la même chose que la dernière fois ?)

## Exercice 1 - Entités
![plato's atoms](https://1.bp.blogspot.com/--fQPUdbjzAU/X1dV6U66cUI/AAAAAAAAQLM/StVbhOnjdiIpCaPIMePyfX8uFGJq7ZnmgCLcBGAsYHQ/s1600/Elements%2B-%2BPlatonic%2Bsolids.jpg)

Minecraft est composé d'entités. Une entité c'est n'importe quelle chose qu'on peut trouver dans le monde de Minecraft : un bloc, un monstre, un joueur...

Plus précisemment, c'est n'importe quelle chose qu'on peut trouver dans l'espace en trois dimensions du jeu.

Une entité a quelques propriétés simples :
- Un identifiant unique (par exemple 1 ou 0 ou 135) pour pouvoir la retrouver plus tard. Cet identifiant commence à 0 et augmente pour chaque entité crée.
- Une position dans l'espace en trois dimensions (par exemple (1, 3, 5) ou (16.5, 18.38, -1357)) pour savoir où elle est.

**Consignes :** Codez la classe `Entity` (ça veut dire entité en anglais), ses `setters` et ses `getters` (sauf pour l'identifiant qui ne doit jamais changer)

## Exercice 2 - Plusieurs types d'entités
Minecraft est composé aussi bien de créatures (personnage du joueur, monstres) que de blocs. Et ils n'ont a peu près rien à voir à part qu'ils sont tous dans l'espace en trois dimensions.

Par exemple, les blocs peuvent être cassés ou posés. Mais les créatures peuvent bouger, attaquer et mourir.

Quand on a ce genre de cas de figure en Java on peut se servir de l'héritage. Il va nous permettre de partager des choses entre plusieurs objets. Ici on va partager le fait d'être une entité entre les créatures et les blocs.

Donc dans Java grâce à l'héritage :
- On pourra donc dire qu'un bloc est une entité et donc faire tout ce que peut faire l'entité avec.
- On pourra donc dire qu'une créature est une entité et donc faire tout ce que peut faire l'entité avec.
- Par contre on ne pourra pas forcément dire l'inverse, car en tombant sur une entité on n'aura aucune garantie qu'il s'agit plutôt d'un bloc que d'une créature et vice-versa.

**Consignes :** 
    1. créez les classes `Creature` et `Block` héritant d'`Entity`
    2. créez une classe avec un `main`
    3. testez de déclarer une variable de type `Entity` mais de lui assigner un bloc ou une créature à la place
    4. essayez de transformer une entité (qui en réalité est un bloc ou une créature) en un bloc ou une créature