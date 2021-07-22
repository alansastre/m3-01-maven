
## Maven

https://maven.apache.org/

### 1. Descarga maven

https://maven.apache.org/download.cgi

### 2. Características o funcionalidades maven

Herramienta para la gestión ciclo de vida de los proyectos java.

* Gestión de dependencias (JUnit, mockito, jersey, etc....)
* Convention Over Configuration (CoC): estructura de proyecto
* Plugins
* Open Source
* Comandos: mvn -v, mvn clean, mvn package, mvn archetype ....
* Arquetipos o plantillas
* Integración con otras herramientas: SonarQube


### 3. Estructura proyectos maven

* src/main/java: paquetes propios y código fuente
* src/main/resources: recursos necesarios para el backend


* src/test/java: casos de test
* src/test/resources: recursos para los casos de test

* src/main/webapp: aquí se aloja la tecnología frontend/web (JSP, JSTL, JSF o Angular)
* src/main/docker: archivos para docker



### 4. El fichero pom.xml

1. groupId, artifactId, version
2. Información opcional: organization, url, name, developers, contributors, scm
3. properties
4. dependencias (Buscar en https://mvnrepository.com)
5. reporting
6. build

### 5. Archetypes (plantillas de proyectos)

Plantillas estructura de proyecto y dependencias

### 6. Ciclo de vida

https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html

Ciclos de vida Maven:

1. clean (3 fases): limpiar carpetas de desplegables, archivos compilados, archivos de compilaciones anteriores, etc
2. default (23 fases): incluye las fases de compilar, construir, generar desplegable, etc
3. site (4 fases): generar documentación para mantinimiento, javadoc, reportes de testing, etc.

Cada ciclo incluye sus fases.

#### 6.1 comandos 

Nota: los comandos se ejecutan en la misma carpeta en la que está el archivo pom.xml

```
mvn clean
mvn install
mvn clean install
mvn site
mvn compile site
```

Todos los resultados de maven se almacenan en la carpeta target



### 7. Plugins

Filtrar por org.apache.maven.plugins

Lista de plugins:

1. maven-clean-plugin (build)
2. maven-compiler-plugin (build)
3. maven-surefire-plugin (build)
4. maven-site-plugin (build)
5. maven-surefire-report-plugin (reporting)
6. maven-javadoc-plugin (en build con executions y en reporting sin executions)
7. jacoco-maven-plugin (en build con executions y en reporting sin executions)
8. maven-checkstyle-plugin (reporting)

Ver API JDK completa:
https://docs.oracle.com/en/java/javase/16/docs/api/index.html


Docs:
https://pmd.github.io/latest/pmd_rules_java.html
https://pmd.github.io/latest/pmd_userdocs_cpd.html
https://spotbugs.github.io/spotbugs-maven-plugin/usage.html

### 8. Dependencias

```
<dependencies>


</dependencies>
```

Scope:

* test: solo para testing
* provided: indica que quien provee la dependencia es el contenedor donde aloja/despliega la aplicacion (Ej: jsp, servlets, etc)
* runtime: indica que es necesaria solo en tiempo de ejecución (Drivers de base de datos como mysql)








### Generar desplegables

Notas: Descargar Apache Tomcat

https://tomcat.apache.org/download-10.cgi



### Docker

https://www.padok.fr/en/blog/docker-windows-10

1. Activar características windows

2. Instalar Ubuntu

3. Abrir Ubuntu y crear usuario

4. Instalar paquete WSL2 Linux Kernel, descargar de: 

https://docs.microsoft.com/en-us/windows/wsl/install-win10#step-4---download-the-linux-kernel-update-package

Enlace directo:
https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi

5. Abrir Powershell y ejecutar:

```
wsl -l -v

wsl --set-version Ubuntu 2

wsl -l -v

wsl --set-default-version 2

wsl -l -v

```

6. Crear container jenkins


1. Imagenes

2. Contenedores

```
docker run --name jenkins -p 8080:8080 -d jenkins/jenkins:lts

docker logs -f jenkins
```




### Alternativa problemas: 

https://www.jenkins.io/download/

Descargar .war

http://jdk.java.net/java-se-ri/11

En la CMD dentro de la carpeta donde esté el archivo jenkins.war

```
C:\Users\alanj\.jdks\jdk-11\bin\java -jar jenkins.war
```

Ver docs:
https://www.jenkins.io/doc/book/installing/


### CI / CD

* Continuous integration: automatizar el proceso de compilación, construcción, testing, generar desplegables, etc.

* Continuous delivery: automatizar el proceso de despliegue



### Jenkins

1. Instalar Plugins: 

* AdoptOpenJDK installer
* JaCoCo

2. Crear tarea > Crear proyecto de estilo libre

* Indicar la ruta al repo git
* Crear maven goal: `clean install`
* Crear maven goal: `site`
* Agregar tareas para después
	* JUnit: target/surefire-reports/*.xml
	* Jacoco
	
3. Crear pipeline

* Crear Jenkinsfile
* Inicializar git y hacer push a GitHub
* En Jenkins crear tarea > Multibranch pipeline
* Automaticamente se escanea y se construyen las ramas


4. Visualizar el pipeline en Blue Ocean

* Instalar plugin Blue Ocean y reiniciar
* Crear pipeline desde Blue Ocean
* Te pide generar token para conectar a GitHub

5. Sonar Cloud

* Entrar en https://sonarcloud.io/
* Crear nuevo proyecto a partir de un repositorio GitHub existente
* Set Up
* Maven
* Copiar el token
* Ejecutar en eclipse el comando:

```
mvn verify sonar:sonar -Dsonar.projectKey=alansastre_m3-01-maven -Dsonar.organization=alansastre -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=6136e70b0e12ca0541d807cc501786ada66ec2cf -Dsonar.branch.name=master
```
* Verificar que se analiza en sonarcloud.io
* Agregar un nuevo step en Jenkinsfile incluyendo el comando maven para el análisis sonar





6. GitHub Actions

7. Gitlab

8. Vercel / Netlify / Heroku




















