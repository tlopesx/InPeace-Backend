# InPeace Backend

## Overview

This repository hosts the backend code for InPeace, originally developed as a group project involving three teams, each consisting of two members. While the original project was a collaborative effort, this repository focuses exclusively on the backend, led by Tania Lopes.

## Original Team Members

### Backend Team
- Tania Lopes - Backend Code Lead
- [Caryn Ooi](https://github.com/CarynOoi) - Maintenance Lead

### Frontend Team
- [Yang Zhao](https://github.com/YaaangZ) - Frontend Code Lead
- [Shuya Ikeo](https://github.com/shuyaaaaaaa/shuyaaaaaaa) - Customer Lead

### Data Team
- [Chenwei Xie](https://github.com/DVv66) - Data Lead
- [Yalun Chen](https://github.com/C-Cecilia) - Coordination Lead

## Scope of this Repository

This repository has been sanitized of any sensitive data and stripped of unrelated frontend and database code to serve as a focused showcase of the backend work undertaken for the project.

## Features

### Overview

The backend serves as the backbone of an application designed to:
1. Visually explore Manhattan's busyness at various granularity levels: zones, streets, and places.
2. Store user profiles, complete with credentials and preferences for a personalized experience.
3. Enable community discussions through posts and comments.

### Architecture

- **Microservices Approach**: The backend is divided into 6 Dockerized microservices, allowing for language-specific development and robust scaling.
- **API Gateway**: Centralizes communication, security, and routing, including features like bearer token verification and rate limiting.
- **Database**: Utilizes a Postgres database that interfaces independently with each microservice.

### Main APIs

1. **Map API**: Manages GeoJSON data for delineating zones, streets, and places.
2. **Places API**: Offers detailed information on Manhattan's eateries and recreational areas, alongside user-generated ratings.
3. **Busyness API**: Predicts and estimates busyness levels for various geographical zones and local establishments.
4. **Auth API**: Handles user authentication and authorization.
5. **User API**: Maintains both public and private user profile data, bookmarks, and posts.
6. **Community API**: Manages the storage and retrieval of community posts and comments.

For full documentation of the 70+ API Endpoints, visit the following [API Documentation](https://docs.google.com/document/d/1vhEpY7qU-hP3Me1abiv3gGc6FO0TWTbxiPieJy6DrvE/edit?usp=sharing).

### Technologies

- **Python Services**: Utilize Flask and SQL-Alchemy.
- **Java Services**: Built with Spring Boot and Hibernate.

