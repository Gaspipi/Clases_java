## Cómo contribuir a un repositorio público de GitHub

1.  Encuentra un repositorio público en GitHub al que quieras contribuir. Puedes buscar por palabras clave o usar la barra de búsqueda en la página principal de GitHub.
    
2.  Haz un "fork" del repositorio en tu cuenta de GitHub haciendo clic en el botón "Fork" en la página del repositorio. Esto creará una copia del repositorio en tu cuenta de GitHub.
    
    ![fork](https://docs.github.com/assets/cb-152145/mw-1000/images/help/repository/fork_button.webp)
    
3.  Clona la copia del repositorio en tu computadora local usando Git. Puedes hacer esto usando el comando `git clone` en la terminal y proporcionando la URL del repositorio que acabas de clonar en tu cuenta de GitHub. Por ejemplo:
    
    ```bash   
    git clone https://github.com/TU_USUARIO/NOMBRE_DEL_REPOSITORIO.git
    ```
    
4.  Crea una nueva rama para hacer tus cambios. Puedes hacer esto usando el comando `git checkout -b` en la terminal y proporcionando un nombre para tu nueva rama. Por ejemplo:
    
    ```bash 
    git checkout -b mi-nueva-funcionalidad
    ```
5.  Haz los cambios que quieras hacer en tu copia del repositorio y guarda los cambios en tu rama.
    
6.  Haz un commit de tus cambios usando el comando `git commit` en la terminal y proporcionando un mensaje descriptivo sobre los cambios que has hecho. Por ejemplo:
    
    ```bash 
    git commit -m "Agregué una nueva función para hacer X"
    ```

7.  Empuja los cambios a tu copia del repositorio en GitHub usando el comando `git push` en la terminal. Por ejemplo:
    
    ```bash 
    git push origin mi-nueva-funcionalidad
    ```

8.  Desde tu copia del repositorio en GitHub, crea una solicitud de extracción ("Pull Request" en inglés) para solicitar que los cambios que has hecho se fusionen con el repositorio original. Haz clic en el botón "New pull request" en la página del repositorio en tu cuenta de GitHub, selecciona la rama que has creado con tus cambios y haz clic en el botón "Create pull request".
    
    ![pull-request](https://www.gitkraken.com/wp-content/uploads/2021/07/draft-pull-request-github.png)
    
9.  Proporciona una descripción detallada de los cambios que has hecho en la solicitud de extracción y espera a que el propietario del repositorio original revise y acepte tus cambios.
    
10.  Si el propietario del repositorio original solicita cambios adicionales, haz los cambios en tu copia del repositorio y repite los pasos 5-9.
    

¡Eso es todo! Ahora sabes cómo contribuir a un repositorio público en GitHub.