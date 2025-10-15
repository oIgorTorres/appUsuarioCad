## 🧠 Sobre o Projeto

A **O appUsuarioCad** é um app educacional voltado para o aprendizado de:

- Estrutura básica de um projeto Android (Activities, Layouts e Drawables)
- Lógica de programação
- Calculos matemáticos
- Layouts distintos
- Classes java

---

- ## 🛠️ Tecnologias Utilizadas


| Categoria | Ferramenta |
|------------|-------------|
| IDE | Android Studio |
| Linguagem | Java |
| Layouts | XML |
| Versão mínima Android | API 21 (Android 5.0 Lollipop) |
| Estrutura de UI | ConstraintLayout / LinearLayout |
| Recursos gráficos | Drawable Resources |

---

## 📱 Estrutura do Projeto

```
app/
 ├── java/
 │    └── br/ulbra/appUsuarioCad/
 │         └── MainActivity.java
 │         ├── Registro.java
 │         ├── TelaCadastroUsuario.java
 │         ├── TelaListagemUsuarios.java
 │         └── TelaPrincipal.java
 ├── res/
 │    ├── layout/
 │    │     └── activity_main.xml
 │    │     ├── cadastro_de_usuarios.xml
 │    │     ├── listagem_usuarios_cadastrados.xml
 │    │     └── tela_principal.xml
 │    ├── drawable/
 │    │     ├── ic_launcher_background.xml
 │    │     └── ic_launcher_foreground.xml
 │    └── values/
 │          └── strings.xml
 │          └── colors.xml
 │          └── themes.xml
 └── AndroidManifest.xml
```

---

## 🧰 Estrutura XML

O layout inicial (`tela_principal.xml`) contém:
- 2 botões (um para cadastrar um usuario e outro para consultar)
- 1 TextView

---

## 🧰 Estrutura XML

O layout cadastro (`cadastro_de_usuarios.xml`) contém:
- 3 Plains Text (um para nome, telefone e endereco)
- 1 TextView
- 2 Botões (um para registrar e outro para cancelar o registro)

---

## 🧰 Estrutura XML

O layout consulta (`listagem_usuarios_cadastrados.xml`) contém:
- Tabelas (que irão sendo adicionadas conforme os usuários são cadastrados)
- Observação: As tabelas exibem os dados do usuário, como nome, telefone e endereço.

---

## 👩‍💻 Autor / Equipe

**Nome:** *Igor Torres Dias*  
**Instituição:** *Curso Técnico em Informática – Colégio São Lucas*  
**Disciplina:** *Desenvolvimento Mobile Android*  
**Professor:** *Jeferson Leon*  

---

## 📚 Licença

Este projeto foi desenvolvido para fins **educacionais**.  
Você pode modificar, reutilizar e distribuir livremente o código, mantendo os devidos créditos.
