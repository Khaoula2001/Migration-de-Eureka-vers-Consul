# TP 23 : Migration Eureka vers Consul

## 1. État Initial (Eureka)
Démarrage des microservices avec Eureka.

![État Initial](screens/2026-01-01_13h02_47.png)

## 2. Installation Consul
Démarrage du serveur Consul en mode dev.

![Démarrage Console](screens/2026-01-01_13h15_51.png)

Serveur prêt.

![Serveur Ready](screens/2026-01-01_13h15_59.png)

Interface Web vide au démarrage.

![UI Vide](screens/2026-01-01_13h16_24.png)

## 3. Migration (Eureka -> Consul)
Changements : dépendances `consul-discovery` et config `application.yml`.

![Configuration](screens/2026-01-01_13h43_01.png)

## 4. Résultat Final
Les services `SERVICE-CLIENT` et `SERVICE-GATEWAY` sont découverts par Consul.

![Services OK](screens/2026-01-01_16h31_46.png)
