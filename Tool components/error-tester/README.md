# Error Tester

### How to run

Parameters:
- (REQUIRED) --service <path to the service folder> (e.g. /home/user/petstore)
- (REQUIRED) --reports <path to the reports folder> (e.g. /home/user/some_folder/)
- (REQUIRED) --swagger <swagger-specification-file> (e.g. /my-rest/petstore.json)
- (OPTIONAL) --verbose <log-verbosity level> (e.g. 0 for error, 1 for info, 2 for debug)
- (OPTIONAL) --mutation <type of malformed mutation to test> (possible values: \"required\",
"\"datatypes\", \"constraints\", \"all\"; default: \"all\")
- (OPTIONAL) --output <output folder for the reports (default: \"service/malformedReports/\")

```bash
java -jar error-tester.jar --service petstore-example --reports petstore-example/nominal-tester-reports/reports --swagger petstore-example/oas.json
```

### Output

You find the results inside the folder `petstore-example/malformedReports`.

The folder `malformedReports` contains:
- **summary**: general summary with some statistics
- **operations-summaries**: a summary for each processed operations
- **errors-identified**: files where a mutation identified some error (eg. request was successfully executed regardless missing required parameter or violated constraints)
