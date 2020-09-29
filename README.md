# jcommander-conflicting-at-syntax
Project demonstrating JCommander's @-syntax conflicting with parameters that start with a literal @ sign.

## Steps to reproduce

```bash
git clone https://github.com/c-kunz/jcommander-conflicting-at-syntax
cd jcommander-conflicting-at-syntax
mvn clean package
java -jar target/demo-jar-with-dependencies.jar -password @X
```
