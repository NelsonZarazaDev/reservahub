# ReservaHub

**Multi-business reservation platform — Java & Spring Boot**

ReservaHub is an evolving backend project focused on designing a maintainable reservation system for multiple businesses. The goal is to model real operational workflows while practicing professional Java development, clear boundaries, and incremental delivery.

> **Status: Early development.** The repository currently contains the Spring Boot application scaffold and its initial test setup. Reservation management, multi-tenancy, persistence, authentication, and APIs are planned—not yet implemented.

## Current technology

| Area | Technology |
| --- | --- |
| Language | Java 25 |
| Framework | Spring Boot 4.1.2 |
| Build | Gradle Wrapper |
| Web | Spring Web MVC |
| Tests | JUnit Platform / Spring Boot test starter |

## Roadmap

- [x] Initialize the Spring Boot project and build configuration
- [ ] Define reservation-domain requirements and business rules
- [ ] Model businesses, services, availability, and bookings
- [ ] Add database persistence and schema migrations
- [ ] Expose validated REST APIs with clear error handling
- [ ] Implement authorization and business-level isolation
- [ ] Add automated tests, API documentation, and Docker support

## Run locally

Requirements: **JDK 25**.

```bash
git clone https://github.com/NelsonZarazaDev/reservahub.git
cd reservahub
./gradlew bootRun
```

On Windows:

```powershell
.\gradlew.bat bootRun
```

Run the existing tests:

```bash
./gradlew test
```

No functional reservation API is exposed yet. An HTTP 404 on an undefined route is expected at this stage.

## Development approach

The project is being built incrementally, with an emphasis on understanding dependency injection, designing domain boundaries, keeping implementation testable, and documenting completed features separately from planned ones.

**Author:** [Nelson Mauricio Navarro Zaraza](https://github.com/NelsonZarazaDev)
