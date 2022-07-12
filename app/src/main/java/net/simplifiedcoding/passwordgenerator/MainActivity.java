package net.simplifiedcoding.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button generate;
    Button save,savedpass;
    CheckBox symbols,numbers,uppercase,lowercase;
    TextView textView2;
    ArrayAdapter<String> arrayAdapter;
    String[] length={"1","2","3","4","5","6","7","8","9","10","11","12","13"};
    int leng=0;
    String savedpassword="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate=findViewById(R.id.generate);
        save=findViewById(R.id.save);
        savedpass=findViewById(R.id.savedpass);

        spinner=findViewById(R.id.spinner);
        arrayAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,length);
        spinner.setAdapter(arrayAdapter);

        symbols=findViewById(R.id.symbols);
        numbers=findViewById(R.id.numbers);
        uppercase=findViewById(R.id.uppercase);
        lowercase=findViewById(R.id.lowercase);

        textView2=findViewById(R.id.textView2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
             leng=i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //String symbol=symbols.getText().toString();
               // String number=numbers.getText().toString();
                //String upper=uppercase.getText().toString();
               // String lower=lowercase.getText().toString();
                if(symbols.isChecked())
                {
                    String allchar="!@#$%&*./";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                        textView2.setText(sb);
                }
                if(numbers.isChecked())
                {
                    String allchar="0123456789";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(uppercase.isChecked())
                {
                    String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(lowercase.isChecked())
                {
                    String allchar="abcdefghijklmnopqrstuvwxyz";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(numbers.isChecked() && symbols.isChecked())
                {
                    String allchar="0123456789!@#$%&*./";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(uppercase.isChecked() && symbols.isChecked())
                {
                    String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*./";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(lowercase.isChecked() && symbols.isChecked())
                {
                    String allchar="abcdefghijklmnopqrstuvwxyz!@#$%&*./";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(numbers.isChecked() && uppercase.isChecked())
                {
                    String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(numbers.isChecked() && lowercase.isChecked())
                {
                    String allchar="abcdefghijklmnopqrstuvwxyz0123456789";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(uppercase.isChecked() && lowercase.isChecked())
                {
                    String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(symbols.isChecked() && numbers.isChecked() && uppercase.isChecked() && lowercase.isChecked())
                {
                  String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*./";
                  StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                     textView2.setText(sb);
                }
                if(symbols.isChecked() && numbers.isChecked() && uppercase.isChecked() )
                {
                    String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*./";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(symbols.isChecked() &&  uppercase.isChecked() && lowercase.isChecked())
                {
                    String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&*./";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if( numbers.isChecked() && uppercase.isChecked() && lowercase.isChecked())
                {
                    String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }
                if(symbols.isChecked() && numbers.isChecked()  && lowercase.isChecked())
                {
                    String allchar="abcdefghijklmnopqrstuvwxyz0123456789!@#$%&*./";
                    StringBuilder sb=new StringBuilder();
                    SecureRandom random=new SecureRandom();
                    for(int i=0;i<=leng;i++) {
                        int index = random.nextInt(allchar.length());
                        sb.append(allchar.charAt(index));
                    }
                    textView2.setText(sb);
                }



                //String pass=Generate(leng);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                savedpassword=textView2.getText().toString();

            }
        });
        savedpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText(savedpassword);
            }
        });

    }
}