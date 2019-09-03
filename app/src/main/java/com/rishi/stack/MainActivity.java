package com.rishi.stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, push, pop;
    int push_count = 11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        push = findViewById(R.id.push);
        pop = findViewById(R.id.pop);

        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);

        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);

        b5.setVisibility(View.INVISIBLE);
        b6.setVisibility(View.INVISIBLE);

        b7.setVisibility(View.INVISIBLE);
        b8.setVisibility(View.INVISIBLE);

        b9.setVisibility(View.INVISIBLE);
        b10.setVisibility(View.INVISIBLE);

        b11.setVisibility(View.INVISIBLE);

        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("pushing", String.valueOf(push_count));

                if (push_count == 11) {
                    b11.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 10) {
                    b10.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 9) {
                    b9.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 8) {
                    b8.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 7) {
                    b7.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 6) {
                    b6.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 5) {
                    b5.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 4) {
                    b4.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 3) {
                    b3.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 2) {
                    b2.setVisibility(View.VISIBLE);
                    push_count--;
                } else if (push_count == 1) {
                    b1.setVisibility(View.VISIBLE);
                    push_count--;
                }else if(push_count == 0){
                    push_count = 1;
                    Toast.makeText(getApplicationContext(),"Stack Overflow",Toast.LENGTH_SHORT).show();

                }
            }
        });




        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("poping", String.valueOf(push_count));
                if(push_count < 11) {
                    push_count++;
                } else {
                    Toast.makeText(getApplicationContext(),"Stack Underflow",Toast.LENGTH_SHORT).show();

                }
                if(push_count == 1) {
                    b1.setVisibility(View.INVISIBLE);
               } else if(push_count == 2) {
                    b2.setVisibility(View.INVISIBLE);
              }else if(push_count == 3) {
                    b3.setVisibility(View.INVISIBLE);
                }else if(push_count == 4) {
                    b4.setVisibility(View.INVISIBLE);
                }else if(push_count == 5) {
                    b5.setVisibility(View.INVISIBLE);
                }else if(push_count == 6) {
                    b6.setVisibility(View.INVISIBLE);
                }else if(push_count == 7) {
                    b7.setVisibility(View.INVISIBLE);
                }else if(push_count == 8) {
                    b8.setVisibility(View.INVISIBLE);
                }else if(push_count == 9) {
                    b9.setVisibility(View.INVISIBLE);
                }else if(push_count == 10) {
                    b10.setVisibility(View.INVISIBLE);
                }else if(push_count == 11) {
                    b11.setVisibility(View.INVISIBLE);
                }

            }
        });
    }
}