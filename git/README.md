# GIT

- [GIT](#git)
  - [¿Que es Git?](#que-es-git)
    - [Operaciones basicas de Git](#operaciones-basicas-de-git)
      - [INIT](#init)
	  - [CLONE](#clone)
	  - [ADD](#add)
	  - [COMMIT](#commit)
	  - [PUSH](#push)
	  - [PULL](#pull)

## QUE ES GIT

> Es un sistema de control de versiones distribuido de código abierto y gratuito diseñado para manejar todo, desde proyectos pequeños a muy grandes, con velocidad y eficiencia.  — Git
Un sistema de control de version, basicamente es un software que se enfoca en ayudar a grandes equipos a gestionar grandes cantidades de codigo. 


### OPERACIONES BASICAS DE GIT

#### INIT
Sentencia utilizada para inicializar un repositorio local, es utilizado para indicar la creacion de un nuevo repositorio.

**Ejemplo**:

Inicializa el repositorio en el directorio actual.
```GIT
	git init .
```

Transforma un directorio en la ubicacion actual en repositorio.
```GIT
	git init <directory>
```

#### CLONE
Sentencia utilizada para clonar un repositorio remoto, basicamente es la copia local de un repositorio alojado en un servidor remoto, o servicio de alojamiento.

**Ejemplo**:

La forma normal de clonar un repositorio, la forma basica especificamente. Unicamente requiere de la url donde se ubica el repositorio.
```GIT
	git clone [url]
```

#### ADD
Este comando guarda los cambios realizados, en espacio seguro para su posterior confirmación. Lo que quiere decir que es un paso previo y necesario para almacenar los cambios
realizados en el staging  area.

**Ejemplo**:

Guarda todo los cambios realizados en la ubicacion actual.
```GIT
	git add .
```
Almacena todo los cambios en un directorio definidio o un archivo definido.
```GIT
	git add <path>
```

Almacena todos los cambios de todo el repositorio actual.
```GIT
	git add -A
```

#### COMMIT
Este comando es el encargado de confirmar los cambios realizados, quiere decir que este es el encargado de confirmar todos los cambios ubicados en el staging  area.

**Ejemplo**:

Ejemplo basico para realizar un commit.
```GIT
	git commit -m"<mensaje>"
```

#### PUSH
Este comando basicamente actualiza todos los commits en la rama actual ubicadas en local hacia el repositorio remoto.

**Ejemplo**:

Ejemplo basico de actualización de rama remota.
```GIT
	git push origin
```

Fuerza la inserción y actualización de datos que de otro modo eliminaria o sobreescribiria la rama actual.
```GIT
	git push -f
```

#### PULL
Esta operacion indica basicamente el actualizar la rama local con los cambios ubicados en nuestra rama remota, generalmente es el primer comando que debe ejecutarse mientras se realizan las modificaciones.

**Ejemplo**:

Actualiza la rama local actual, con su contraparte en el repositorio remoto. 
```GIT
	git pull
```

Fuerza la actualizacion de la rama local.
```GIT
	git pull --force
```