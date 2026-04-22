1. Create folders: src/, lib/, bin/
2. Place Calculator.java and CalculatorTest.java inside src/
3. Download junit-platform-console-standalone-1.10.1.jar → place in lib/
4. Open terminal in project folder

javac -cp lib/junit-platform-console-standalone-1.10.1.jar -d bin src/*.java

java -jar lib/junit-platform-console-standalone-1.10.1.jar execute --class-path bin --scan-class-path --details=tree
