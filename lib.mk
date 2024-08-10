JNI_INC_DIR		:=	/usr/lib/jvm/java-11-openjdk/include
JNI_PS_INC_DIR	:=	$(JNI_INC_DIR)/linux

LIB				:=	native

LIB_ROOT		:=	src/main/native

LIB_INC_DIR		:=	include
LIB_SRC_DIR		:=	src

LIB_FILES		:=	native
LIB_FILES		:=	$(addprefix $(LIB_ROOT)/$(LIB_SRC_DIR)/, $(addsuffix .c, $(LIB_FILES)))

LIB_OBJECTS		:=	$(LIB_FILES:$(LIB_ROOT)/$(LIB_SRC_DIR)/%.c=target/objects/%.o)

$(RESOURCE_DIR)/$(LIB).so: $(LIB_OBJECTS)
	@mkdir -p $(@D)
	$(CC) -shared -o $(RESOURCE_DIR)/$(LIB).so $(LIB_OBJECTS)

target/objects/%.o: $(LIB_ROOT)/$(LIB_SRC_DIR)/%.c
	@mkdir -p $(@D)
	$(CC) -c $< -o $@ -I$(LIB_ROOT)/$(LIB_INC_DIR) -I$(JNI_INC_DIR) -I$(JNI_PS_INC_DIR)
