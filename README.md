
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
```

Todos los resultados de maven se almacenan en la carpeta target



### 7. Plugins

Filtrar por org.apache.maven.plugins

Lista de plugins:

maven-clean-plugin
maven-compiler-plugin
maven-surefire-plugin
maven-site-plugin
maven-surefire-report-plugin











### Generar desplegables

Notas: Descargar Apache Tomcat

https://tomcat.apache.org/download-10.cgi



### Docker