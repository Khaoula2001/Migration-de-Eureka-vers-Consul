# Rapport TP : Migration de Eureka vers Consul

Ce projet met en œuvre la migration d'une architecture microservices de **Eureka** vers **Consul**. L'objectif est d'assurer l'enregistrement et la découverte des services `Gateway`, `Client` et `Car` via Consul.

## 1. Structure et Configuration Initiale
Mise en place de l'architecture et modification des fichiers `pom.xml` et `application.yml` pour intégrer les dépendances `spring-cloud-starter-consul-discovery`.

![Configuration Initiale](screens/2026-01-01_13h02_47.png)

## 2. Démarrage et Problèmes Rencontrés
Lancement initial des services. Plusieurs erreurs ont été identifiées, notamment des conflits de ports et des problèmes de configuration de base de données (H2).

![Tentative de Lancement](screens/2026-01-01_13h15_51.png)

![Logs d'Erreurs](screens/2026-01-01_13h15_59.png)

![Problème de Driver JDBC](screens/2026-01-01_13h16_24.png)

## 3. Corrections et Ajout de Actuator
Résolution des problèmes :
- Correction du scope de la dépendance H2 (`runtime`).
- Ajout de `spring-boot-starter-actuator` pour exposer le endpoint `/actuator/health` requis par Consul.
- Libération des ports occupés.

![Validation Intermédiaire](screens/2026-01-01_13h43_01.png)

## 4. Résultat Final
Tous les services sont correctement démarrés et enregistrés dans Consul. Le dashboard affiche un statut "Passing" (Vert) pour `consul`, `Gateway`, `SERVICE-CLIENT` et `SERVICE-CAR`.

![Services Opérationnels sur Consul](screens/2026-01-01_16h31_46.png)