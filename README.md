# To-Do List - Java Project

## Description

Ce projet est une application simple de gestion de tâches ("To-Do List") en Java. Il permet à l'utilisateur d'ajouter, de supprimer et d'afficher des tâches. L'application utilise un menu interactif dans le terminal, où l'utilisateur peut choisir parmi différentes options pour gérer ses tâches. Le programme gère les exceptions courantes, telles que les entrées invalides et les erreurs d'index, pour rendre l'application plus robuste.

## Fonctionnalités

- **Ajouter une tâche** : Permet à l'utilisateur d'ajouter une nouvelle tâche à la liste.
- **Supprimer une tâche** : Permet à l'utilisateur de supprimer une tâche en spécifiant son numéro.
- **Afficher toutes les tâches** : Affiche toutes les tâches ajoutées jusqu'à présent.
- **Quitter l'application** : Permet à l'utilisateur de quitter l'application.

## Prérequis

Avant d'exécuter l'application, assurez-vous d'avoir les éléments suivants :

- **JDK 8** ou supérieur installé sur votre machine.
- Un terminal ou un IDE compatible pour exécuter le code Java (par exemple, IntelliJ IDEA, Eclipse, ou terminal).

## Installation

1. Clonez ce repository sur votre machine :

    ```bash
    git clone https://github.com/votre-utilisateur/to-do-list-java.git
    ```

2. Accédez au répertoire du projet :

    ```bash
    cd to-do-list-java
    ```

3. Assurez-vous que vous avez **JDK 8** ou une version supérieure installée en exécutant :

    ```bash
    java -version
    ```

## Utilisation

1. **Lancer le programme** : Compilez et exécutez le programme à partir de la ligne de commande ou via votre IDE.

    Dans le terminal :

    ```bash
    javac ToDoList.java
    java ToDoList
    ```

2. **Interaction avec le programme** : Une fois le programme lancé, vous verrez un menu avec les options suivantes :

    ```
    --------------TO DO LIST -------------
    1. Add Task
    2. Delete Task
    3. View All Tasks
    4. Quit
    Enter your choice:
    ```

    - **1. Add Task** : Vous pouvez ajouter une tâche en entrant un texte.
    - **2. Delete Task** : Vous devez entrer le numéro de la tâche à supprimer (par exemple, 1 pour la première tâche).
    - **3. View All Tasks** : Affiche toutes les tâches ajoutées jusqu'à présent.
    - **4. Quit** : Quitte le programme.

3. **Gestion des erreurs** :
    - Si vous entrez une option invalide, le programme vous demandera de réessayer.
    - Si vous entrez une tâche à supprimer avec un numéro incorrect, une erreur sera signalée.
    - Le programme gère également les exceptions liées aux entrées invalides (par exemple, entrer une chaîne de caractères lorsqu'un nombre est attendu).

## Exemple d'exécution

Voici à quoi pourrait ressembler l'exécution de votre programme :


