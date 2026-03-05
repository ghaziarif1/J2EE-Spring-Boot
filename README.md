J2EE & Spring Boot Lab Intro
Ce repository contient les travaux pratiques (TPs) réalisés dans le cadre du module J2EE & Spring Boot avec Mr Wahid, pour le master M1 DevOps.
Structure du Repository

API REST : Dossier contenant le TP2 - Développement d'un microservice pour gérer les étudiants avec Spring Boot.
Architecture : Microservices.
Fonctionnalités : Opérations CRUD sur les étudiants (Create, Read, Update, Delete).
Technologies : Spring Boot, Spring Web, Spring Data JPA, PostgreSQL Driver, Thymeleaf, SpringDoc (OpenAPI + Swagger UI).
Port : 8888.
URLs clés :
API REST : http://localhost:8888/student (GET pour la liste).
Interface Thymeleaf : http://localhost:8888/student/thymeleaf (liste des étudiants).
Swagger UI : http://localhost:8888/swagger-ui.html.


TP1.5 - Thymeleaf : Dossier contenant le TP1.5 - Introduction à Thymeleaf.
Fonctionnalités : Template engine pour générer des vues HTML dynamiques.
Technologies : Spring Boot, Spring Web, Thymeleaf.
Port : 8080 (par défaut).
URL clé : http://localhost:8080/ (page d'accueil avec liste dynamique et conditions).


Prérequis

Java JDK 21 (ou 17).
Maven (intégré dans IntelliJ).
PostgreSQL installé et lancé (pour TP2) avec utilisateur user1 / mot de passe user1 et base postgres.
IntelliJ IDEA (Community Edition suffit).
Postman pour tester les APIs REST.

Comment Lancer les Projets
Pour TP2 (API REST)

Ouvrir le dossier API REST/student dans IntelliJ.
Vérifier pom.xml et recharger Maven.
Configurer PostgreSQL (créer utilisateur user1 si nécessaire).
Lancer StudentApplication.java.
Tester :
REST : http://localhost:8888/student.
Thymeleaf : http://localhost:8888/student/thymeleaf.
Swagger : http://localhost:8888/swagger-ui.html.


Pour TP1.5 (Thymeleaf)

Ouvrir le dossier TP1.5 - Thymeleaf/backend dans IntelliJ.
Vérifier pom.xml et recharger Maven.
Lancer BackendApplication.java.
Tester : http://localhost:8080/ (ajoute ?showDetails=true pour voir les détails).

Notes

Les TPs suivent exactement les instructions fournies par Mr Wahid.
Pour TP2 : La table student est créée automatiquement grâce à spring.jpa.hibernate.ddl-auto=create-drop.
Améliorations possibles : Ajouter PUT pour update (bonus).

Réalisé par Ghazi Arif - M1 DevOps - Mars 2026.
Pour toute question, contactez-moi sur GitHub.
