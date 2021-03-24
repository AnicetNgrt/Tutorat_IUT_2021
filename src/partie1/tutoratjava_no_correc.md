# Tutorat Info 2021 - JAVA

# 1 - Les bases : Types et logiques de bases
Markus Person (aka Notch), le créateur du jeu Minecraft a besoin de ton aide !
En effet, il vient de se réveiller et tout le code de Minecraft a disparu !!!
À vous de l'aider ! (c'est promis, je trouverai une meilleur histoire la prochaine fois)

## Exercice 1 : Le menu principal
### Ta mission
Il faut tout recommencer, alors Notch décide de refaire le menu principal en premier.

Le menu principal est tel qu'il suit :

```
---------Minecraft v1.11.3---------

Bienvenue <NOM DU JOUEUR> !

Tu as déjà joué <JOURS>j <HEURES>h <MINUTES>m <SECONDES>s
```

Dans le cas où le nombre de jours est un multiple de 365 et que le nombre d'heures, le nombre de minutes et le nombre de secondes sont tous égaux à 0, alors il faut afficher :

```
---------Minecraft v1.11.3---------

Bienvenue <NOM DU JOUEUR> !

Tu as déjà joué <JOURS>j <HEURES>h <MINUTES>m <SECONDES>s

Merci d'avoir joué à Minecraft pendant <NOMBRE D'ANNÉES> année(s) !
```

### Consignes
Le code de départ est le suivant :

```java
// classe principale
public class Minecraft {
	
    // constantes dont il faut se servir
    private static int VERSION_MAJEURE = 1;
    private static int VERSION_MINEURE = 11;
    private static int NUMERO_REVISION = 3;
    
    private static String NOM_JEU = "Minecraft";
    private static char LIGNE = '-';
    private static int NB_LIGNES = 9;
    
    private static int[] tempsJouéJHM = new int[] { 
    	365, // Jours 
        23,  // Heures
        3    // Minutes
    };
    private static float tempsJouéSecondes = 16.3;
    
    /**
    * Méthode main affichant le menu principal
    * @param args  Arguments de lancement (à ignorer)
    * @return      Pas de valeur retournée (type void)
    */
	public static void main(String[] args) {
    	String affichage = "Quel est ton nom ?";
        
        System.out.println(affichage);
        
        Scanner sc = // création du Scanner
    	String nomJoueur = // récupération du nom par le scanner
        
        // construction de l'affichage du menu principal
        
        System.out.println(affichage);
    }

}
```

Complétez le code sans créer de variables, vous devrez uniquement utiliser les constantes existantes, les opérateurs (`+`, `/` ...) et les instructions de *flow control* (`if`, `else`, `for` ...).

### Indices et mémos
`private` -> Utilisable uniquement dans sa classe

`public` -> Utilisable depuis n'importe quelle classe

`static` -> Pas besoin d'avoir une *instance* de la classe pour s'en servir

Récupération d'une ligne écrite au clavier :
```java
Scanner sc = new Scanner(System.in); // création de l'outil de lecture
String ligneEcrite = sc.nextLine(); // lecture
```

Concaténation de strings :
- `"partie1" + "partie2"` -> `"partie1partie2"`
- `string = "a"; string += "b";` -> `"ab"`

Vérification d'une condition booléenne (= `false` ou `true`) :
```java
boolean jeSuisVrai = true;

if(jeSuisVrai) {
	// on arrivera toujours ici
} else {
	// on arrivera jamais ici
}

if(!jeSuisVrai) {
	// on arrivera jamais ici
} else {
	// on arrivera toujours ici
}
```

Boucle exécutant N fois une suite d'instructions :
```java
int n = 10; // on veut faire 10 tours

// int i = 0 -> on commence au tour 0
// i++ -> on augmente le numéro du tour à chaque tour
// i < n -> on s'arrête lorsque le numéro du tour est égal à N
// (on fait donc les tours n° 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
// (mais pas le n°10), c'est à dire 10 tours en tout)
for(int i = 0; i < n; i++) {
	// tout ce qui se passe ici sera répété N fois
}
```

Création et manipulation d'un tableau :
```java
String[] tableau = new String[3];
tableau[0] = "ce code ";
tableau[1] = "initialise ";
tableau[2] = "un tableau\n";

System.out.println(tableau[0]); // "ce code"

// Boucle qui affiche "ce code initialise un tableau\n"
for(int i = 0; i < 3; i++) {
	System.out.print(tableau[i]);
}

// Petit raccourci qui fait la même chose
for(String partieMessage : tableau) {
	System.out.print(partieMessage);
}
```