#!/usr/bin/env bash

# Si erreur, renvoi un code 0 pour ne pas faire échouer le tout
set -e

# Si Git n'est pas installé
# sudo apt-get install git

# Déclaration du repo à utiliser
REPOSITORY="git@github.com:GeeksdelaCave/aidons-les-fermiers.git"

# Clone du repo pour travailler dedans (dossier repo_clone).
git clone ${REPOSITORY} repo_clone
cd repo_clone

# On se base dans la branche doc (on la créé au besoin)
git checkout doc || git checkout --orphan doc

# Emmett Lathrop "Doc" Brown, de Retour vers le Futur, nous push la doc ;)
git config user.name "Travis CI"
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
git add .

git commit -m "Voilà la doc Marty ! Nom de Zeus !"

# git remote add origin ${REPOSITORY}
git remote set-url origin ${REPOSITORY}

# Push
git push -u origin doc --force