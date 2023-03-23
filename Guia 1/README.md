### Antes de continuar, si todavia no dispones de una instalacion de Git en tu computadora haz [click aqui](Instalacion.md) para leer la guia de instalacion de Git para los diferentes sistemas operativos.

### Si deseas colaborar con el repositorio te recomiendo que leas [Este documento](Como_colaborar.md) para que sepas de que manera puedes ayudar al repositorio a crecer.


# Comandos de Git
### A continuacion se enumeran algunos de los comandos mas comunes de Git 

1.  `git init`: Inicia un nuevo repositorio de Git en un directorio vacío o existente.
    
2.  `git clone`: Crea una copia local de un repositorio remoto existente.
    
3.  `git add`: Agrega archivos modificados o nuevos al área de preparación (staging area) antes de comprometerlos (commit).
    
4.  `git commit`: Confirma los cambios realizados en los archivos agregados previamente al área de preparación.
    
5.  `git status`: Muestra el estado actual del repositorio, incluyendo los cambios pendientes que aún no se han comprometido.
    
6.  `git pull`: Descarga los cambios más recientes desde un repositorio remoto al repositorio local.
    
7.  `git push`: Sube los cambios confirmados a un repositorio remoto.
    
8.  `git branch`: Lista todas las ramas disponibles y muestra la rama actual.
    
9.  `git remote add origin [URL del repositorio remoto]`: En este comando, "origin" es el nombre asignado al repositorio remoto. Puedes usar cualquier nombre que desees.

Para mas informacion sobre los comandos de Git recomiendo que entren a [este link](https://learngitbranching.js.org/) para aprender Git de una manera mas amigable utilizando ejemplos y de manera grafica.

### Ahora vamos a aprender a crear un repositorio remoto en GitHub

Para conectar Git a un repositorio remoto, debes seguir los siguientes pasos:

1.  Crea un repositorio remoto en un servicio de alojamiento de repositorios como GitHub.
    
2.  Copia la URL del repositorio remoto. Esta URL debe comenzar con `https://` o `git://`.
    
3.  Abre la línea de comandos o terminal en tu equipo.
    
4.  Navega hasta el directorio del proyecto que deseas conectar al repositorio remoto utilizando el comando `cd`.
    
5.  Inicializa un nuevo repositorio de Git en el directorio con el comando `git init`.
    
6.  Agrega los archivos y carpetas que deseas incluir en el repositorio con el comando `git add`.
    
7.  Confirma los cambios con el comando `git commit`.
    
8.  Agrega el repositorio remoto con el comando `git remote add origin [URL del repositorio remoto]`. En este comando, "origin" es el nombre asignado al repositorio remoto. Puedes usar cualquier nombre que desees.
    
9.  Verifica que el repositorio remoto se haya agregado correctamente utilizando el comando `git remote -v`.
    
10.  Finalmente, sube tus cambios al repositorio remoto con el comando `git push -u origin master`. Este comando subirá la rama `master` de tu repositorio local al repositorio remoto `origin`.



