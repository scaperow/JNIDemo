LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := sub
LOCAL_LDLIBS +=  -llog -ldl
LOCAL_SRC_FILES :=\csub.c\sub.cpp

include $(BUILD_SHARED_LIBRARY)
