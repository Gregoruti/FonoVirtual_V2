# CONTEXT.md

Este arquivo descreve o estado geral e a arquitetura planejada para o projeto FonoVirtual.

## Estado Atual do Projeto: Primeira Versão Depurável

O projeto evoluiu de um esqueleto estático para uma **primeira versão funcional e depurável**. As seguintes implementações foram concluídas:

*   **Navegação Funcional:** A `MainActivity` agora gerencia a navegação principal usando Jetpack Compose Navigation. O app inicia na `HomeScreen`.

*   **Modo de Depuração:** Foi adicionado um botão "Debug" na `HomeScreen`. Este botão navega para a nova `DebugScreen`, que serve como um painel para testes de módulos.

*   **Módulos Testáveis (Simulados):**
    *   **ASR e TTS:** Os módulos `SpeechRecognizer` e `TextToSpeechModule` agora contêm funções de teste (`startTestRecognition` e `startTestToSpeech`) que simulam seu comportamento e podem ser acionadas a partir da `DebugScreen`.
    *   **Status:** O status de validação desses módulos e das telas `MainActivity`, `HomeScreen` e `DebugScreen` foi atualizado para `Em Teste` no arquivo `VALIDATION_STATUS.md`.

*   **Documentação Sincronizada:** Todos os arquivos de documentação (`PATHS_FILES.md`, `PATHS_SCREENS.md`, `VALIDATION_STATUS.md`, `CHANGELOG.md`) foram atualizados para refletir esta nova estrutura.

## Arquitetura Modular Planejada

A seção a seguir detalha a arquitetura modular que continua a guiar o desenvolvimento. As implementações atuais são os primeiros passos para realizar esta visão.

### Visão Geral do Sistema
O FonoVirtual será dividido em módulos independentes e testáveis, cada um com responsabilidades específicas.

### 1. MÓDULO CORE - Gerenciamento Base
   - **1.1 Módulo de Inicialização e Configuração (`CoreInitializationModule.kt`):** Responsável por inicializar ASR, TTS, permissões e configurações gerais.
   - **1.2 Módulo de Gerenciamento de Estados (`StateManagerModule.kt`):** Gerenciador de estados globais da aplicação.

### 2. MÓDULOS DE INTERFACE E NAVEGAÇÃO
   - **2.1 Módulo de Navegação Principal (`MainActivity.kt`):** Gerencia a navegação entre telas com Jetpack Compose Navigation.
   - **2.2 Módulo de Seleção de Exercícios (`ExerciseSelectionModule.kt`):** Interface para o usuário selecionar exercícios.

### 3. MÓDULOS DE USUÁRIO E AUTENTICAÇÃO
   - **3.1 Módulo de Gerenciamento de Profissionais (`ProfessionalManagementModule.kt`):** Lida com o cadastro e perfil dos profissionais.
   - **3.2 Módulo de Gerenciamento de Pacientes (`PatientManagementModule.kt`):** Gerencia o cadastro e progresso dos pacientes.

### 4. MÓDULOS DE ASR E TTS
   - **4.1 Módulo de Reconhecimento de Voz (ASR) (`SpeechRecognizer.kt`):** Integração com o Vosk para reconhecimento de fala.
   - **4.2 Módulo de Síntese de Voz (TTS) (`TextToSpeechModule.kt`):** Geração de voz a partir de texto.

### 5. MÓDULOS DE EXERCÍCIOS
   - **5.1 Módulo de Treino de Palavras (`WordTrainingModule.kt`):** Exercícios de repetição de palavras.
   - **5.2 Módulo de Treino de Frases (`PhraseTrainingModule.kt`):** Exercícios de repetição de frases.
   - **5.3 Módulo de Exercícios de Respiração (`BreathingExerciseModule.kt`):** (Implementação Futura)
   - **5.4 Módulo de Articulação de Fonemas (`PhonemePracticeModule.kt`):** (Implementação Futura)

### 6. MÓDULOS DE CONTEÚDO E PERSONALIZAÇÃO
   - **6.1 Módulo de Gerenciamento de Conteúdo (`ContentManagementModule.kt`):** Permite que profissionais criem exercícios.
   - **6.2 Módulo de Associação Palavra-Imagem (`WordImageAssociationModule.kt`):** Exercícios de identificação de imagens.

### 7. MÓDULOS DE ANÁLISE E RELATÓRIOS
   - **7.1 Módulo de Analytics e Métricas (`AnalyticsModule.kt`):** Coleta e exibe métricas de progresso.
   - **7.2 Módulo de Relatórios Terapêuticos (`TherapeuticReportsModule.kt`):** Gera relatórios em PDF.

### 8. MÓDULOS DE INTEGRAÇÃO E UTILITÁRIOS
   - **8.1 Módulo de Armazenamento de Dados (`DataStorageModule.kt`):** Gerencia a persistência de dados.
   - **8.2 Módulo de Configurações e Preferências (`SettingsModule.kt`):** Interface para o usuário ajustar as configurações.

### 9. INTEGRAÇÃO ENTRE MÓDULOS
   - **9.1 Módulo de Orquestração de Exercícios (`ExerciseOrchestrationModule.kt`):** Coordena os módulos durante um exercício.
   - **9.2 Módulo de Sessão Terapêutica Completa (`TherapySessionModule.kt`):** Gerencia uma sessão de terapia completa.
