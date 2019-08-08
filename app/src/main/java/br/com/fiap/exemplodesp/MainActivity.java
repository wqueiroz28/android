package br.com.fiap.exemplodesp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtSenha;
    CheckBox chkManterConectado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        chkManterConectado = findViewById(R.id.chkManterConectado);

    }

    public void login(View view) {

        String usuario = edtUsuario.getText().toString().trim();
        String senha = edtSenha.getText().toString();
        boolean manterConectado = chkManterConectado.isChecked();

        if (usuario.isEmpty() || senha.isEmpty()) {
            Toast.makeText(this, "Informe os dados corretamente", Toast.LENGTH_LONG).show();
            return;
        }
        if (usuario.equals("fiap") && senha.equals("fiap")) {
            if (manterConectado) {

            }

        }
    }
}
