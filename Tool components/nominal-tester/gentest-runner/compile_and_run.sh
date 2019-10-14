echo "Usage bash compile_and_run.bash Testcase swagger-codegen-client.jar"
fullfile=$1
filename=$(basename -- "$fullfile")
extension="${filename##*.}"
filename="${filename%.*}"
javac -cp .:junit-4.12.jar:resttestgen-1.0-SNAPSHOT.jar:$2:hamcrest-core-1.3.jar $filename.java
java -cp .:junit-4.12.jar:resttestgen-1.0-SNAPSHOT.jar:$2:hamcrest-core-1.3.jar org.junit.runner.JUnitCore $filename
