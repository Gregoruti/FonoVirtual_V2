# CHANGELOG.md

Este arquivo registra as alterações no projeto.

## 0.2.1 - SplashScreen e HomeScreen

- **Adicionado:**
  - **SplashScreen:** Tela de abertura com imagem univesp.jpg, timer de 3s ou navegação por toque.
  - **HomeScreen:** Exibe apenas a versão atual do app.

- **Modificado:**
  - **Documentação:** Atualizados PATHS_FILES.md, PATHS_SCREENS.md e VALIDATION_STATUS.md para refletir as mudanças.

## 0.2.0 - Primeira Versão Depurável

- **Adicionado:**
  - **Modo de Depuração:** Implementada uma `DebugScreen` para testes isolados de módulos.
  - **Navegação Principal:** Configurado o Jetpack Compose Navigation na `MainActivity`.
  - **Módulo TTS:** Criado o `TextToSpeechModule.kt` com uma função de teste.
  - **Botão de Debug:** Adicionado um botão na `HomeScreen` para acessar a `DebugScreen`.

- **Modificado:**
  - **Módulo ASR:** Adicionada uma função de teste ao `SpeechRecognizer.kt`.
  - **Status de Validação:** Atualizado o status de módulos e telas para `Em Teste` no `VALIDATION_STATUS.md`.
  - **Documentação:** Todos os arquivos de documentação (`CONTEXT`, `PATHS_FILES`, `PATHS_SCREENS`) foram sincronizados com a nova estrutura.

## 0.1.0 - Início do Projeto

- **Adicionado:**
  - Estrutura inicial de documentação no diretório `/docs`.
  - Arquivos de documentação: `CONTEXT.md`, `PATHS_FILES.md`, `PATHS_SCREENS.md`, `VALIDATION_STATUS.md`, `CHANGELOG.md`.
