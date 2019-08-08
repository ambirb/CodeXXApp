package com.example.codexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Spanish extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish);

        textView2 = (TextView) findViewById(R.id.textView2);

        String spanish = "Are you on any medications?\n" +
                "¿Estás tomando algún medicinas? \n\n" +
                "What type of medication are you on?\n" +
                "¿En qué tipo de medicinas estás? \n\n" +
                "How often do you take it?\n" +
                "¿Con qué frecuencia lo tomas? \n\n" +
                "How long have you been on it?\n" +
                "¿Cuánto tiempo llevas en él? \n\n" +
                "How often do you exercise?\n" +
                "¿Con qué frecuencia haces ejercicio? \n\n" +
                "What sort of exercises do you do?\n" +
                "¿Qué tipo de ejercicios haces? \n\n" +
                "How long do you exercise for? \n" +
                "¿Cuánto tiempo haces ejercicio? \n\n" +
                "Do you smoke, drink alcohol, or use any drugs?\n" +
                "Fuma, bebe alcohol o usa drogas? \n\n"+
                "How often do you drink alcohol?\n"+
                "¿Con qué frecuencia bebes alcohol? \n\n"+
                "How often do you smoke?\n"+
                "¿Con qué frecuencia fumas? \n\n"+
                "How often do you use drugs?\n"+
                "¿Con qué frecuencia usas drogas? \n\n"+
                "Are you feeling any abnormal pain or discomfort?\n"+
                "¿Siente algún dolor o molestia anormal?\n\n"+
                "Where do you feel the pain or discomfort?\n"+
                "¿Dónde sientes el dolor o la incomodidad? \n\n"+
                "How long have you been feeling pain?\n"+
                "¿ Cuánto tiempo llevas sintiendo dolor? \n\n"+
                "Does the pain affect your daily activities?\n"+
                "¿El dolor afecta tus actividades diarias?\n\n"+
                "Does it hurt here?\n"+
                "¿Duele aquí?\n\n"+
                "We need to conduct a blood test.\n"+
                "Tenemos que hacer un análisis de sangre. \n\n"+
                "We need to conduct a urine test.\n"+
                "Tenemos que hacer nos de una prueba de orina.\n\n"+
                "You need an ultrasound.\n"+
                "Necesitas una ecografía.\n\n"+
                "You need an x-ray.\n"+
                "Necesitas una radiografía.\n\n"+
                "I will give you some antibiotics. Please use it as required.\n"+
                "Te daré antibióticos. Por favor, úselo según sea necesario. \n\n"+
                "Your medication with be in the pharmacy. You can get it on your way out. \n"+
                "Tu medicación esté en la farmacia. Puedes conseguirlo cuando salgas.\n\n"+
                "Do you have any allergies?\n"+
                "Tienes alguna alergia? \n\n"+
                "I would like to refer you to this specialist. They can further help you.\n"+
                "Me gustaría referirte a este especialista. Pueden ayudarte aún más.\n\n"+
                "Are you sexually active?\n"+
                "¿Eres sexualmente activo? \n\n"+
                "When did your period start?\n" +
                "¿Cuándo empezó tu período menstrual? \n\n" +
                "When was the last time you had your period?\n" +
                "¿Cuándo fue la última vez que tuviste tu periodo? \n\n" +
                "How often does your period come?\n" +
                "¿Con qué frecuencia llega el período menstrual? \n\n"+
                "How long does it last each time?\n"+
                "¿Cuánto dura cada vez?\n";

        textView2.setText(spanish);
        textView2.setMovementMethod(new ScrollingMovementMethod());
    }
}
