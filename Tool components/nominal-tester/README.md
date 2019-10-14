# Nominal Tester

### How to run


```bash
bash run.sh <swagger-file> <output-folder>
```

For example, if we want to run it on the pet-store example.
1. Run the pet-store example `bash petstore-example/run.sh`
2. Run the resttestgen bash script

```
bash run.sh petstore-example/oas.json petstore-reports
```

### Output

Folder `petstore-reports` will contain

- **output**: containing client-side code generated using swagger-codegen
- **reports**: containing reports and Junit test cases generated from the resttestgen analysis
- **input-dependency-graph.dot**: Operation Dependency Graph of the current API

### Run Junit files

Junit test cases are experimental.

1. To run the test cases copy the `output folder` of the service into `gentest-runner`

```bash
mv reports/api-service gentest-runner/api-service
cd gentest-runner/
```

2. Copy the test-case you want to run into gentest-runner root

```bash
cp api-service/reports/getPets_200.java gentest-runner/
```

3. Run the script `compile_and_run` passing
    1) Junit test case
    2) Swagger-codegen JAR file

```bash
bash gentest-runner/compile_and_run.sh <JUNIT>.java <swagger-codegen-jar>
```

Example:

```bash
bash compile_and_run.sh ./getPets_200.java api-service/output/codegen/build/libs/swagger-java-client-1.0.0-all.ja
```
