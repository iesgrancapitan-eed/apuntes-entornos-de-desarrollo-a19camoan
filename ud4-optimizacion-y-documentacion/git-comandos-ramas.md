## 1. Indica si la gestión de ramas es algo exclusivo de Git y en qué consiste el trabajo con ramas.
Cualquier sistema de control de versiones moderno tiene algún mecanismo para soportar el uso de ramas.

Cuando hablamos de ramificaciones, significa que tú has tomado la rama principal de desarrollo (master) y a partir de ahí has continuado trabajando sin seguir la rama principal de desarrollo

## 2. Características del trabajo en ramas de Git.
Con el uso de ramas resulta más complicado que el código inestable se fusione con el código base principal, y te da la oportunidad de limpiar tu historial futuro antes de fusionarlo con la rama principal.

## 3. Indica los metadatos que almacena un commit.
Autor y el mensaje explicativo.

## 4. Indica cuántos padres puede tener un commit.
Un padre en los casos de confirmación normal, y múltiples padres en los casos de estar confirmando una fusión (merge) de dos o más ramas.

## 5. Define qué es una rama.
Las ramas de Git son un puntero eficaz para las instantáneas de tus cambios. Cuando quieres añadir una nueva función o solucionar un error, independientemente de su tamaño, generas una nueva rama para alojar estos cambios.

## 6. Indica qué es la rama por defecto y cuándo se crea.
La rama por defecto de Git es la rama master. Con la primera confirmación de cambios que realicemos, se creará esta rama principal master apuntando a dicha confirmación.

## 7. Indica cómo avanza la rama.
En cada confirmación de cambios que realicemos, la rama irá avanzando automáticamente.

## 8. Comando para crear una rama. Ni crea un commit nuevo ni  cambia de rama. La referencia HEAD no cambia.
git branch [nombre de la rama]

## 9. Comando para saltar de rama. Mueve la referencia/apuntador HEAD y revierte los archivos de tu directorio de trabajo si apunta a otro commit.
git checkout [nombre de la rama]

## 10. Comando que muestra las ramas en modo gráfico.
git log --all --color --graph --decorate

## 11. Comando que crea y salta a una nueva rama.
git checkout -b [nombre de la rama]

## 12. Comando que incorpora los cambios a la rama actual. Fusiona dos commits.
git merge [nombre de la rama a fusionar]

## 13. Indica qué es una fusión Fast forward o "avance rápido".
Puede producirse una fusión de avance rápido cuando hay una ruta lineal desde la punta de la rama actual hasta la rama de destino. En lugar de fusionar realmente las ramas, todo lo que Git tiene que hacer para integrar las historias es mover (es decir, "avanzar rápidamente") la punta de la rama actual hasta la punta de la rama de destino. Esto combina las historias, ya que todas las confirmaciones accesibles desde la rama de destino ahora están disponibles a través de la actual.

## 14. Comando que borra una rama.
git branch -D [nombre de la rama]

## 15. Indica qué es una fusión a tres bandas.
Usado para funciones grandes o cuando varios desarrolladores están trabajando en un proyecto simultáneamente.
Es un merge en el que hay que usar 3 commits.

## 16. Indica qué es un conflicto en la fusión o merge conflict.
Los procesos de fusión pueden no ser fluidos. Si hay modificaciones dispares en una misma porción de un mismo archivo en las dos ramas distintas que pretendes fusionar, Git no será capaz de fusionarlas directamente por lo que el usuario deberá editar el contenido o decidir que archivos mantener.

## 17. Comando que lista todas las ramas de tu repositorio.
git branch

## 18. Indica qué es una rama activa y cómo se indica.
La rama a la que apunta HEAD.
Ejecutando `git branch` y fijándonos que rama tiene un `*` delante de su nombre.

## 19. Comando que muestra en cada rama el último commit.
git branch -v

## 20. Comando que filtra las ramas fusionadas. Indica qué significa el asterisco en este caso.
git branch --merged
Las ramas que no llevan por delante el carácter `*` pueden ser eliminadas sin problemas, porque todo su contenido ya ha sido incorporado a otras ramas.

## 21. Comando que fuerza el borrado de una rama que todavía no se ha fusionado.
git branch -D