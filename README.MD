# Run

## Initialize Database
`./gradlew bootRun --args='--spring.datasource.url=jdbc:sqlite:/path/that/exists/my-autocreated-database.db --spring.jpa.hibernate.ddl-auto=create'`

## Existing Database
`./gradlew bootRun --args='--spring.datasource.url=jdbc:sqlite:/path/to/my-database.db'`
