# 4.3: Comandos básicos en local.

## 1. Transforma el directorio actual en un repositorio de Git. Se añade un subdirectorio de .git con todos los archivos necesarios del repositorio.

![ej1](./img-4.3/1.png)

## 2. Especifica qué archivos quieres añadir al repositorio (a staging area, staged). Prepara los archivos modificados.

![ej2](./img-4.3/2.png)

## 3. Confirma los cambios (a directorio git, committed).

![ej3](./img-4.3/3.png)

## 4. Clona un repositorio existente.

![ej4](./img-4.3/4.png)

## 5. Muestra el estado de los archivos.

![ej5](./img-4.3/5.png)

## 6. Muestra estado abreviado.

![ej6](./img-4.3/6.png)

## 7. Ignora archivos.

Archivo .gitignore

## 8. Mostrar los cambios: líneas exactas que fueron añadidas y eliminadas. Compara lo que tienes en tu directorio de trabajo con lo que está en el área de preparación.

git diff --staged

## 9. Mostrar los cambios: líneas exactas que fueron añadidas y eliminadas. Compara tus cambios preparados con la última instantánea confirmada.

git diff --cached

## 10. Confirma los cambios sin pasar por el área de preparación (a directorio git, committed).

git commit -a

## 11. Eliminar archivos del directorio de trabajo y del área de preparación.

git rm

## 12. Renombrar archivos del directorio de trabajo y del área de preparación.

git mv

## 13. Muestra el historial de confirmaciones.

git log

## 14. Muestra sólo las dos últimas confirmaciones indicando las diferencias introducidas en cada confirmación.

git log -p -2

## 15. Rectifica el último commit.

git commit --amend

## 16. Deshaz un archivo preparado (indicado en git status).

git reset HEAD

## 17. Deshaz un archivo modificado (peligroso) (indicado en git status).

git checkout --[nombre del archivo]