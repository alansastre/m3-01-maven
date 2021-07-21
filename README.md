
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