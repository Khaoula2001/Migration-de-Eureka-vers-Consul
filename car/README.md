# SERVICE-CAR - Exécution locale

Ce projet Spring Boot fournit un microservice `SERVICE-CAR`.

Prérequis
- Java 17+ (ici Java 25 est utilisé localement)
- Maven (inclus via le wrapper `mvnw.cmd`)

Exécuter localement
1. Build (sans tests) et lancer via le script PowerShell :

   .\run-local.ps1

   Le script build puis exécute le jar. Par défaut il passe des propriétés pour :
   - utiliser H2 en mémoire
   - désactiver Consul
   - définir le port sur 8082

2. Si vous voulez rebuild et relancer manuellement :

   .\mvnw.cmd -DskipTests package ; java -jar target\car-0.0.1-SNAPSHOT.jar --spring.cloud.consul.enabled=false --server.port=8082

Tests

- Pour lancer les tests :

  .\mvnw.cmd test

Remarques
- Le projet utilise MySQL en production (config dans `src/main/resources/application.yml`). Pour le développement local et CI, les tests utilisent une base H2 en mémoire (dépendance ajoutée et `src/test/resources/application.properties`).
- Si vous souhaitez utiliser MySQL localement, configurez `spring.datasource.url`, `username` et `password` dans `application.yml`.

