## Clonando un repositorio

1.  Ingresa al repositorio que deseas clonar en GitHub.
2.  Haz clic en el botón verde "Code" que se encuentra en la parte superior derecha del repositorio.
3.  Selecciona la opción "HTTPS" o "SSH" para obtener la URL del repositorio.
4.  Abre la terminal en tu sistema operativo.
5.  Navega hasta la ubicación donde deseas clonar el repositorio utilizando el comando `cd`.
6.  Ejecuta el siguiente comando en la terminal: `git clone <URL del repositorio>`.
7.  Espera a que se complete la descarga del repositorio.

¡Listo! Ahora tienes una copia del repositorio en tu máquina local.

## Haciendo un pull request

1.  Realiza los cambios que deseas hacer en el repositorio clonado en tu máquina local utilizando el editor de código o IDE de tu preferencia.
2.  Abre la terminal en la ubicación del repositorio clonado.
3.  Ejecuta el comando `git status` para verificar los cambios realizados en el repositorio.
4.  Agrega los archivos que deseas enviar al repositorio con el comando `git add <nombre de archivo>` o `git add .` para agregar todos los archivos modificados.
5.  Confirma los cambios con el comando `git commit -m "<mensaje del commit>"`.
6.  Ejecuta el comando `git push` para enviar los cambios al repositorio en GitHub.
7.  Ingresa a la página del repositorio en GitHub y haz clic en el botón "Pull requests".
8.  Haz clic en el botón verde "New pull request".
9.  Selecciona la rama de tu repositorio que contiene los cambios que deseas enviar.
10.  Selecciona la rama a la que deseas enviar los cambios en el repositorio original.
11.  Verifica que todos los cambios sean correctos y haz clic en "Create pull request".
12.  Espera a que el propietario del repositorio revise y apruebe el pull request.

¡Listo! Ahora has enviado tus cambios al repositorio original mediante un pull request en GitHub.