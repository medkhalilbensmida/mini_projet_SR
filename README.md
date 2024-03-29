# Projet de Communication Distribuée en Java

## Technologies Employées :

- **Java RMI**: Java Remote Method Invocation est une technologie permettant la communication entre objets distants de manière transparente, facilitant l'invocation de méthodes comme si elles étaient locales.
- **gRPC**: gRPC est un framework moderne et efficace pour les appels de procédure à distance (RPC - Remote Procedure Call), offrant des performances optimales.
- **Sockets**: Les sockets fournissent une interface de programmation permettant la communication bidirectionnelle entre processus sur un réseau.

## Fonctionnalités Intégrées :

### Java RMI :

- **Gestion de liste de tâches** :
  - Ajout, suppression et récupération de tâches dans une liste.

### gRPC :

- **Service de messagerie** :
  - Envoi et récupération de messages texte vers/d'un destinataire spécifié.

### Sockets :

- **Service de chat** :
  - Envoi et récupération de messages texte dans un salon de discussion commun.

## Installation et Utilisation :

Avant d'utiliser les fonctionnalités, assurez-vous d'avoir installé Apache Maven.

### Java RMI :

1. Démarrage du serveur :
  java RMI/TaskServer.java
2. Démarrage du client :
  java RMI/TaskClient.java

### gRPC :
1. Installation des dépendances Maven :
  mvn install
2. Accès au répertoire approprié :
  cd grpc/grpcMessage
3. Compilation du code :
  mvn clean compile
4. Démarrage du serveur :
  mvn exec:java@server-execution
5. Démarrage du client :
  mvn exec:java@client-execution

### Sockets :
1. Démarrage du serveur :
  java sockets/ChatServer.java
2. Démarrage du client :
  java sockets/ChatClient.java
