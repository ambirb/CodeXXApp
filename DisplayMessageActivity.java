package com.example.codexxapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        textView = (TextView) findViewById(R.id.textView);

        String chinese = "Are you on any medications?\n" +
                "您现在有服用任何药物吗？\n\n" +
                "What type of medication are you on?\n" +
                "您在用什么类型的药物？\n\n" +
                "How often do you take it?\n" +
                "您多久服用一次？\n\n" +
                "How often do you exercise?\n" +
                "您多久锻炼一次？\n\n" +
                "What sort of exercises do you do?\n" +
                "您做什么运动？\n\n" +
                "How long do you exercise for? \n" +
                "您一次会锻炼多长时间？\n\n" +
                "Do you smoke, drink alcohol, or use any drugs?\n" +
                "您吸烟，喝酒，或使用任何非法毒品吗？\n\n" +
                "How often do you drink alcohol?\n" +
                "您经常喝酒吗？\n\n" +
                "How often do you smoke?\n" +
                "您多久抽烟一次？\n\n" +
                "How often do you use drugs?\n" +
                "您多久用非法药品一次？\n\n" +
                "Are you feeling any abnormal pain or discomfort?\n" +
                "您是否感到任何异常疼痛或不适吗？\n\n" +
                "Where do you feel the pain or discomfort?\n" +
                "您在哪里感到疼痛或不适？\n\n" +
                "How long have you been feeling pain?\n" +
                "您感觉疼痛多久了？\n\n" +
                "Does the pain affect your daily activities?\n" +
                "疼痛会影响您的日常生活吗？\n\n" +
                "Does it hurt here?\n" +
                "这里疼吗？\n\n" +
                "We’ll need to run some tests.\n" +
                "我们需要运行一些测试。\n\n" +
                "We need to conduct a blood test.\n" +
                "我们需要进行验血.\n\n" +
                "We need to conduct a urine test.\n" +
                "我们需要进行尿检。\n\n" +
                "You need an ultrasound.\n" +
                "您需要一个超声波。\n\n" +
                "You need an x-ray.\n" +
                "您需要一个X光。\n\n" +
                "I will give you some antibiotics. Please use it as required.\n" +
                "我会给您一些抗生素。请您按照规定用。\n\n" +
                "Your medication with be in the pharmacy. You can get it on your way out. \n" +
                "您的药物可以在药房取。\n\n" +
                "Do you have any allergies?\n" +
                "您对什么东西有过敏吗？ \n\n" +
                "I would like to refer you to this specialist. They can further help you.\n" +
                "我想给您介绍一下这位专家。他们可以进一步帮助您。\n\n" +
                "Are you sexually active?\n" +
                "您性生活活跃吗?\n\n" +
                "When did your period start?\n" +
                "您的时期是什么时候开始的？\n\n" +
                "When was the last time you had your period?\n" +
                "您的时期最近什么时候来的？\n\n" +
                "How often does your period come?\n" +
                "您的时期多久来一次？\n\n" +
                "How long does it last each time?\n" +
                "每一次持续多长时间？\n";

        textView.setText(chinese);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
