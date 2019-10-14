#!/bin/bash

# WARNING: this file is meant to be a draft for the run script
# do not use it in production

# Check bash script parameters

if [ "$#" -ne 2 ]; then
    echo "Illegal number of parameters"
    echo "Correct usage:"
    echo "bash run.sh swagger-file.json outputfolder"
    exit
fi

SWAGGER_SPEC=$1
OUTPUT_DIR=$2
WORKINGDIR="$(cd "$(dirname "$0")" && pwd)"
echo "SWAGGER_SPEC: $SWAGGER_SPEC"
echo "OUTPUT_DIR: $OUTPUT_DIR"
echo "WORKINGDIR:" $WORKINGDIR
mkdir -p $OUTPUT_DIR

# Use swagger codegen to generate client-side code
java -jar $WORKINGDIR/tools/swagger-codegen/swagger-codegen-cli.jar generate -i $SWAGGER_SPEC -l java -o $OUTPUT_DIR/output/codegen

# sleep to prevent conflicts
sleep 10

# Compile generated classes
(cd $OUTPUT_DIR/output/codegen && gradle build -x test && gradle fatJar)
SWAGGER_CLIENT_JAR=$OUTPUT_DIR/output/codegen/build/libs/swagger-java-client-1.0.0-all.jar

# Run testrestgen-cli
RESTTESTGEN_JAR=$WORKINGDIR/resttestgen-1.0-SNAPSHOT.jar

# Run command-line tool
java -jar $RESTTESTGEN_JAR \
--output $OUTPUT_DIR \
--classes $SWAGGER_CLIENT_JAR \
--swagger $SWAGGER_SPEC \
