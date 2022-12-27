# ANTLR4.G4

**ANTLR4** Notes based on *"The Definitive ANTLR4 Reference"* Book.

## Local Setup

Download `ANTLR.jar` and put it in the lib folder.

Create `antlr.bat` file and put the following code.

```batch
java -cp .;.\lib\antlr4.jar org.antlr.v4.Tool %*
```

Create `grun.bat` file and put the following code.

```batch
java -cp .\lib\antlr4.jar org.antlr.v4.gui.TestRig %*
```

### Global Setup

Follow steps on [how to install antlr4](https://stackoverflow.com/questions/41021963/how-to-install-antlr4).

## Generate Lexer \& Parser

```bash
> antlr <FileName>.g4 -o out/
```

### Compile

```bash
> javac .\out\*.java
```

### GRUN

#### Tokens

```bash
> cd out
> grun <GrammarName> <Rule> -tokens ../<FileName>.txt
```

Example for `Hello`:

```bash
> grun Hello r -tokens ../Hello.txt
```

#### Tree

```bash
> cd out
> grun <GrammarName> <Rule> -tree ../<FileName>.txt
```

Example for `Hello`:

```bash
> grun Hello r -tree ../Hello.txt
```

#### GUI

```bash
> cd out
> grun <GrammarName> <Rule> -gui ../<FileName>.txt
```

Example for `Hello`:

```bash
> grun Hello r -gui ../Hello.txt
```
