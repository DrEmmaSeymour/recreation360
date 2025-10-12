# Recreation360 – Cloud-Native Modernization Demo

Recreation360 is a full-stack modernization project that transforms a legacy monolithic recreation management system into a cloud-native microservices architecture using Spring Boot, Docker, Azure Kubernetes Service (AKS), and Azure Database for PostgreSQL Flexible Server.

This demo illustrates how enterprises can migrate traditional systems to scalable, containerized deployments with full CI/CD automation via GitHub Actions.

---

## Architecture Overview

The solution demonstrates a cloud-first modernization approach:

- Spring Boot API Layer – containerized backend service  
- PostgreSQL Flexible Server – managed database for persistence  
- Azure Kubernetes Service (AKS) – orchestrates containers  
- Azure Container Registry (ACR) – hosts Docker images  
- GitHub Actions – CI/CD integration pipeline for builds and deployments


flowchart LR
    Dev[Developer] --> GH[GitHub Repo]
    GH -->|CI/CD Workflow| ACR[Azure Container Registry]
    ACR --> AKS[Azure Kubernetes Service]
    AKS --> APP[Spring Boot Container]
    APP --> DB[(PostgreSQL Flexible Server)]
    User[End User] --> APP
