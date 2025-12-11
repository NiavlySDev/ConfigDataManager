# ConfigDataManager

Librairie pour la gestion de fichiers de sauvegardes en yml dans le dossier plugins des serveurs minecraft.
Permet de gérer une large quantité de stockage de données pour les plugins minecraft.

## Fonctionnalités

- Gérez vos données peu importe le type avec une libraire simple d'utilisation

## Installation

1. Mettez JitPack dans votre pom:

   ```xml
      <repository>
         <id>jitpack.io</id>
         <url>https://jitpack.io</url>
      </repository>
   ```
   
2. Mettez ensuite le repo jitpack dans les dependencies (Trouvez la derniere version sur: https://jitpack.io/#NiavlySDev/BigNumbers)

   ```xml
      <dependency>
         <groupId>com.github.NiavlySDev</groupId>
         <artifactId>ConfigDataManager</artifactId>
         <version>[Tag] (Exemple: v1.3)</version>
      </dependency>
   ```

### Objectif du Projet

Le projet **ConfigDataManager** a été conçu dans l'objectif de fournir aux développeurs de plugins Minecraft une
solution simple, performante et flexible pour la gestion des données de sauvegarde. Il vise à simplifier et
uniformiser :

- Le stockage et la récupération de données au format YAML.
- La gestion de grandes quantités de données avec une approche orientée performance.
- L'interaction avec le dossier `plugins` des serveurs Minecraft de manière efficace.

### Philosophie de Développement

1. **Simplicité** : Rendre l'utilisation de la bibliothèque intuitive même pour les débutants.
2. **Performance** : Optimiser les temps de lecture/écriture tout en minimisant l'impact sur les ressources du serveur.
3. **Modularité** : Fournir une structure qui peut facilement être étendue ou adaptée selon les besoins spécifiques.

Inspiré par des besoins concrets rencontrés dans le développement de plugins Minecraft, ce projet a été façonné pour
offrir une expérience concrète et robuste aux utilisateurs.

## Installation

1. Clonez ce dépôt :
   ```bash
   git clone https://github.com/NiavlySDev/ConfigDataManager
   ```
2. Naviguez dans le répertoire du projet :
   ```bash
   cd ConfigDataManager
   ```

## Contribuer

Merci de considérer contribuer à ce projet ! Voici comment vous pouvez nous aider :

1. Forkez le projet.
2. Créez une branche pour votre fonctionnalité ou correction de bug :
   ```bash
   git checkout -b ma-branche
   ```
3. Faites vos modifications et validez-les :
   ```bash
   git commit -m "Description de la modification"
   ```
4. Poussez votre branche :
   ```bash
   git push origin ma-branche
   ```
5. Ouvrez une pull request.

## Licence

Ce projet est sous licence MIT Licence - voir le fichier `LICENSE` pour plus de détails.

## Contact

Si vous avez des questions, suggestions ou remarques, n'hésitez pas à nous contacter à :  
**Email** : <niavlys.dev@gmail.com>

## Crédits

Merci à toutes les personnes qui ont contribué à ce projet, que ce soit par le code, les suggestions ou les retours.

### Développeurs principaux

- **NiavlySDev** - Créateur et développeur principal du projet.

### Contributeurs

- Toute personne ayant soumis des pull requests ou signalé des bugs.

## Notions du Créateur

Cette section est dédiée à expliquer les principes fondamentaux et les idées originales qui ont mené à la création de *
*ConfigDataManager**.
