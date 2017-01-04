# Consignes de compilation et d'exécution

Merci de suivre ces quelques consignes afin d'utiliser correctement notre application. Celles-ci concernent les
procédures de compilation et de lancement.

## Installer MAVEN

### Téléchargement

Vous trouverez sur le site de MAVEN le dernier exécutable en date à cette adresse.

http://maven.apache.org/download.cgi

### Extraction

L'extraction se fait via la commande suivante :

``$ unzip apache-maven-X.X.X-bin.zip``

ou 

``$ tar xzvf apache-maven-X.X.X-bin.tar.gz``

### Variable d'environnement

Ajoutez le chemin du répertoire bin du dossier à votre variable d'environnement PATH ainsi sous Linux :

``$ export PATH=$PATH:/chemin/du/dossier/bin``

### Test d'installation

Lancez la commande ``mvn -v``. Le résultat devrait ressembler à cela.

``Apache Maven 3.3.3 (7994120775791599e205a5524ec3e0dfe41d4a06; 2015-04-22T04:57:37-07:00)
  Maven home: /opt/apache-maven-3.3.3
  Java version: 1.8.0_45, vendor: Oracle Corporation
  Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
  Default locale: en_US, platform encoding: UTF-8
  OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"``

## Compilation

Tout d'abord, il s'agit de vérifier la bonne conformité du projet. Cela se passe avec la commande :

``$ mvn validate``

Ensuite, il faut lancer la compilation du projet MAVEN, via la commande suivante :

``$ mvn compile``

Les commandes qui suivent permettent quand à elles de vérifier le bon passage des tests.

``$ mvn test``

et 

``$ mvn verify``

Enfin, pour générer un .jar utilisable, utilisez la commande :

``$ mvn package``

Le fichier exécutable se trouvera dans le répertoire target. Il suffira de le lancer avec l'ultime commande que voici :

``$ java -jar aidons-les-fermiers.jar``