test:
	mkdir -p out
	find . | grep java > sources.txt
	javac @sources.txt -sourcepath src -d out
