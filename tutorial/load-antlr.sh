mkdir -p ~/uni/paradigms/antlr
curl -s http://antlr4.org/download/antlr-4.1-complete.jar > ~/uni/paradigms/antlr/antlr-4.1-complete.jar
export CLASSPATH=".:$HOME/uni/paradigms/antlr/antlr-4.1-complete.jar:$CLASSPATH"
alias antlr4="java -jar $HOME/uni/paradigms/antlr/antlr-4.1-complete.jar"
alias grun='java org.antlr.v4.runtime.misc.TestRig'
