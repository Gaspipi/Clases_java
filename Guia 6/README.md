# Comandos de Git parte 2

En esta guía, aprenderemos [cómo colaborar](/Como_contribuir.md) en otros repositorios de GitHub utilizando Git y [como invitar a otros](/Invitar_a_contribuir.md) a colaborar en los nuestros. Veremos los comandos necesarios para clonar un repositorio, crear una nueva rama, hacer cambios en el código y enviar una pull request para que el propietario del repositorio los revise.

-   `git branch`: Este comando te muestra una lista de todas las ramas (branches) que existen en tu repositorio. Las ramas son versiones alternativas de tu proyecto que se pueden utilizar para experimentar o trabajar en nuevas características sin afectar la versión principal.
    
-   `git checkout`: Este comando te permite cambiar de rama en tu repositorio. Simplemente escribe `git checkout <nombre de la rama>` para cambiar a la rama especificada.
    
-   `git checkout -b`: Este comando crea una nueva rama en tu repositorio y automáticamente cambia a ella. Por ejemplo, si escribes `git checkout -b <nombre de la rama>` se creará una nueva rama llamada `<nombre de la rama>` y cambiarás a ella automáticamente.
-   `git merge`: Este comando te permite combinar los cambios que se han hecho en una rama con otra. Por ejemplo, si quieres incorporar los cambios de una rama llamada `feature` en la rama principal `master`, primero deberías cambiar a la rama `master` utilizando `git checkout master`, y luego escribir `git merge feature`.
    
-   `git push`: Este comando te permite subir los cambios que has hecho en tu repositorio local a un repositorio remoto, como GitHub o Bitbucket. Escribir `git push` enviará tus cambios a la rama que estés actualmente, por ejemplo, si estás en la rama `feature`, escribir `git push` enviará los cambios a la rama `feature` en el repositorio remoto.
    
-   `git pull`: Este comando te permite traer los cambios que se han hecho en un repositorio remoto a tu repositorio local. Escribir `git pull` actualizará tu repositorio local con los cambios más recientes que se hayan hecho en el repositorio remoto.