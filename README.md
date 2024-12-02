\documentclass[a4paper,12pt]{article}
\usepackage[utf8]{inputenc}
\usepackage{hyperref}

\title{To-Do List - Java Project}
\author{}
\date{}

\begin{document}

\maketitle

\begin{abstract}
Ce projet est une application simple de gestion de tâches ("To-Do List") en Java. Il permet à l'utilisateur d'ajouter, de supprimer et d'afficher des tâches. L'application utilise un menu interactif dans le terminal, où l'utilisateur peut choisir parmi différentes options pour gérer ses tâches. Le programme gère les exceptions courantes, telles que les entrées invalides et les erreurs d'index, pour rendre l'application plus robuste.
\end{abstract}

\section{Fonctionnalités}
\begin{itemize}
    \item \textbf{Ajouter une tâche} : Permet à l'utilisateur d'ajouter une nouvelle tâche à la liste.
    \item \textbf{Supprimer une tâche} : Permet à l'utilisateur de supprimer une tâche en spécifiant son numéro.
    \item \textbf{Afficher toutes les tâches} : Affiche toutes les tâches ajoutées jusqu'à présent.
    \item \textbf{Quitter l'application} : Permet à l'utilisateur de quitter l'application.
\end{itemize}

\section{Prérequis}
\begin{itemize}
    \item JDK 8 ou supérieur installé sur votre machine.
    \item Un terminal ou un IDE compatible pour exécuter le code Java (par exemple, IntelliJ IDEA, Eclipse, ou terminal).
\end{itemize}

\section{Installation}
\begin{enumerate}
    \item Clonez ce repository sur votre machine :
    \begin{verbatim}
    git clone https://github.com/votre-utilisateur/to-do-list-java.git
    \end{verbatim}
    \item Accédez au répertoire du projet :
    \begin{verbatim}
    cd to-do-list-java
    \end{verbatim}
    \item Assurez-vous que vous avez JDK 8 ou une version supérieure installée en exécutant :
    \begin{verbatim}
    java -version
    \end{verbatim}
\end{enumerate}

\section{Utilisation}
\begin{enumerate}
    \item \textbf{Lancer le programme} : Compilez et exécutez le programme à partir de la ligne de commande ou via votre IDE.
    \begin{verbatim}
    javac ToDoList.java
    java ToDoList
    \end{verbatim}
    \item \textbf{Interaction avec le programme} : Une fois le programme lancé, vous verrez un menu avec les options suivantes :
    \begin{verbatim}
    --------------TO DO LIST -------------
    1. Add Task
    2. Delete Task
    3. View All Tasks
    4. Quit
    Enter your choice:
    \end{verbatim}
    \begin{itemize}
        \item \textbf{1. Add Task} : Vous pouvez ajouter une tâche en entrant un texte.
        \item \textbf{2. Delete Task} : Vous devez entrer le numéro de la tâche à supprimer (par exemple, 1 pour la première tâche).
        \item \textbf{3. View All Tasks} : Affiche toutes les tâches ajoutées jusqu'à présent.
        \item \textbf{4. Quit} : Quitte le programme.
    \end{itemize}
    \item \textbf{Gestion des erreurs} : Si vous entrez une option invalide, le programme vous demandera de réessayer. Si vous entrez une tâche à supprimer avec un numéro incorrect, une erreur sera signalée. Le programme gère également les exceptions liées aux entrées invalides (par exemple, entrer une chaîne de caractères lorsqu'un nombre est attendu).
\end{enumerate}

\section{Exemple d'exécution}
Voici à quoi pourrait ressembler l'exécution de votre programme :

\begin{verbatim}
--------------TO DO LIST -------------
1. Add Task
2. Delete Task
3. View All Tasks
4. Quit
Enter your choice: 1
Enter Task: Finish homework
Task added successfully.

--------------TO DO LIST -------------
1. Add Task
2. Delete Task
3. View All Tasks
4. Quit
Enter your choice: 3
Your Tasks:
1. Finish homework

--------------TO DO LIST -------------
1. Add Task
2. Delete Task
3. View All Tasks
4. Quit
Enter your choice: 2
Your Tasks:
1. Finish homework
Enter Task number to delete: 1
Task deleted successfully.

--------------TO DO LIST -------------
1. Add Task
2. Delete Task
3. View All Tasks
4. Quit
Enter your choice: 4
Exiting...
\end{verbatim}

\section{Contributions}
Les contributions sont les bienvenues ! Si vous souhaitez contribuer à ce projet, vous pouvez suivre ces étapes :
\begin{enumerate}
    \item Fork le repository.
    \item Créez une branche pour votre fonctionnalité (\texttt{git checkout -b feature/amélioration}).
    \item Faites vos changements et commitez-les (\texttt{git commit -am 'Ajout d'une fonctionnalité'}).
    \item Poussez les changements sur votre fork (\texttt{git push origin feature/amélioration}).
    \item Ouvrez une Pull Request.
\end{enumerate}

\section{License}
Ce projet est sous la licence MIT. Consultez le fichier \texttt{LICENSE} pour plus de détails.

\end{document}
