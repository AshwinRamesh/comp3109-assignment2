#program could be name of statement to use

export CLASSPATH=".:$HOME/uni/paradigms/antlr/antlr-4.1-complete.jar:$CLASSPATH"
alias antlr4="java -jar $HOME/uni/paradigms/antlr/antlr-4.1-complete.jar"
alias grun='java org.antlr.v4.runtime.misc.TestRig'
antlr4 $1.g && javac $1*.java && echo ">" && grun $1 program -tree

