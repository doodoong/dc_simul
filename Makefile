all:
	javac -cp . -d class @source_list.txt

runslot:
	java -cp class slottedAloha.SlottedAloha

runcsma:
	java -cp class csmaCA.CsmaCA