# 4.6 Comandos básicos en remoto.
## 1. Ver los repositorios remotos que tienes configurados en el local.
git remote

## 2. Lista los alias y las URLs que Git ha asociado al repositorio remoto.
git remote -v

## 3. Clona un repositorio existente
git clone

## 4. Añade un repositorio remoto
git remote add [nombre] [url]

## 5. Descargar objetos y referencias de otro repositorio sin integrarlos
git fetch [remote-name]

## 6. Descargar objetos y referencias de otro repositorio y los integra
git fetch [remote-name]

## 7. Enviar a tu remoto para compartir (permiso de escritura y )
git push [nombre-remoto] [nombre-rama]

## 8. Inspeccionar un remoto 
git remote show [nombre-remoto]

## 9. Renombrar remotos
git remote rename

## 10. Eliminar remoto
git remote rm