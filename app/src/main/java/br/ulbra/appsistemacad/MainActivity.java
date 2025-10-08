package br.ulbra.appsistemacad;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import java.util.ArrayList;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    // A lista que irá armazenar TODOS os usuários cadastrados.
    // Fica na MainActivity para que os dados persistam enquanto o app estiver aberto.
    private ArrayList<Registro> aRegistro;


    // Declaração das nossas classes de controle de tela
    TelaPrincipal tela_principal;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1. Inicializa a lista de registros em memória
        aRegistro = new ArrayList<Registro>();


        // 2. Cria as instâncias das classes que gerenciam as telas
        tela_principal = new TelaPrincipal(this);
        tela_cadastro = new TelaCadastroUsuario(this, tela_principal);

        tela_listagem = new TelaListagemUsuarios(this, tela_principal);


        // 3. Informa para a tela principal quais são as outras telas
        //    para que ela possa navegar para elas.
        tela_principal.setTelaCadastro(tela_cadastro);
        tela_principal.setTelaListagem(tela_listagem);


        // 4. Carrega a tela principal para iniciar a aplicação
        tela_principal.CarregarTela();
    }


    // Método para que as outras classes possam acessar a lista de registros
    public ArrayList<Registro> getRegistros() {
        return aRegistro;
    }


    // Método utilitário para exibir mensagens de aviso
    public void ExibirMensagem(String msg) {
        AlertDialog.Builder d = new AlertDialog.Builder(MainActivity.this);
        d.setTitle("Aviso");
        d.setMessage(msg);
        d.setNeutralButton("OK", null);
        d.show();
    }
}















