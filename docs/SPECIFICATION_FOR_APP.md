# SPECIFICATION_FOR_APP.MD
# Propósito: Contém TODAS as especificações, funcionalidades, regras e o contexto
#            detalhado EXCLUSIVAMENTE para o projeto "Fonoaudióloga Virtual" (App X).
#
# Este arquivo é a fonte PRIMÁRIA para entender o escopo e os detalhes de
# implementação do App X.
#
# Interconexões da Documentação (Estrutura Proposta):
#
#   SPECIFICATION_FOR_APP.MD (Este Arquivo - Detalhes do App X)
#             ^
#             | (Informa)
#             |
#   CONTEXT.MD (Regras Gerais de Dev e Docs) <-----> RULES_FILE.MD (Guia Operacional IA)
#       |         |                                      ^
#       |         | (Aplica-se a)                        | (Consulta)
#       +---------+--------------------------------------+
#                 |
#                 V (Exemplificado por / Aplicado a)
#   PATHS_FILES.MD / PATHS_SCREENS.MD / VALIDATION_STATUS.MD / CHANGELOG.MD
#
# Legenda: Define o escopo, funcionalidades e o progresso do App X.
# ---
Sempre responda em Português do Brasil

Você é um Code Assistant que deve manter atualizado este arquivo de especificações
do App "Fonoaudióloga Virtual" (App X). Sua tarefa é **adicionar, remover ou atualizar**
seções sempre que novos módulos, funcionalidades, regras ou decisões arquiteturais
específicas deste projeto forem criadas. Respeite a estrutura em tópicos e escreva
de forma clara e organizada.

# Especificações do Aplicativo: Fonoaudióloga Virtual (App X)

## Visão Geral e Objetivos do Projeto "Fonoaudióloga Virtual"

Este projeto é um aplicativo Android, "Fonoaudióloga Virtual" (App X),
cujo objetivo é auxiliar pacientes com exercícios de fonoaudiologia através de:

-   Reconhecimento de voz offline (usando Vosk PT-BR).
-   Text-to-Speech (TTS) para fornecer instruções em áudio.
-   Interface amigável, acessível e intuitiva para pacientes e profissionais.
-   Registro de progresso do usuário (futuro módulo).
-   Futuras integrações com IA para feedback inteligente.

Sempre solicite o Contexto do Projeto (este arquivo) para poder iniciar o
desenvolvimento da aplicação.
E também considere a "Documentação Estrutural" (outros arquivos em /docs) a ser
fornecida e mantida para o desenvolvimento detalhado de acordo com as regras gerais
(que futuramente estarão em CONTEXT.MD).

## Funcionalidades Planejadas (FINAL_TARGET)

Esta seção descreve a visão de longo prazo para o App "Fonoaudióloga Virtual".

-   **Módulo de Cadastro e Perfis de Usuário:** Pacientes e Profissionais.
-   **Módulo de Exercícios Abrangente:** Diversos tipos, configurações, instruções claras.
-   **Módulo ASR Avançado:** Análise de pronúncia.
-   **Módulo TTS Configurável:** Opções de voz/velocidade.
-   **Módulo de Análise e Relatórios de Progresso:** Gráficos, relatórios detalhados.
-   **Módulo de Gamificação:** Elementos para engajamento.
-   **Outros Módulos Futuros:** Conforme detalhado na seção "Contexto do Projeto" original.

## Funcionalidades Desenvolvidas e Validadas (DEVELOPED)

Baseado no estado anterior do projeto (FonoVirtual_V2 v1.0.1):

-   **Versão 0.2.1:**
    -   `SplashScreen.kt`: Tela de abertura inicial. (Validado)
-   **Versão 0.4.0:**
    -   `TextToSpeechModule.kt`: Módulo de Síntese de Fala funcional. (Validado)
    -   UI para Teste de TTS (`TtsTestScreen.kt`, `TtsTestViewModel.kt`). (Validado)
    -   Navegação para Tela de Teste TTS via `DebugScreen.kt`. (Validado)
-   **Versão 1.0.0 (Parcial):**
    -   `HomeScreen.kt`: Exibição de versão dinâmica. (Validado)
    -   `DebugScreen.kt`: Navegação para placeholder ASR (substituído em v1.0.1). (Validado)
-   **Versão 1.0.1:**
    -   Navegação Principal (`MainActivity.kt`): Rota para `AsrTestScreen.kt`. (Validado)
    -   Recursos de String (`strings.xml`): Strings para `AsrTestScreen`. (Validado)
    -   Build do Projeto (`app/build.gradle.kts`): `versionName` "1.0.1". (Validado)
-   **Versão 1.0.2:**
    -   Módulo Speech (ASR - `VoskAsrModule.kt`): Funcional com permissões. (Validado)
    -   UI de Teste ASR (`AsrTestScreen.kt`, `AsrTestViewModel.kt`): Completa e funcional. (Validado)
-   **Versão 1.0.3:**
    -   **Exercício de Reconhecimento Simples:** Funcionalidade completa implementada e validada.
        -   `SimpleRecognitionExerciseScreen.kt`: Tela de exercício com seleção de sílabas. (Validado)
        -   `SimpleRecognitionExerciseViewModel.kt`: Lógica de negócio e estatísticas. (Validado)
        -   `ExerciseResultScreen.kt`: Tela de resultados com percentual de acerto. (Validado)
        -   `WordsRepository.kt`: Repositório de palavras por número de sílabas. (Validado)
        -   `WordExercise.kt`: Modelo de dados para exercícios. (Validado)
        -   Navegação integrada via `MainActivity.kt` com parâmetros de resultado. (Validado)
        -   Integração ASR contínua (escuta automática sem botão). (Validado)
        -   Cálculo automático de estatísticas (acertos, erros, percentual). (Validado)
        -   Interface visual limpa com cores padrão do app. (Validado)
    -   **HomeScreen Modernizada:** Interface com modo escuro implementada e validada.
        -   Modo escuro com fundo preto e textos brancos. (Validado)
        -   Reorganização de botões: Cadastro, Teste Rápido, Atividades, Resultados, Debug. (Validado)
        -   Layout otimizado com botões de largura uniforme. (Validado)
        -   Tipografia melhorada com centralização e contraste adequado. (Validado)
    -   **Banco de Palavras Finalizado:** Repositório de palavras completamente estruturado e validado.
        -   2 sílabas: casa, bola, pato, mesa, vida. (Validado)
        -   3 sílabas: projeto, caminhar, trabalho, médico, música. (Validado)
        -   4 sílabas: computação, integrado, chocolate, telefone, abacaxi. (Validado)
        -   5 sílabas: geografia, matemática, aplicativo, comunicação, universidade. (Validado)
-   **Versão 1.0.4:**
    -   **Sistema de Tema Claro:** Conversão completa do aplicativo para modo claro implementada e validada.
        -   `Theme.kt`: Sistema de cores claro forçado independente das configurações do sistema. (Validado)
        -   Esquema de cores otimizado: fundo branco, textos pretos, cor primária azul mantida. (Validado)
        -   `HomeScreen.kt`: Interface convertida para modo claro com fundo branco e textos pretos. (Validado)
        -   Compatibilidade mantida com todas as telas existentes via MaterialTheme. (Validado)
        -   Legibilidade e contraste otimizados para melhor experiência do usuário. (Validado)
        -   Interface consistente e profissional em todo o aplicativo. (Validado)

## Funcionalidades em Desenvolvimento (UNDER_DEVELOPMENT)

Atualmente não há funcionalidades em desenvolvimento ativo. O projeto está estável na versão 1.0.4.

**Próximas funcionalidades planejadas para implementação:**
-   Exercício de Repetição de Frases (v1.1.0)
-   Exercício de Pares Mínimos (v1.1.1)
-   Sistema de Progressão do Usuário (v1.2.0)
