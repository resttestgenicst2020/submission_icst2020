 # Report Executor

 Executes the JSON reports generated from *nominal-tester* and *error-tester*.

 ### How to use

```
java -jar report-executor.jar <api-swagger>.json --report <report-to-execute>.JSON
```

### Example

```
➜  report-executor java -jar report-executor.jar --swagger petstore-example/oas.json --report petstore-example/findPetsByStatus_VIOLATED_CONSTRAINT.json 
16:44:34.111 [main] INFO  reportexecutor.cli.App - cli-param1: swagger-file: petstore-example/oas.json
16:44:34.113 [main] INFO  reportexecutor.cli.App - cli-param2: report-file: petstore-example/findPetsByStatus_VIOLATED_CONSTRAINT.json
- Status code 200 with 1 test cases
Which status code execution you want to replicate?
Enter the status code
200
Which test case?
- Test Case 0 - (1 test steps)
Enter the index
0
Executing
Executing findPetsByStatus - Test Step N. 0
Executed with status code 200
Step: 0 had a violation constraint: Violated enum constraint
All the steps have been executed
```