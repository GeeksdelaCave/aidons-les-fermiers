#!/usr/bin/env bash

# Si erreur, renvoi un code 0 pour ne pas faire échouer le tout
set -e

sudo apt-get install git

# Clone du repo pour travailler dedans (dossier repo_clone
git clone https://github.com/GeeksdelaCave/aidons-les-fermiers.git repo_clone
cd repo_clone
git checkout develop

# Emmett Lathrop "Doc" Brown, de Retour vers le Futur, nous push la doc ;)
git config user.name "Doc E. L. Brown"
git config user.email "doc@backtothefuture.go"

# Génération de la documentation
javadoc -private -sourcepath "src/main/java:src/main/ressources" \
      -d doc \
      marche.traitement.exceptions \
      marche.traitement.label \
      marche.traitement.marche \
      marche.traitement.participant \
      marche.traitement.production \
      marche.traitement.produits

# Ajout du dossier doc nouvellement remplit
git add -A doc/
git commit -m "Voilà la doc Marty ! Nom de Zeus !"

# Push
git push git@github.com:GeeksdelaCave/aidons-les-fermiers.git develop