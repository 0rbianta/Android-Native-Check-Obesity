#include <jni.h>
#include <string>

using namespace std;

extern "C"
JNIEXPORT jstring JNICALL
Java_basic_orbianta_fun_MainActivity_calculate(JNIEnv *env, jobject thiz, jfloat j1, jfloat j2) {


    float body_mass_index = j1/(j2*j2);

    string return_val;

    if(body_mass_index<18.5){
        return_val="weak";
    }else if(18.5<body_mass_index<24.9){
        return_val="normal weight";
    }else if(25<body_mass_index<29.9){
        return_val="overweight";
    }else if(30<body_mass_index<39.9){
        return_val="obese";
    }else if(40<body_mass_index<50){
        return_val="morbidly obese";
    }else{
        return_val="super obese";
    }

    return env->NewStringUTF(return_val.c_str());


}