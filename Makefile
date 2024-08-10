TARGET	:=	target/cli-pong-1.0.jar

SOURCE_PATH	:=	src/main/java/org/tr0nscendence/clipong/

FILES	:=	Main

FILES	:=	$(addsuffix .java, $(addprefix $(SOURCE_PATH), $(FILES)))

.PHONY: all run clean

all: $(TARGET)

run: $(TARGET)
	@java -jar $(TARGET)

clean:
	@mvn clean

$(TARGET): $(FILES)
	@mvn package
