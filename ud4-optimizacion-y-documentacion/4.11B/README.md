## 1. Asegúrate de que tienes configurado el editor Visual Studio Code como tu editor de Git. (git config --global core.editor "code --wait").
![ej1](./1.png)

## 2. Crea un repositorio local y avanza en la rama "master" añadiendo un fichero "index.html" con la estructura básica html. El body estará vacío.
![ej2](./2.png)

## 3. Crea y salta a "rama-1". Avanza en un commit con tu nombre de pila en un párrafo dentro del body.
![ej3](./3.png)

## 4. Vuelve a la rama master
![ej4](./4.png)

## 5. Crea y salta a "rama-2". Avanza en un commit con tu apellido en un párrafo dentro del body
![ej5](./5.png)

## 6. Muestra el estado del repositorio de forma gráfica y resumida
![ej6](./6.png)

## 7. Haz un merge a rama-1. Intentas fusionar ambas ramas. Aparecerá un conflicto porque ambos commits trabajan en la misma porción <body></body> de un mismo archivo index.html. Git no será capaz de fusionarlas directamente.
![ej7](./7.png)

## 8. El editor VS Code reconoce los conflictos de fusión. Las diferencias se resaltan y hay acciones en línea para aceptar los cambios. Deja un único párrafo con tu nombre de pila y apellido.
![ej8](./8.png)

## 9. Una vez que se resuelto el conflicto confirma el archivo en conflicto para que pueda realizar esos cambios
![ej9](./9.png)

## 10. Muestra de nuevo el estado del repositorio de forma gráfica y resumida.
![ej10](./10.png)

## 11. Vuelve a la rama master y realiza otro merge. Es una fusión fast-forward. Los dos commits a fusionar tienen relación de ancestro. Entonces el merge no produce un commit nuevo, sencillamente avanza la rama, "avance rápido".
![ej11](./11.png)

## 12. Visualiza las ramas que han sido fusionadas con la rama master
![ej12](./12.png)

## 13. Elimina las ramas correctamente fusionadas (sin asterisco) para quedarte SOLO con la rama master. 
![ej13](./13.png)

## 14. Realiza una copia a este repositorio remoto.
[Repositorio](https://github.com/iesgrancapitan-eed/practica4-git-resolviendo-un-conflicto-a19camoan)

## 15. Recuerda añadir estas instrucciones con los pantallazos en el fichero README.md


## 16. En GitHub entra en Insights/network y visualiza el gráfico del repositorio con los merge y cinco commits.
![ej16](./14.png)