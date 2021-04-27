

## 1. Las ramas utilizadas son:
1. Ramas de desarrollo y maestra (develop, master, main)
1. Ramas de función (feature)
1. Ramas de publicación (release)
1. Ramas de corrección (hotfix)
## 2. El flujo general de Gitflow es el siguiente:
1. Se crea una rama de desarrollo a partir de la maestra.
1. Una rama de publicación se crea a partir de la de desarrollo.
1. Las ramas de función se crean a partir de la de desarrollo.
1. Cuando una función está completa, se fusiona en la rama de desarrollo.
1. Cuando la rama de publicación está lista, se fusiona en la de desarrollo y la maestra.
1. Si se detecta una incidencia en la maestra, se crea una rama de corrección a partir de la maestra.
1. Una vez que la corrección está completa, se fusiona tanto con la de desarrollo como con la maestra.
## 3. Adjunta un pantallazo del comando git log --oneline --decorate --graph --all.
![git log](./1.png)
## 4. Una vez subido el repositorio CON TODAS SUS RAMAS, adjunta un pantallazo del apartado de GitHub "Insights"/"Network graph".
![github graph](./2.png)