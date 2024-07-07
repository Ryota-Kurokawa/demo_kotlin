.PHONY: build
build:
	./gradlew build -x test

run:
	./gradlew bootRun

.PHONY: test
test:
	./gradlew test