# Story 027: FinDocRAG Project Rename

## Completed

- Updated project branding and tracked path references to FinDocRAG.
- Renamed the tracked application directory to `findoc-rag` and updated its Gradle project name.
- Renamed the application entry point, its test, the project spec, and the Grafana dashboard and demo video assets.
- Updated Compose mounts, observability labels, and related documentation.
- Kept the outer checkout directory unchanged.

## Pending

- Developers with local environment-specific configuration should place their own configuration at `findoc-rag/.env` if needed.
- Production deployment settings and telemetry configuration remain subject to the existing operational verification work.

## Validation

- `gradle test --console=plain` passed from `findoc-rag`.
- Tracked content was checked for obsolete project and directory names, excluding environment files.

## Next Implementation Item

- Continue with production verification of Kafka dead-letter topic settings, alerting, and telemetry configuration.
